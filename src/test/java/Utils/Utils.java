package Utils;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Utils {

    public static void scrollPage(WebDriver driver, String pixels) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("window.scrollBy(0,"+ pixels +")");
    }

    public static WebElement getElement(WebDriver driver, By by) {
        WebElement element = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(by));
        return element;
    }

    public static void elementClick(WebDriver driver, By by) {
        WebElement element = getElement(driver, by);
        element.click();
    }

    public static void elementClear(WebDriver driver, By by) {
        WebElement element = getElement(driver, by);
        element.clear();
    }

    public static void elementSendKeys(WebDriver driver, By by, String text) {
        WebElement element = getElement(driver, by);
        element.click();
        element.clear();
        element.sendKeys(text);
    }

    public static void elementSendKeys(WebDriver driver, By by, String text, Keys key) {
        WebElement element = getElement(driver, by);
        element.click();
        element.clear();
        element.sendKeys(text, key);
    }

}
