package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**
 * Created by Jay Vaghani
 */
public class LocatorDemo4 {

    public static void main(String[] args) {
        String baseUrl = "http://automationpractice.com/index.php";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize(); // maximise window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // we give implicit time to driver

       /* WebElement searchBox = driver.findElement(By.xpath("//input[@placeholder='Search']"));
        searchBox.sendKeys("T-Shirt");*/

        // xpath with OR
        driver.findElement(By.xpath("//input[@id = 'search_query_top' or @placeholder='Search']")).sendKeys("T-shirt");

        // xpath with and
        driver.findElement(By.xpath("//input[@id = 'search_query_top' and @placeholder='Search']")).sendKeys("T-shirt");

        // xpath with contains()
        driver.findElement(By.xpath("//input[contains(@id, 'top')]"));

        // xpath with start-with
        driver.findElement(By.xpath("//input[starts-with(@id, 'search_query')]"));

        // xpath with text()
        driver.findElement(By.xpath("//a[text()='Women']")).sendKeys("T-shirt");

        // xpath chained
        driver.findElement(By.xpath("//form[@id='searchbox']//button[@name = 'submit_search']")).click();






    }
}
