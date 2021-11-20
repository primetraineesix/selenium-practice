package switchwindows;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utiliies.Utility;

/**
 * Created by Jay Vaghani
 */
public class TestIFrame extends Utility {

    String baseUrl = "https://courses.letskodeit.com/practice";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void switchIframeExample() throws InterruptedException {
        //Switch to frame
        driver.switchTo().frame("courses-iframe");
        // Find the element inside the iframe and send the text
        sendTextToElement(By.xpath("//input[@id='search']"), "Prime Testing");

        // Switch to default content
        driver.switchTo().defaultContent();

        // Send Text to search Box (Outside the Frame)
        Thread.sleep(3000);
        sendTextToElement(By.id("name"), "Jay");

    }
}
