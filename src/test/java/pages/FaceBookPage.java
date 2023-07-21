package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FaceBookPage {



    public FaceBookPage (){
       PageFactory.initElements(Driver.getDriver(),this);
    }

    // kullanıcı email kutusuna rastgele bir isim yazın
   @FindBy(xpath =  "//input[@name='email']")
   public WebElement email;

    // kullanıcı sifre kutusuna rastgele bir password yazın
    @FindBy(xpath = "//input[@id='pass']")
    public WebElement password;

    // giris yap butonuna tıklayın
    @FindBy(xpath = "//button[@name='login']")
    public WebElement login;

    // lutfen bu hesabı baska sekilde tanımla yazı elementinin, gorunur oldugunu test edin
    @FindBy(xpath = "//h2[@class='uiHeaderTitle']")
    public WebElement baskaSekildeTanimlaYaziElementi;










}
