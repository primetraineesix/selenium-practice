package alertexample;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import utiliies.Utility;

/**
 * Created by Jay Vaghani
 */
public class TestAlert extends Utility {
    String baseUrl = "https://mail.rediff.com/cgi-bin/login.cgi";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void alertExample(){
        clickOnElement(By.name("proceed"));  // Click on Sign In Button
        Alert alert = driver.switchTo().alert();  // Creating Alert Object reference and switch to alert
        System.out.println(alert.getText());
        alert.sendKeys("Jay");
        alert.accept(); // accepting alert
     }
}
