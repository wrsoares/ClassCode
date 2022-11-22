package endtoend.google.tests;

import endtoend.google.pageobjects.GooglePO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static Utils.Utils.getElement;

public class Runner {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver",
                "/Users/williamsoares/Documents/Selenium/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.airbnb.com/s/Casa-Verde--São-Paulo-~-SP/homes?place_id=ChIJa_LVxuX3zpQRIzQP5XFnajc&refinement_paths%5B%5D=%2Fhomes&checkin=2023-01-01&checkout=2023-01-31&date_picker_type=calendar&adults=2&children=0&infants=0&pets=2&search_type=AUTOSUGGEST");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test(testName = "Efetuar busca usando por meio do botão de busca")
    public void test_search_btn_search() {
        GooglePO googlePO = new GooglePO(driver);
        googlePO.searchButtonSearch("Selenium");
    }
    @Test(testName = "Efetuar busca usando por meio do botão \"estou com sorte\"")
    public void test_search_btn_lucky() {
        GooglePO googlePO = new GooglePO(driver);
        googlePO.searchButtonLucky("Selenium");
    }
    @Test(testName = "Efetuar busca com enter")
    public void test_search_enter() {
        GooglePO googlePO = new GooglePO(driver);
        googlePO.searchEnter("Selenium");
    }
    @Test(testName = "Efetuar busca sem inserir valor")
    public void search_without_value() {
        GooglePO googlePO = new GooglePO(driver);
        googlePO.searchWithoutValue();
    }
    @Test(testName = "efetuar busca sem inserir valor por meio do botão \"estou com sorte\"")
    public void search_without_value_btn_lucky() {
        GooglePO googlePO = new GooglePO(driver);
        googlePO.searchWithoutValueLucky();
    }
    @Test(testName = "efetuar busca por meio da URL")
    public void search_url() {
        GooglePO googlePO = new GooglePO(driver);
        googlePO.searchUrl("Selenium");
    }

    @Test(testName = "TESTNAME")
    public void TESTNAME() {
        System.out.println(getElement(driver, By.cssSelector("#site-content > div.m1fb5rsd.dir.dir-ltr")).isDisplayed());
        System.out.println(getElement(driver, By.cssSelector("#site-content > div.fhusglq.dir.dir-ltr > div.p1lc3mon.dir.dir-ltr > div > div > div > div > section > h1 > span")).isDisplayed());
    }

}
