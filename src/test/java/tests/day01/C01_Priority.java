package tests.day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.time.Duration;

public class C01_Priority extends TestBase {
    WebDriver driver;
    @BeforeClass
    public void beforeClass() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @AfterClass
    public void afterClass() {
        driver.close();
    }

    @Test
    public void test01() {

        driver.get("https://amazon.com");
    }

    @Test(dependsOnMethods = "test01")
    public void test02() {
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella", Keys.ENTER);
    }

    @Test(dependsOnMethods = "test02")
    public void test03() {
        WebElement sonucYazisi = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        Assert.assertTrue(sonucYazisi.getText().contains("Nutella"));
    }
}
