import PageObject.Homepage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInTest extends FSBase {
    Homepage homePageObj = new Homepage();

    @Test
    public void testNewlogin() throws InterruptedException {
        clickByXpath(Homepage.signInLink);
        Thread.sleep(10000);
        clickByCssSelectorAndSendKeys(Homepage.emailField, "footlockertesting@gmail.com");
        Thread.sleep(5000);
        clickByCssSelectorAndSendKeys(Homepage.passwordField, "Test@1234");
        Thread.sleep(5000);
//        clickByXpath(Homepage.signInButton);
//        List<WebElement> element = driver.findElements(By.tagName("button"));
        driver.findElement(By.cssSelector("body > div:nth-child(14) > div > div > div > form > div.row.c-sign-in-form__actions > div:nth-child(2) > button")).click();
        String accoumtName = driver.findElement(By.id("accountActions")).getText();
        Assert.assertEquals(accoumtName,"Hi, Md");
//        driver.findElement(By.className("c-btn c-btn--primary")).click();
        Thread.sleep(10000);
        typeByXpathAndSendKeys(Homepage.searchField, "men shop");
        Thread.sleep(10000);

    }










    @Test(enabled = false)
    public void testFSSignIn() throws InterruptedException {
        fsLogin();
        //Assert.assertEquals(driver.getTitle(), "Message Inbox | Secure Message Center");

    }

}