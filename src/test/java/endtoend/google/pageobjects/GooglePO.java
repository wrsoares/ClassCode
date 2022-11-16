package endtoend.google.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static Utils.Utils.*;

public class GooglePO {

    WebDriver driver;

    public GooglePO(WebDriver driver) {
        this.driver = driver;
    }

    public void validatePage() {
        WebElement img = getElement(driver, By.cssSelector("body > div.L3eUgb > div.o3j99.LLD4me.yr19Zb.LS8OJ > div > img"));
        boolean isDisplayed = img.isDisplayed();
        Assert.assertTrue(isDisplayed, "A imagem não carregou. Falhou!!!");
    }

    public void btnSearch() {
        elementClick(driver, By.cssSelector("body > div.L3eUgb > div.o3j99.ikrT4e.om7nvf > form > div:nth-child(1) > div.A8SBwf > div.FPdoLc.lJ9FBc > center > input.gNO89b"));
    }

    public void btnLucky() {
        elementClick(driver, By.name("body > div.L3eUgb > div.o3j99.ikrT4e.om7nvf > form > div:nth-child(1) > div.A8SBwf > div.FPdoLc.lJ9FBc > center > input.RNmpXc"));
    }

    public void sendTextSearch(String text) {
        elementSendKeys(driver, By.cssSelector("body > div.L3eUgb > div.o3j99.ikrT4e.om7nvf > form > div:nth-child(1) > div.A8SBwf > div.RNNXgb > div > div.a4bIc > input"), text);
    }

    public void sendTextSearch(String text, Keys key) {
        elementSendKeys(driver, By.name("q"), text, key);
    }

    public void searchButtonSearch(String text) {
        validatePage();
        sendTextSearch(text);
        btnSearch();
    }

    public void searchButtonLucky(String text) {
        validatePage();
        sendTextSearch(text);
        btnLucky();
    }

    public void searchEnter(String text) {
        validatePage();
        sendTextSearch(text, Keys.ENTER);
    }

    public void searchWithoutValue() {
        validatePage();
        btnSearch();
    }

    public void searchWithoutValueLucky() {
        validatePage();
        btnLucky();
    }

    public void searchUrl(String text) {
        validatePage();
        driver.get("https://www.google.com/search?q="+text+"");
    }

}
