package ExemploTrabalhoFinal;

import ExemploTrabalhoFinal.page_object.ElectionsPO;
import ExemploTrabalhoFinal.page_object.ElectionsResultsPO;
import ExemploTrabalhoFinal.page_object.HomePO;
import ExemploTrabalhoFinal.page_object.ResultsPO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Collections;
import java.util.List;

public class Runner {

    WebDriver driver;

    @BeforeMethod
    public void setUpDriver() {
        System.setProperty("webdriver.chrome.driver",
                "/Users/williamsoares/Documents/Selenium/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("useAutomationExtension", false);
        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));

        driver = new ChromeDriver(options);
        driver.get("https://www.tse.jus.br/");
    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test(testName = "Validar presidente eleito por quantidade de votos")
    public void test_quantity_votes() {
        HomePO homePO = new HomePO(driver);
        homePO.validatePage();
        homePO.selectOption("Eleições 2022");

        ElectionsPO electionsPO = new ElectionsPO(driver);
        electionsPO.validatePage();
        electionsPO.selectOptionElection("Divulgação dos resultados das Eleições 2022");

        ElectionsResultsPO electionsResultsPO = new ElectionsResultsPO(driver);
        electionsResultsPO.validatePage();
        electionsResultsPO.accessResults();

        ResultsPO resultsPO = new ResultsPO(driver);
        resultsPO.validatePage();
        resultsPO.validateTestQuantityVotes();
    }

    @Test(testName = "Validar presidente eleito por percentual")
    public void test_percent_votes() {
        HomePO homePO = new HomePO(driver);
        homePO.validatePage();
        homePO.selectOption("Eleições 2022");

        ElectionsPO electionsPO = new ElectionsPO(driver);
        electionsPO.validatePage();
        electionsPO.selectOptionElection("Divulgação dos resultados das Eleições 2022");

        ElectionsResultsPO electionsResultsPO = new ElectionsResultsPO(driver);
        electionsResultsPO.validatePage();
        electionsResultsPO.accessResults();

        ResultsPO resultsPO = new ResultsPO(driver);
        resultsPO.validatePage();
        resultsPO.validateTestPercentVotes();
    }

    @Test(testName = "Validar presidente eleito por botão indicador")
    public void test_indicator_button() {
        HomePO homePO = new HomePO(driver);
        homePO.validatePage();
        homePO.selectOption("Eleições 2022");

        ElectionsPO electionsPO = new ElectionsPO(driver);
        electionsPO.validatePage();
        electionsPO.selectOptionElection("Divulgação dos resultados das Eleições 2022");

        ElectionsResultsPO electionsResultsPO = new ElectionsResultsPO(driver);
        electionsResultsPO.validatePage();
        electionsResultsPO.accessResults();

        ResultsPO resultsPO = new ResultsPO(driver);
        resultsPO.validatePage();
        resultsPO.validateTestPercentVotes();
        resultsPO.validateTestQuantityVotes();
    }

}
