package Tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class FedoraTest {
    @Test
    public void Test1() throws InterruptedException {

        WebDriver driver = new FirefoxDriver();

        driver.get("https://google.com");
        Thread.sleep(2000);
        driver.quit();
    };
}
