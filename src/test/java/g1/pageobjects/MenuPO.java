package g1.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenuPO {

    WebDriver driver;

    public MenuPO(WebDriver driver) {
        this.driver = driver;
    }

    public void selectRegion() {
        WebElement element = driver.findElement(By.cssSelector("#menu-1-regioes > a > span.menu-item-title"));
        element.click();
    }


}
