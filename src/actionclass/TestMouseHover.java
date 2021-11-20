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
public class TestMouseHover extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void mouseHoverExample() {
        Actions actions = new Actions(driver);

        // Computer  ------> Software  and click
        WebElement computer = driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]"));
        WebElement software = driver.findElement(By.xpath("//body[1]/div[6]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"));

        /*actions.moveToElement(computer).build().perform();
        actions.moveToElement(software).click().build().perform();*/

        actions.moveToElement(computer).moveToElement(software).click().build().perform();
    }
}
