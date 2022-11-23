package responsive;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Responsive {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test(testName = "Validar adição de item em carrinho - mobile")
    public void test_mobile_add_item() {
        driver.manage().window().setSize(new Dimension(320, 800));
        
    }

    @Test(testName = "Validar adição de item em carrinho - tablet")
    public void test_tablet_add_item() {
        driver.manage().window().setSize(new Dimension(768, 800));
    }

    @Test(testName = "Validar adição de item em carrinho - desktop")
    public void test_desktop_add_item() {
        driver.manage().window().setSize(new Dimension(1280, 800));
    }

}
