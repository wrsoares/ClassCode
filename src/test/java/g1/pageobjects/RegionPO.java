package g1.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegionPO {

    WebDriver driver;

    public RegionPO(WebDriver driver) {
        this.driver = driver;
    }

    public void selectOptionRegion() {
        WebElement element = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(
                        By.cssSelector("#menu-1-regioes > a > span.menu-item-title")));
        element.click();
    }

}
