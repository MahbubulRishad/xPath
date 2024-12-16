package xPath_Learning.xPath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatingWithXpath {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@value = 'radio1']")).click();

//        Absolute Xpath
        String pageTitle = driver.findElement(By.xpath("/html/body/h1")).getText();
        System.out.println(pageTitle);


        Thread.sleep(2000);
        driver.quit();
    }
}
