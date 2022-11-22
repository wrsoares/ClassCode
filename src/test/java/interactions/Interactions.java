package interactions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static Utils.Utils.*;

public class Interactions {

    WebDriver driver;
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test(testName = "Example test interactions")
    public void test_interactions() throws InterruptedException {
//        driver.get("https://ge.globo.com/futebol/selecao-brasileira/");
        driver.navigate().to("https://ge.globo.com/");
        Thread.sleep(1000);
        driver.navigate().to("https://ge.globo.com/futebol/selecao-brasileira/");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().forward();
        refreshPage(driver);
    }

    @Test(testName = "Example test alerts")
    public void test_alerts() throws InterruptedException {
        driver.get("https://www.selenium.dev/documentation/webdriver/interactions/alerts/");
        elementClick(driver, By.cssSelector("body > div > div.td-main > div > main > div > p:nth-child(15) > a"));
        Alert alert = driver.switchTo().alert();
        Thread.sleep(5000);
        System.out.println("Texto do Alerta: " + alert.getText());
//        Assert.assertTrue(alert.getText().contains("S"));
//        Assert.assertEquals(alert.getText(), "Sample alert", "O texto não é igual");
        alert.sendKeys("Tá todo morto de cansado");
        Thread.sleep(5000);
        alert.accept();
    }

    @Test(testName = "Frame testing")
    public void test_frame() throws InterruptedException {
        driver.get("https://www.capital.sp.gov.br");
        Actions actions = new Actions(driver);
        WebElement frame = getElement(driver, By.cssSelector("#e01e64e1-b605-4e97-a2f1-e4a9f7ec1513 > div > div.collection-item > iframe"));
        driver.switchTo().frame(frame);
        WebElement play = getElement(driver, By.cssSelector("#movie_player > div.ytp-cued-thumbnail-overlay > button"));
        actions.scrollToElement(play).perform();
        actions.click(play).perform();
        Thread.sleep(5000);
    }

    @Test(testName = "window")
    public void TESTNAME() {

    }

}