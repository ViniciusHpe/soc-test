package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class PageFAP {
    //WebDriver driver = new ChromeDriver();
    public static WebElement nomeEmpresa(WebDriver driver){
        WebElement nomeEmpresa = driver.findElement(By.id("nomeEmpresa"));
        return nomeEmpresa;
    };
    public static WebElement fapNumber(WebDriver driver){
        WebElement fapNumber = driver.findElement(By.id("fap"));
        return fapNumber;
    };
    public static WebElement selectRAT(WebDriver driver){
        WebElement selectRAT = driver.findElement(By.className("selectric"));
        return selectRAT;
    };
    public static WebElement selectOption(WebDriver driver){
        WebElement selectOption = driver.findElement(By.xpath("//div[@class='selectric-scroll']/ul/li[@data-index='2']"));
        return selectOption;
    };
    public static WebElement projecaoSalarial(WebDriver driver){
        WebElement projecaoSalarial = driver.findElement(By.id("projecao"));
        return projecaoSalarial;
    };
    public static WebElement botaoEstimar(WebDriver driver){
        WebElement botaoEstimar = driver.findElement(By.id("estimar"));
        return botaoEstimar;
    };
}