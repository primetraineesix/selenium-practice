package navigationmethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**
 * Created by Jay Vaghani
 */
public class NavigationExample {
    /**
     * navigation().back()
     * navigation().forward()
     * navigation().refresh()
     * navigation().to()
     */

    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // maximise window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // we give implicit time to driver

        driver.get(baseUrl);
        driver.navigate().to("https://www.amazon.co.uk/");

        driver.navigate().back();  // back to nop commerce
        driver.navigate().forward(); // forward to amazon

        driver.navigate().refresh(); // this will refresh the page

    }
}
