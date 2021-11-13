package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**
 * Created by Jay Vaghani
 */
public class LocatorDemo3 {

    public static void main(String[] args) {
        String baseUrl = "http://automationpractice.com/index.php";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize(); // maximise window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // we give implicit time to driver

        WebElement signInLink = driver.findElement(By.linkText("Sign in"));
        signInLink.click();

        // Tag and Id
//        WebElement emailField = driver.findElement(By.cssSelector("input#email"));
        WebElement emailField = driver.findElement(By.cssSelector("#email"));
        emailField.sendKeys("Prime@gmail.com");

        // Tag and class
        WebElement signInBtn = driver.findElement(By.cssSelector("p.submit"));
        signInBtn.click();

        // Tag and Attribute
        WebElement emailField1 = driver.findElement(By.cssSelector("input[id=email]"));
        emailField1.sendKeys("Prime1");



    }
}
