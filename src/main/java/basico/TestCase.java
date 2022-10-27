package basico;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase {

    WebDriver driver;

    @Test
    public void test() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "/Users/williamsoares/Documents/Selenium/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        acessarSite("https://www.amazon.com.br");
        buscarProduto("macbook m2");
        Thread.sleep(5000);
        selecionarOpcao();
        String text = efetuarPagamento();

        Assert.assertEquals(text, "Fazer login", "Você não acessou a página correta");

        driver.quit();
    }

    public void acessarSite(String url) {
        driver.get(url);
    }
    public void buscarProduto(String product) throws InterruptedException {
        Thread.sleep(1000);
        WebElement searchBar = driver.findElement(By.id("twotabsearchtextbox"));
        searchBar.sendKeys(product);
        WebElement btnSearch = driver.findElement(By.id("nav-search-submit-button"));
        btnSearch.click();
    }
    public void selecionarOpcao() {
        WebElement option = driver.findElement(By.linkText("Apple Macbook Air 13 Chip M1 256gb De Ssd 8gb Cinza-espacial"));
        option.click();
    }
    public String efetuarPagamento() throws InterruptedException {
        WebElement addToCart = driver.findElement(By.id("add-to-cart-button"));
        addToCart.click();
        Thread.sleep(1000);
        WebElement protectionBtn = driver.findElement(By.cssSelector("#attachSiNoCoverage > span"));
        protectionBtn.click();
        Thread.sleep(1000);
        WebElement checkout = driver.findElement(By.name("proceedToRetailCheckout"));
        checkout.click();
        Thread.sleep(5000);
        WebElement message = driver.findElement(By.cssSelector("#authportal-main-section > div:nth-child(2) > div > div.a-section > form > div > div > div > h1"));

        return message.getText();

    }


}
