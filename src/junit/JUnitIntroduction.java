package junit;

import org.junit.*;

/**
 * Created by Jay Vaghani
 */
public class JUnitIntroduction {

    @BeforeClass
   public static void connectDB(){
        System.out.println("DB connection");
    }

    @AfterClass
    public static void closeConnection(){
        System.out.println("Close DB connection");
    }

    @Before
    public void openBrowser(){
        System.out.println("Opening browser");
    }


    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessFully(){
        System.out.println("Navigate to login page");
    }

    @Test
    public void test1(){
        System.out.println("Test1");
    }

    @After
    public void closeBrowser(){
        System.out.println("closing browser");
    }


}
