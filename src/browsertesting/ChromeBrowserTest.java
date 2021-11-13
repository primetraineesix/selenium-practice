package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**
 * Created by Jay Vaghani
 */
public class ChromeBrowserTest {

    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize(); // maximise window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // we give implicit time to driver
        String getTitle = driver.getTitle();
        System.out.println(getTitle);

        String currentUrl = driver.getCurrentUrl(); // Get current URL
        System.out.println(currentUrl);

        String pageSource = driver.getPageSource();  // Get Page source
        System.out.println(pageSource);

        driver.close();
    }
}
