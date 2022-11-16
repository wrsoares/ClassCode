import org.testng.annotations.Test;

public class Runner {
    @Test
    public void validateHome() {
        HomePO homePO = new HomePO();
        homePO.btnEfetuarLogin();

        LoginPO loginPO = new LoginPO();
        loginPO.efetuarLogin("mentor@growdev.com.br");
    }
}

