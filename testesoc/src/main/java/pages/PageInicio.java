package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageInicio {
    WebDriver driver = new ChromeDriver();

    public static WebElement botaoCookies(WebDriver driver) {
        WebElement botaoCookies = driver.findElement(By.id("barra-cookie"));
        return botaoCookies;
    };

    public static WebElement opcaoFAP(WebDriver driver) {
        WebElement opcaoFAP = driver.findElement(By.xpath("//li[@id='menu-item-14815']/a"));
        return opcaoFAP;
    };

    public static WebElement barraBusca(WebDriver driver) {
        WebElement barraBusca = driver.findElement(By.xpath("//form[@class='form-busca']/input[@name='s']"));
        return barraBusca;
    };

    public static WebElement lupaPesquisa(WebDriver driver) {
        WebElement lupaPesquisa = driver.findElement(By.className("lupa-form"));
        return lupaPesquisa;
    };
}