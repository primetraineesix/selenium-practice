package waits;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utiliies.Utility;

/**
 * Created by Jay Vaghani
 */
public class TestFluentWait extends Utility {

    String baseUrl = "https://courses.letskodeit.com/practice";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void fluentWaitExample(){

        By signInLink = By.xpath("//a[contains(text(),'Sign In')]");

        waitForElementWithFluentWait(signInLink, 30, 5).click();

    /*    Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);

        WebElement element = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(signInLink);
            }
        });
        element.click();
*/
    }



}
