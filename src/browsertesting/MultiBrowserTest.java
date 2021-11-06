package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Jay Vaghani
 */
public class MultiBrowserTest {

    static String browser = "Chrome";
    static String baseURL = "";
    static WebDriver driver;


    public void selectBrowser(String browser){
        if(browser.equalsIgnoreCase("chrome")){

            driver = new ChromeDriver();
        }else if (browser.equalsIgnoreCase("FireFox")){

        }else {
            System.out.println("Wrong Browser Name");
        }
    }
}
