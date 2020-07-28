package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.PageBusca;
import pages.PageInicio;

import java.util.concurrent.TimeUnit;

public class SearchFunction {
    WebDriver driver = null;

    @Given("o navegador está aberto")
    public void o_navegador_está_aberto() {
        System.out.println("Abrindo navegador");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinic\\selenium\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @And("o usuário está na tela inicial")
    public void o_usuário_está_na_tela_inicial() {
        System.out.println("Acessar a página");
        driver.get("https://ww2.soc.com.br/blog/");
        driver.manage().window().maximize();
    }

    @And("o usuário clica em aceitar cookies")
    public void o_usuário_clica_em_aceitar_cookies() {
        System.out.println("Clicar no botão Aceitar Cookies");
        PageInicio.botaoCookies(driver).click();
    }

    @When("o usuário realiza a busca")
    public void o_usuário_realiza_a_busca() {
        System.out.println("Buscando por covid");
        PageInicio.barraBusca(driver).click();
        PageInicio.barraBusca(driver).sendKeys("covid");
        PageInicio.lupaPesquisa(driver).click();
    }

    @Then("são exibidos itens relacionados ao covid")
    public void são_exibidos_itens_relacionados_ao_covid() {
        String firstItem = PageBusca.primeiroItem(driver).getText();
        if (firstItem.contains("covid")){
            System.out.println("Resultado ok");
        } else {
            System.out.println("Erro de pesquisa");
        }
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.close();
    }

}
