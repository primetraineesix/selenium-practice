package selectexample;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utiliies.Utility;

import java.util.List;

/**
 * Created by Jay Vaghani
 */
public class TestListDropDown extends Utility {

    String baseUrl = "https://www.hdfcbank.com/?__cf_chl_jschl_tk__=QsTJG3tVzXOmxUH0XTFJk9Z_pmLgE1W9q0A0CovpMhg-1637417525-0-gaNycGzNDRE";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void dropDownExampleWithList(){

        List<WebElement> productType = driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
        for (WebElement product:productType ) {
            if (product.getText().equalsIgnoreCase("Loans")){
                product.click();
            }

        }


    }
}
