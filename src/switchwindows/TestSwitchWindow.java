package switchwindows;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utiliies.Utility;

import java.util.Set;

/**
 * Created by Jay Vaghani
 */
public class TestSwitchWindow extends Utility {

    String baseUrl = "https://courses.letskodeit.com/practice";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void switchWindowExample() throws InterruptedException {
        //Get the handle of window
        String parentHandle = driver.getWindowHandle();
        System.out.println("Parent window : " + parentHandle);
        clickOnElement(By.id("openwindow"));

        //Get all handles
        Set<String> handles = driver.getWindowHandles();

        // Switching between handle
        for (String handle: handles) {
            System.out.println(handle);
            if (!handle.equals(parentHandle)){
                driver.switchTo().window(handle);
                Thread.sleep(3000);
                clickOnElement(By.xpath("//a[contains(text(),'Sign In')]"));
                driver.close();
                break;
            }
        }
        // Switch back to the parent window
        driver.switchTo().window(parentHandle);
        sendTextToElement(By.id("name"), "Test Successful");
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
