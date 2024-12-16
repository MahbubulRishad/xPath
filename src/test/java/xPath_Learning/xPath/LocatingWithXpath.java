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

//        Absolute Xpath (not recommended)
        String pageTitle = driver.findElement(By.xpath("/html/body/h1")).getText();
        System.out.println(pageTitle);


//         Relative Xpath
        driver.findElement(By.xpath("//input[@value = 'radio1']")).click();

//        xpath chaining
        String getTextSample = driver.findElement(By.xpath("//div[@class = 'block large-row-spacer']//legend[text() = 'Suggession Class Example']")).getText();
        System.out.println(getTextSample);

//        Xpath - Contains(@tagname, 'value')
        driver.findElement(By.xpath("//input[contains(@class, 'ui-autocomplete-input')]")).sendKeys("Bangladesh");



//        Xpath - with indexing
        driver.findElement(By.xpath("(//input[@name = 'radioButton'])[3]")).click();

//        Xpath - with visible text()
//        alternate xpath - //a[contains(text(), 'Open Tab')]

//        driver.findElement(By.xpath("//a[text() = 'Open Tab']")).click();


//        Xpath - normalize-space()
        String optionText = driver.findElement(By.xpath("//label[normalize-space() = 'Option2']")).getText();
        System.out.println(optionText);
        driver.findElement(By.xpath("//input[contains(@value, 'option2')]")).click();


        Thread.sleep(2000);
        driver.quit();
    }
}
