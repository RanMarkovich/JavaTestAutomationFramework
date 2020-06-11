import org.junit.Assert;
import org.junit.*;


public class UnitTest {

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "/Users/ranmarkovich/projects/mmservices/tests/ui_tests/chromedriver");
    }
    @Test
    public void canGoToHomePage(){
        Pages.homePage().goTo();
        Assert.assertTrue(Pages.homePage().isAt());
    }

    @After
    public void tearDown(){
        Browser.close();
    }


}