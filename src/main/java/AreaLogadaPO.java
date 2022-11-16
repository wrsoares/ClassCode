import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AreaLogadaPO {
    WebDriver driver;
    public void validarLogin(String usuario) {
        String valorCapturado = driver.findElement(By.id("id_element")).getText();
        Assert.assertEquals(valorCapturado, usuario, "Valor divergente");
    }
}

