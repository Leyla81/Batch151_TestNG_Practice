package tests.day01;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBase;

public class C03_SoftAssert extends TestBase {

    // "https://amazon.com" sayfasına gidiniz
    /// Title'in "Amazon" icerdigini test edin
    /// Arama kutusunun erisilebilir oldugunu test edin
    // Arama kutusuna nutella yazıp aratın
    /// Sonuc yazısının gorunur oldugunu test edin
    /// Sonuc yazısının "Nutella" icerdigini test edin

    // test islemlerini softAssert ile yapınız ve hatalar icin mesaj versin


    @Test
    public void test01() {

        // "https://amazon.com" sayfasına gidiniz
        driver.get("https://amazon.com");

        // Title'in "Amazon" icerdigini test edin
        SoftAssert softAssert = new SoftAssert();
        // softAssert instance oldugu icin ilk once obje olusturulur.

        String  amazonTitle = driver.getTitle();

        softAssert.assertTrue(amazonTitle.contains("Amazon"),"TİTLE AMAZON İCERMİYOR");

        /// Arama kutusunun erisilebilir oldugunu test edin
        WebElement aramaKutusu = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

        softAssert.assertTrue(aramaKutusu.isEnabled(),"ARAMA KUTUSUNA ERİSİLEMİYOR");


        // Arama kutusuna nutella yazıp aratın
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);

        /// Sonuc yazısının gorunur oldugunu test edin
        WebElement sonucYazisi = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));

        softAssert.assertTrue(sonucYazisi.isDisplayed(),"SONUC YAZISI GORUNMUYOR");


        /// Sonuc yazısının "Nutella" icerdigini test edin

        softAssert.assertTrue(sonucYazisi.getText().contains("Nutella"),"SONUC YAZISI NUTELLA İCERMİYOR");




        softAssert.assertAll();
        // assertAll() yazıp tum hataları listelemesini istemeliyiz. Aksi halde hata vermez.



        /*
        Junit'te Assert kullandıgımızda Assert faild oldugu anda test calısmayı durduruyordu.
        Ve geri kalanını calıstırmıyordu.

        TestNG'de hem Assert, hem softAssert yapıları var.
        Test sonuna kadar calıssın, testin sonunda tum hataları listelesin istiyorsak softAssert kullanırız.
         */



    }
}