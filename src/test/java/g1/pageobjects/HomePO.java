package g1.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePO {

    WebDriver driver;

    public HomePO(WebDriver driver) {
        this.driver = driver;
    }

    public void btnMenu() {
        WebElement element = driver.findElement(By.cssSelector("#header-produto > div.gui-color-primary-bg.header-principal.header-navegacao-color > div > div > div.menu-area > div > span"));
        element.click();
    }

}
