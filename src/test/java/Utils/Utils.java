package Utils;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class Utils {

    public static void scrollPage(WebDriver driver, String pixels) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("window.scrollBy(0," + pixels + ")");
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
    public static void refreshPage(WebDriver driver) {
        driver.navigate().refresh();
    }

    public static ChromeOptions responsive(int width, int height) {
        Map<String, Object> deviceMetrics = new HashMap<>();
        deviceMetrics.put("width", width);
        deviceMetrics.put("height", height);
        deviceMetrics.put("pixelRatio", 3.0);
        Map<String, Object> mobileEmulation = new HashMap<>();
        mobileEmulation.put("deviceMetrics", deviceMetrics);
        mobileEmulation.put("userAgent", "Mozilla/5.0 (Linux; Android 8.0.0;" +
                "Pixel 2 XL Build/OPD1.170816.004) AppleWebKit/537.36 (KHTML, like Gecko) " +
                "Chrome/67.0.3396.99 Mobile Safari/537.36");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
        return chromeOptions;
    }

}
