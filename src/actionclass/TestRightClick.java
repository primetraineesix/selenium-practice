package actionclass;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utiliies.Utility;

/**
 * Created by Jay Vaghani
 */
public class TestRightClick extends Utility {
    String baseUrl = "http://swisnl.github.io/jQuery-contextMenu/demo.html";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void rightClickExample(){
        Actions actions = new Actions(driver);

        WebElement button = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));

        actions.contextClick(button).build().perform();

        clickOnElement(By.xpath("//body[1]/ul[1]/li[3]/span[1]")); // Click on Copy Button
        System.out.println(driver.switchTo().alert().getText()); // Capture the text from alert
        driver.switchTo().alert().accept();  // Close the alert



    }
}
