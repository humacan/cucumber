package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DatabasPage {
    public DatabasPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class='dt-button buttons-create']")
    public WebElement  new_butonuna_basar;

    @FindBy(xpath = "//*[@id='DTE_Field_first_name']")
    public WebElement  tum_bilgileri_girer;


    @FindBy(xpath = "//*[@class='btn']")
    public WebElement create_tusuna_basar;

    @FindBy(xpath = "//*[@type='search']")
    public WebElement kullanici_ilk_isim_ile_arama_yapar;

    @FindBy(xpath = "//td[@class='sorting_1']")
    public WebElement isim_bolumunde_isminin_oldugunu_dogrula;

}
