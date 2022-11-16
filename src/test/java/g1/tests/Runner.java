package g1.tests;

import g1.pageobjects.HomePO;
import g1.pageobjects.MenuPO;
import g1.pageobjects.RegionPO;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Runner {

    WebDriver driver;

    @BeforeMethod
    public void setUpDriver() {
        System.setProperty("webdriver.chrome.driver",
                "/Users/williamsoares/Documents/Selenium/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://g1.globo.com");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void validateHomeCe() throws InterruptedException {
        HomePO homePO = new HomePO(driver);
        homePO.btnMenu();
        Thread.sleep(2000);
        MenuPO menuPO = new MenuPO(driver);
        menuPO.selectRegion();
        Thread.sleep(2000);
        RegionPO regionPO = new RegionPO(driver);
        regionPO.selectOptionRegion();
    }

}
