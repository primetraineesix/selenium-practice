package actionclass;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import utiliies.Utility;

/**
 * Created by Jay Vaghani
 */
public class TestKeyBoardEvents extends Utility {
    String baseUrl = "https://courses.letskodeit.com/practice";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void keyBoardExample() throws InterruptedException {
        Actions actions = new Actions(driver);

        driver.findElement(By.id("openwindow")).sendKeys(Keys.CONTROL + "a");
        Thread.sleep(3000);

        actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();

        clickOnElement(By.id("name"));

        actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();

    }
}
