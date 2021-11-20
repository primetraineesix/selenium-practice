package selectexample;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utiliies.Utility;

import java.util.List;

/**
 * Created by Jay Vaghani
 */
public class TestDropDown extends Utility {

    String baseUrl = "http://way2automation.com/way2auto_jquery/index.php";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void dropDownExample(){
        WebElement dropDown = driver.findElement(By.name("country"));
        Select select = new Select(dropDown);
        //Select by value
        select.selectByValue("Barbados");
//        selectByVisibleTextFromDropDown(By.name("country"), "country");
        //Select by visible text
        select.selectByVisibleText("Barbados");
        // Select by index
        select.selectByIndex(9);

        List<WebElement> allOptions = select.getOptions();
        System.out.println(allOptions.size());
        for (WebElement option: allOptions) {
            System.out.println(option.getText());
            if (option.getText().equalsIgnoreCase("Barbados")){
                option.click();
            }
        }

    }



}
