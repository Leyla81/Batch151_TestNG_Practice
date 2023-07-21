package tests.day01;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FaceBookPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C04_PageClassKullanimi {
    @Test
    public void test01() {

        // facebook anasayfaya gidin
Driver.getDriver().get(ConfigReader.getProperty("facebookUrl"));

        // kullanıcı email kutusuna rastgele bir isim yazın
        FaceBookPage faceBookPage = new FaceBookPage();
        faceBookPage.email.sendKeys("Ahmet");

        // kullanıcı sifre kutusuna rastgele bir password yazın
        faceBookPage.password.sendKeys("123456");

        // giris yap butonuna tıklayın
        faceBookPage.login.click();

        // lutfen bu hesabı baska sekilde tanımla yazı elementinin, gorunur oldugunu test edin
        Assert.assertTrue(faceBookPage.baskaSekildeTanimlaYaziElementi.isDisplayed());


        // sayfayı kaptın
        Driver.closeDriver();



    }


}
