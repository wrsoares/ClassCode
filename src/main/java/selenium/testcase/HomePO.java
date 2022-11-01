package selenium.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class HomePO {

    WebDriver driver;
    static final String consultarDividas = "Consultar dívidas e pendências fiscais";
    static final String inscreverCPF = "Inscrever-se no CPF";
    static final String emitirDarf = "Emitir DARF";
    static final String obterCartaoCPF = "Obter cartão de CPF";
    static final String consultarComunicacaoDividas = "Consultar comunicações de cobrança";
    static final String atualizarCPF = "Atualizar CPF";

    public HomePO(WebDriver driver) {
        this.driver = driver;
    }

    public void selectOption() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.get("https://www.gov.br/pt-br/servicos/consultar-dividas-e-pendencias-fiscais");
    }

}
