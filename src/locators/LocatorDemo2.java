package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

/**
 * Created by Jay Vaghani
 */
public class LocatorDemo2 {

    public static void main(String[] args) {
        String baseUrl = "http://automationpractice.com/index.php";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize(); // maximise window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // we give implicit time to driver

        // Class name locator -- To find multiple elements
        List<WebElement> sliderList = driver.findElements(By.className("homeslider-container"));
        int size = sliderList.size();
        System.out.println(size);

        // tag name locator -- To find multiple elements
        List<WebElement> links =driver.findElements(By.tagName("a"));
        System.out.println("Number of links: " + links.size());



    }
}
