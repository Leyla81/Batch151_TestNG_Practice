package tests.day01;

import org.testng.annotations.Test;
import utilities.TestBase;

public class C01_PriorityNT extends TestBase {


    // amazon isimli bir test methodu olusturunuz. Ve amazona gidiniz
    @Test(priority = -2)//2.bu calısır
    public void amazon() {
        driver.get("https://www.amazon.com");
    }

    // bestbuy isimli bir test methodu olusturunuz. Ve bestbuy'a gidiniz
    @Test
    public void bestBuy() { //default olarak 0 atar ensoon calısır
        driver.get("https://www.bestbuy.com");
    }

    // techproeducation isimli bir test methodu olusturunuz. Ve techproeducation'a gidiniz
    @Test(priority = -5)//once bu
    public void techproeducation() {
        driver.get("https://techproeducation.com");

    }
    // once techproeducation, sonra amazon, sonra bestbuy test methodu calısacak sekilde sıralama yapınız

    /*
    TestNG, test methodlarını isim sırasına gore calıstırır
    eger isim sıralamasının dısında bir sıralama ile calısmasını isterseniz
    o zaman test methodlarına oncelik(priority) tanımlayabiliriz.


    priority kucukten buyuge gore calısır
    eger bir test methoduna priority degeri atanmamıssa
    default olarak priority=0 kabul edilir.

     */












}
