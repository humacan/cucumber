package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.DatabasPage;
import utilities.ConfigReader;
import utilities.Driver;

public class DatatablesStepdefinitions {
    DatabasPage databasPage=new DatabasPage();

    @Given("kullanici  \"DataBase\" adresine gider")
    public void kullanici_DataBase_adresine_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("DataBase"));
    }

    @Then("new butonuna basar")
    public void new_butonuna_basar() {
        databasPage.new_butonuna_basar.click();

    }
    @Then("tum bilgileri girer")
    public void tum_bilgileri_girer() {
        databasPage.tum_bilgileri_girer.click();
        Actions actions=new Actions(Driver.getDriver());

        //databasPage.tum_bilgileri_girer.sendKeys("huma");
        actions.sendKeys("huma").sendKeys(Keys.TAB).sendKeys("can").sendKeys(Keys.TAB).sendKeys("student").sendKeys(Keys.TAB).sendKeys("istanbul")
        .sendKeys(Keys.TAB).sendKeys("tr").sendKeys(Keys.TAB).sendKeys("2007-10-09").sendKeys(Keys.TAB).sendKeys("20000").perform();

    }
    @Then("Create tusuna basar")
    public void create_tusuna_basar() {
        databasPage.create_tusuna_basar.click();


    }
    @When("kullanici ilk isim ile arama yapar")
    public void kullanici_ilk_isim_ile_arama_yapar() {
        databasPage.kullanici_ilk_isim_ile_arama_yapar.sendKeys("huma");


    }
    @Then("isim bolumunde isminin oldugunu dogrula")
    public void isim_bolumunde_isminin_oldugunu_dogrula() {

        String yazi=databasPage.isim_bolumunde_isminin_oldugunu_dogrula.getText();
        Assert.assertTrue(yazi.contains("huma"));


    }
}
