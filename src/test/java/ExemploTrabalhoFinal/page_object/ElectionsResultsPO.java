package ExemploTrabalhoFinal.page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ElectionsResultsPO {
    WebDriver driver;

    public ElectionsResultsPO(WebDriver driver) {
        this.driver = driver;
    }

    public void validatePage() {
        Assert.assertTrue(driver.findElement(By.cssSelector("#content > main > h2")).isDisplayed(),
                "Não acessou a página correta: Divulgação de resultados");
    }

    public void accessResults() {
        WebElement element = driver.findElement(By.linkText("Resultados - visão resumida"));
        element.click();
    }

}
