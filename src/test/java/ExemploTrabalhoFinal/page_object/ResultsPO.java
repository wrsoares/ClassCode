package ExemploTrabalhoFinal.page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class ResultsPO {

    WebDriver driver;

    public ResultsPO(WebDriver driver) {
        this.driver = driver;
    }

    public void validatePage() {
        WebElement element = new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.visibilityOfElementLocated(
                        By.cssSelector("body > app-root > ion-app > ion-router-outlet > " +
                                "ng-component > div > div.flex-1 > ng-component > ng-component " +
                                "> app-centralizar > section > div > div > h2")));
        Assert.assertTrue(element.isDisplayed());
    }

    public void validateTestQuantityVotes() {
        List<WebElement> candidates = driver.findElements(By.tagName("app-cartao-candidato"));

        int first = getNumbers(candidates.get(0).findElement(By.className("text-gray-600")).getText());
        int second = getNumbers(candidates.get(1).findElement(By.className("text-gray-600")).getText());

        Assert.assertTrue((first > second) && !candidates.get(0).getText().contains("Não Eleito"),
                "O botão está no lugar errado");
    }

    public void validateTestPercentVotes() {
        List<WebElement> candidates = driver.findElements(By.tagName("app-cartao-candidato"));

        String firstPercent = candidates.get(0).findElement(By.className("tracking-tight")).getText().replace(",", ".").replace("%", "");
        String secondPercent = candidates.get(1).findElement(By.className("tracking-tight")).getText().replace(",", ".").replace("%", "");

        float votesFirst = Float.parseFloat(firstPercent);
        float votesSecond = Float.parseFloat(secondPercent);

        Assert.assertTrue(votesFirst > votesSecond && !candidates.get(0).getText().contains("Não Eleito"));

    }

    public int getNumbers(String expression) {
        String[] values = expression.split(" ");
        int x = Integer.parseInt(values[0].replace(".", ""));
        return x;
    }

}
