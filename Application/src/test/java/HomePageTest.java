import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends FSBase {

    public static String signInLink;

    @Test
    public void testLandingPage() throws Exception {

        waitSometime(5000);
        String title = driver.getTitle();

        Assert.assertEquals(title, "FinalScore");



    }

}