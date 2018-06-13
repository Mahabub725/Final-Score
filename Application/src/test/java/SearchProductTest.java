import PageObject.HomePage;
import PageObject.Homepage;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.io.IOException;

public class SearchProductTest extends FSBase {

//    public static String testDataFilePath = "/Users/malam2/Desktop/WEB2/Application/src/test/Data/test_data.xlsx";
//
//    @Test
//    public void searchProduct() throws Exception {
//
////        String product = readFromExcel(testDataFilePath, "Product", "A2");
////        clickByXPathAndSendKeys(Homepage.searchField, product);
////        clickByXpath(Homepage.searchIcon);
////        Thread.sleep(5000);
//
//        takeTheScreenshot(new Object(){}.getClass().getEnclosingMethod().getName());
//    }


    // Write 5 other test cases here ...
//test case 01
    @Test
    public void dep() throws Exception {

        driver.findElement(By.xpath(Homepage.dep));
        Actions action = new Actions(driver);
        action.perform();
        Thread.sleep(5000);
        driver.findElement(By.xpath(Homepage.prime));
        Actions action1 = new Actions(driver);
        action.perform();
        Thread.sleep(5000);
        clickByXpath(Homepage.all);
        takeTheScreenshot(new Object(){}.getClass().getEnclosingMethod().getName());
    }
    //    test case 02
    @Test
    public void deals() throws Exception {
        clickByXpath(Homepage.todays_deal);
        Thread.sleep(5000);
        clickByXpath(Homepage.amazon_deals);
        Thread.sleep(5000);

    }
    //        test case 03
    @Test
    public void search () throws Exception {
        clickByCssSelectorAndSendKeys(Homepage.search, "iphone 11");
        Thread.sleep(5000);
        clickByXpath(Homepage.click);
        Thread.sleep(5000);

    }

    //    test case 04
    @Test
    public void checkout () throws Exception {
        clickByXpath(Homepage.cart);
        Thread.sleep(5000);
        clickByXpath(Homepage.checkout);
        Thread.sleep(5000);

    }
    //test case 05
    @Test
    public void get_text () throws Exception {
        driver.findElement(By.xpath(Homepage.get_text));
        System.out.println(driver.getTitle());

    }

}
