package selenium.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginPO {

    WebDriver driver;

    public LoginPO(WebDriver driver) {
        this.driver = driver;
    }

    public void loginValidation(String text) {
        WebElement element = driver.findElement(By.cssSelector("#frmLoginCert > h2"));
        Assert.assertEquals(element.getText(), text);
    }

}
