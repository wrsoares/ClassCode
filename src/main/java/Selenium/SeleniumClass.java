package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumClass {


    @Test
    public void test() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "/Users/williamsoares/Documents/Selenium/chromedriver");

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.gov.br/pt-br");
        driver.manage().window().maximize();

        WebElement searchInput = driver.findElement(By.id("searchtext-input"));
        searchInput.sendKeys("CPF");
        Thread.sleep(1000);

        WebElement searchBtn = driver.findElement(By.id("searchtext-label"));
        searchBtn.click();
        Thread.sleep(1000);

        WebElement linkSearch = driver.findElement(By.linkText("Consultar CPF"));
        linkSearch.click();
        Thread.sleep(1000);

        String title = driver.getTitle();

        Assert.assertTrue(
                title.equalsIgnoreCase("Português (Bras"),
                "O título não é esse!!!");

        driver.quit();
    }


    
}
