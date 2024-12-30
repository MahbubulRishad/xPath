package xPath_Learning.dynamic_xPath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LocatingWithDynamicXpath {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/webtables");
        driver.manage().window().maximize();

//        finding table element
//       WebElement tableEditBtn = driver.findElement(By.xpath("(//div[contains(@class, 'rt-tr-group') and @role= 'rowgroup'])[2]/div/div[7]/div/span[1]"));
//
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//
////        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
////        wait.until(ExpectedConditions.elementToBeClickable(tableEditBtn));
//
//
//        js.executeScript("arguments[0].scrollIntoView(true);", tableEditBtn);
//        tableEditBtn.click();


        WebElement tableElAddBtn = driver.findElement(By.xpath("//button[text() = 'Add']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", tableElAddBtn);


//        driver.quit();
    }
}
