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
import java.util.List;

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

        List<WebElement> listOfFirstName = driver.findElements(By.xpath("//div[contains(@class, 'rt-tr-group') and @role= 'rowgroup']/div/div[contains(@class, \"rt-td\")][1]"));

        for (int i = 0; i < listOfFirstName.size(); i++) {
            String firstName = listOfFirstName.get(i).getText();
            System.out.println(firstName);

            if (firstName.trim().equals("Cierra")) {
                driver.findElement(By.xpath("(//div[contains(@class, 'rt-tr-group') and @role= 'rowgroup'])["+(i+1)+"]/div/div[7]/div/span[1]")).click();
            }
        }


//        driver.quit();
    }
}
