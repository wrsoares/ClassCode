package selenium.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Collections;

public class TestCase {

    /*
    * NOME: Validar página de login do gov.br
    *
    * passo 1: acessar a página do gov.br (https://www.gov.br/pt-br)
    * passo 2: clicar no link 'Consultar dívidas e pendências fiscais
    * passo 3: clicar no botão iniciar
    * passo 4: validar que acessou a página login do gov.br
    * */
    WebDriver driver;
    @BeforeMethod
    public void setUpDriver() {
        System.setProperty("webdriver.chrome.driver",
                "/Users/williamsoares/Documents/Selenium/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("useAutomationExtension", false);
        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));

        driver = new ChromeDriver(options);
        driver.get("https://www.gov.br/pt-br");
    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test(testName = "Validar página de login do gov.bra")
    public void validar_pagina_login_govbr() {
        HomePO homePO = new HomePO(driver);
        homePO.selectOption();

        ConsultarDividasPO consultarDividasPO = new ConsultarDividasPO(driver);
        consultarDividasPO.pageValidation();
        consultarDividasPO.btnIniciar();

        LoginPO loginPO = new LoginPO(driver);
        loginPO.loginValidation("Acesso GovBR".toUpperCase());
    }



}
