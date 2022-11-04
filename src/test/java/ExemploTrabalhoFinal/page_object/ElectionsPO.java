package ExemploTrabalhoFinal.page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class ElectionsPO {

    WebDriver driver;

    public ElectionsPO(WebDriver driver) {
        this.driver = driver;
    }

    public void validatePage() {
        Assert.assertTrue(driver.findElement(By.cssSelector("#content > main > h2")).isDisplayed());
    }

    public void selectOptionElection(String electionOption) {
        List<WebElement> options = driver.
                findElement(By.cssSelector(
                        "#menu-lateral-res > ul > li.menu-lateral-item.menu-l" +
                                "ateral-item_ativo.has-submenu > ul"))
                .findElements(By.tagName("li"));
        for (WebElement option:options
             ) {
            if (option.getText().contains(electionOption)) {
                option.click();
                break;
            }
        }
    }

}
