package selenium.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ConsultarDividasPO {

    WebDriver driver;

    public ConsultarDividasPO(WebDriver driver) {
        this.driver = driver;
    }

    public void pageValidation () {
        WebElement pageTitle = driver.findElement(By.cssSelector("#content-core > div.visao-servico > div.header > div"));
        Assert.assertEquals(pageTitle.getText(), "Consultar dívidas e pendências fiscais");
    }

    public void btnIniciar() {
        WebElement btnIniciar = driver.findElement(By.
                        cssSelector("#content-core > div.visao-servico > div.header > a"));
        Assert.assertTrue(btnIniciar.isDisplayed());
        btnIniciar.click();
    }

}
