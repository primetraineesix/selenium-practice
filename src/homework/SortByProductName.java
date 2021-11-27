package homework;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utiliies.Utility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Jay Vaghani
 */
public class SortByProductName extends Utility {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void verifyProductArrangeInAlphabeticalOrder() throws InterruptedException {
        // Mouse hover on computer menu and click on Desktop
        mouseHoverToElement(By.xpath("//div[@class='header-menu']//ul[1]//a[contains(text(),\"Computers\")]"));
        clickOnElement(By.xpath("//div[@class='header-menu']//ul[1]//a[contains(text(),'Computers')]//parent::li//ul//a[contains(text(), 'Desktops')]"));

        List<WebElement> originalList = driver.findElements(By.xpath("//h2[@class='product-title']"));
        List<String> originalProductNameList = new ArrayList<>();
        for (WebElement product :originalList){
            originalProductNameList.add(product.getText());
        }

        Collections.sort(originalProductNameList, Collections.reverseOrder());  // We sorted this list to descending
        System.out.println(originalProductNameList);

        //Sort by position "Name: Z to A"
        selectByVisibleTextFromDropDown(By.id("products-orderby"), "Name: A to Z");

//        Thread.sleep(3000);
        waitUntilVisibilityOfElementLocated(By.xpath("//h2[@class='product-title']"), 10);

        List<WebElement> afterSortingList = driver.findElements(By.xpath("//h2[@class='product-title']"));
        List<String> afterSortingProductName = new ArrayList<>();
        for (WebElement product :afterSortingList){
            afterSortingProductName.add(product.getText());
        }
        System.out.println(afterSortingProductName);

        Assert.assertEquals("Product not sorted", originalProductNameList, afterSortingProductName);


    }

}
