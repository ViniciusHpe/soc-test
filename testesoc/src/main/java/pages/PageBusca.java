package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageBusca {
    WebDriver driver = new ChromeDriver();

    public static WebElement primeiroItem(WebDriver driver) {
        WebElement primeiroItem = driver.findElement(By.id("barra-cookie"));
        return primeiroItem;
    };

}