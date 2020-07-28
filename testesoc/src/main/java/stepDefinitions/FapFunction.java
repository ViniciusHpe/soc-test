package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.PageFAP;
import pages.PageInicio;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class FapFunction {
    WebDriver driver =null;
    Logger logger = Logger.getLogger("LogDemo");

    @Given("o navegador é aberto")
    public void o_navegador_é_aberto() {
        System.out.println("Abrindo navegador");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinic\\selenium\\chromedriver.exe");
        driver = new ChromeDriver();

    }
    @And("o usuário está na tela inicial do SOC")
    public void o_usuário_está_na_tela_inicial_do_soc() {
        System.out.println("Acessar a página");
        driver.get("https://ww2.soc.com.br/blog/");
        driver.manage().window().maximize();
    }

    @And("o usuário aceita os cookies")
    public void o_usuário_aceita_os_cookies() {
        System.out.println("Clicar no botão Aceitar Cookies");
        PageInicio.botaoCookies(driver).click();
    }

    @When("o usuário clica na opção FAP")
    public void o_usuário_clica_na_opção_fap() {
        System.out.println("Clicar na opção FAP");
        PageInicio.opcaoFAP(driver).click();
    }

    @And("preenche o formulário")
    public void preenche_o_formulário() {
        PageFAP.nomeEmpresa(driver).sendKeys("Vinicius Company");
        System.out.println("Escrever Vinicius Company no campo de nome da empresa");
        PageFAP.fapNumber(driver).clear();
        System.out.println("Limpar texto do campo FAP");
        PageFAP.fapNumber(driver).sendKeys("1");
        System.out.println("Escrever número 2 no campo FAP");
        PageFAP.selectRAT(driver).click();
        System.out.println("Clica no campo RAT");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Aguarda 10 segundos");
        PageFAP.selectOption(driver).click();
        System.out.println("Seleciona a segunda opção do combo");
        PageFAP.projecaoSalarial(driver).sendKeys("1000");
        System.out.println("Escrever 10,00 no campo de Projeção Salarial");
    }

    @And("clica em estimar FAP")
    public void clica_em_estimar_fap() {
        PageFAP.botaoEstimar(driver).click();
        System.out.println("Clicar no botão Estimar FAP");
    }

    @Then("é exibido o relatório FAP")
    public void é_exibido_o_relatório_fap() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        System.out.println("Aguardar 30 segundos");
        driver.close();
        driver.quit();
    }
}
