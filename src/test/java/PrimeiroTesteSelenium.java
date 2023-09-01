import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PrimeiroTesteSelenium {
    @Test
    void testaselenium (){
        System.setProperty("webdriver.chrome.driver", "src/test/java/drivers/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.google.com/?hl=pt-PT");

        driver.findElement(By.xpath("//*[text()='Entrar']"));
        driver.findElement(By.xpath("//*[text()='Gmail']"));
        driver.findElement(By.xpath("//*[text()='Imagens']"));

        driver.findElement(By.xpath("//input[@value='Sinto-me com sorte']"));

        WebElement textarea = driver.findElement(By.xpath("//textarea[@title='Pesquisar']"));

        textarea.sendKeys("Facebook");

        WebElement pesquisar = driver.findElement(By.xpath("//*[@value='Pesquisa Google']"));

        pesquisar.submit();

        String innerText = "Facebook – entre ou cadastre-se";
        WebElement facebook = driver.findElement(By.xpath("//h3[contains(text(), '" + innerText + "')]"));

    }

}
