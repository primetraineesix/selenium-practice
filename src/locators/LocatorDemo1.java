package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**
 * Created by Jay Vaghani
 */
public class LocatorDemo1 {

    public static void main(String[] args) {
        String baseUrl = "http://automationpractice.com/index.php";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize(); // maximise window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // we give implicit time to driver

        //Id and Name Locators
        WebElement searchBox = driver.findElement(By.id("search_query_top")); // Find the element
        searchBox.sendKeys("T-Shirt"); // Action om Element (Type or send the text)


        /*WebElement searchBtn = driver.findElement(By.name("submit_search"));
        searchBtn.click();*/

        driver.findElement(By.name("submit_search")).click();

        // Link Text locator
//        driver.findElement(By.linkText("Printed Chiffon Dress")).click();

        // Partial link text
        driver.findElement(By.partialLinkText("Chiffon Dress")).click();


    }
}
