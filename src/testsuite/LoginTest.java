package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utiliies.Utility;

/**
 * Created by Jay Vaghani
 */
public class LoginTest extends Utility {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        // Finding login link element and click on login link element
        /*WebElement loginLink = driver.findElement(By.xpath("//a[contains(text(),'Log in')]"));
        loginLink.click();*/
        clickOnElement(By.xpath("//a[contains(text(),'Log in')]"));
        // This is expected text from requirement
        String expectedMessage = "Welcome, Please Sign In";
        /*WebElement message = driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
        String  actualMessage = message.getText();*/
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
        Assert.assertEquals("Login page not displayed", expectedMessage, actualMessage);
    }

    @Test
    public void verifyErrorMessageWithInvalidCredentials() {
        clickOnElement(By.xpath("//a[contains(text(),'Log in')]"));  //Clicking on login link
        /*WebElement emailField = driver.findElement(By.id("Email")); // Finding Email field element
        emailField.sendKeys("prime123@gmail.com"); // Entering Email address*/
        sendTextToElement(By.id("Email"), "prime123@gmail.com");
        /*WebElement passwordField = driver.findElement(By.name("Password"));// Finding password field element
        passwordField.sendKeys("prime123"); // Entering password*/
        sendTextToElement((By.name("Password")), "prime123");
        clickOnElement(By.xpath("//button[normalize-space()='Log in']")); // clicking on Login Button
        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n"
                + "No customer account found";
        String actualErrorMessage = getTextFromElement(By.xpath("//div[@class='message-error validation-summary-errors']"));
        Assert.assertEquals("Error message not displayed", expectedErrorMessage, actualErrorMessage);
    }



    @After
    public void tearDown() {
        closeBrowser();
    }
}
