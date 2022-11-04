package ExemploTrabalhoFinal.page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

import static Utils.Utils.scrollPage;

public class HomePO {

    WebDriver driver;

    public HomePO(WebDriver driver) {
        this.driver = driver;
    }

    //Valida se está na página correta
    public void validatePage() {
        Assert.assertTrue(driver.findElement(By.
                cssSelector("#visual-portal-wrapper > nav > div > div > h1 > a > img")).isDisplayed());
    }

    //Opcao de acesso direto ao elemento/opcao
    public void acessarOpcaoEleicoes() {
        driver.findElement(By.
                cssSelector("#destaque-tema > div > div > div:nth-child(1) > div > ul > li:nth-child(1)"));
    }

    public void acceptCookie() {
        driver.findElement(By.cssSelector("#modal-lgpd > div > div > div.botao > button")).click();
    }

    //Metodo que pode acessar todos os elementos/opções
    public void selectOption(String electionOption) {
        List<WebElement> options = driver.findElement(
                By.cssSelector("#destaque-tema > div > div > div:nth-child(1) > div > ul")).
                findElements(By.tagName("li"));
        acceptCookie();
        for (WebElement option:options
             ) {
            if (option.getText().contains(electionOption)) {
                scrollPage(driver, "750");
                option.click();
                break;
            }
        }
    }

}
