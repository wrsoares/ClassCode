package selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class InformationTestClass {

    WebDriver driver;
//
//    @BeforeMethod
//    public void setUpDriver() {
//        System.setProperty("webdriver.chrome.driver",
//                "/Users/williamsoares/Documents/Selenium/chromedriver");
//        driver = new ChromeDriver();
//        driver.get("https://www.gov.br/pt-br");
//        driver.manage().window().maximize();
//    }
//    @AfterMethod
//    public void quit() {
//        driver.quit();
//    }

    @Test(testName = "Validando o método isDisplayed()")
    public void isDisplayed() {
        WebElement element = driver.findElement(By.
                cssSelector("#a4c5cb90-2f53-400c-82c0-7a6e2ffbedab > div > h2"));
        boolean isDisplayed = element.isDisplayed();
        Assert.assertTrue(isDisplayed, "O elemento não está visível");

        //Comparando o valor de retorno do método getText() diretamente no assert
        Assert.assertEquals(element.getText(), "Serviços para você", "O texto não é igual");

        //Capturando a imagem
        WebElement image = driver.findElement(By.cssSelector("#bd1d3567-0b01-4c52-b1fc-27811db7399e > div > div.swiper-container.tilePerfisSwiper.swiper-container-initialized.swiper-container-horizontal > div.itens.swiper-wrapper > a.item-tile-perfil-usuario.swiper-slide.swiper-slide-active > img"));
        //Capturando as dimensões da imagem e atribuindo a um objeto Dimension
        Dimension dimension = image.getSize();
        //Atribuindo os valores do height e width em variáveis do tipo int.
        // Os métodos getHeight() e getWidth() retornam valores do tipo int
        int height = dimension.getHeight();
        int width = dimension.getWidth();
        //Validando os valores
        Assert.assertEquals(height, 161);
        Assert.assertEquals(width, 160);

        //Fazendo comparações no assert utilizando operadores lógicos e relacionais
        Assert.assertTrue(height >= 200 && height <= 350, "Ele não está com o tamanho padrão");

    }

    @Test(testName = "Validando o método isEnabled()")
    public void isEnabled() {
        WebElement element = driver.findElement(By.id("searchtext-label"));
        boolean isEnabled = element.isEnabled();
        Assert.assertTrue(isEnabled, "O elemento não está habilitado");
    }

    @Test(testName = "Validando o método is Selected")
    public void isSelected() {
        driver.get("https://www.growdev.com.br/contact");
        WebElement element = driver.findElement(By.cssSelector("#__next > div > div > div:nth-child(3) > section.contact-one > div > form > div > div:nth-child(4) > div:nth-child(3) > input[type=checkbox]"));
        boolean isSelected = element.isSelected();
        Assert.assertFalse(isSelected, "O elemento carregou inicialmente selecionado");
    }

    @Test(testName = "Validando a posição de um elemento")
    public void validatePosition() {
        WebElement element = driver.findElement(By.cssSelector("#a4c5cb90-2f53-400c-82c0-7a6e2ffbedab > div > h2"));
        Point point = element.getLocation();
        int x = point.getX();
        int y = point.getY();
        Assert.assertEquals(x, 136, "Está no ponto errado");
        Assert.assertEquals(y, 336, "Está no ponto errado");
    }
    
    @Test(testName = "Validando a tag de um elemento")
    public void validateTagName() {
        WebElement element = driver.findElement(By.cssSelector("#govbr-busca-input > div > form"));
        System.out.println("TagName: " + element.getTagName());
    }

    @Test(testName = "Validando a fonte de um texto")
    public void fontValidation() {
        WebElement element = driver.findElement(By.cssSelector("#site-header > div.main > div > div > h1 > a"));
        String font = element.getCssValue("font-family");
        Assert.assertTrue(font.contains("rawline"), "As fontes estão divergentes");
    }

}
