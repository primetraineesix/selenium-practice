package locators;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by Jay Vaghani
 */
public class LocatorDemo5 extends BaseTest {
    String baseUrl = "https://money.rediff.com/gainers/bse/daily/groupa";
    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void testXpathAxis(){
        // Self   --- Select the Current Node
        String text = driver.findElement(By.xpath("//a[contains(text(),'SBI')]/self::a")).getText();
        System.out.println(text);  // SBI

        //Parent - Select the parent of current node (always one)
        text = driver.findElement(By.xpath("//a[contains(text(),'SBI')]/parent::td")).getText();
        System.out.println(text); // SBI

        //Child - Select all children of current node (One or many)
        List<WebElement> childs = driver.findElements(By.xpath("//a[contains(text(),'SBI')]/ancestor::tr/child::td"));
        System.out.println("Number of Child Element :" +childs.size());

        // Ancestor - Selects all ancestors (parent grandparent etc)
        text = driver.findElement(By.xpath("//a[contains(text(),'SBI')]/ancestor::tr")).getText();
        System.out.println(text);

        // Descendant - Select all descendants (children, grand children, etc)
        List<WebElement> descendent = driver.findElements(By.xpath("//a[contains(text(),'SBI')]/ancestor::tr/descendant::*"));
        System.out.println("Number of Descendant Element :" +descendent.size());

        // Following - Selects everything in documents after the closing tag of the current node
        List<WebElement> following = driver.findElements(By.xpath("//a[contains(text(),'SBI')]/ancestor::tr/following::tr"));
        System.out.println("Number of Following Element :" +following.size());

        // Following-sibling Selects all siblings after the current node
        //a[contains(text(),'SBI')]/ancestor::tr/following-sibling::tr

        // Preceding - Selects all nodes that appear before the current node in the document
        //a[contains(text(),'SBI')]/ancestor::tr/preceding::tr

        // Preceding-sibling - Select all siblings before the current node
        //a[contains(text(),'SBI')]/ancestor::tr/preceding-sibling::tr
    }

    @After
    public void tearDown(){
        closeBrowser();
    }

}
