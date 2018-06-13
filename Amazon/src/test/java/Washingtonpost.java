import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Washingtonpost extends Base {

    private static WebDriver driver;
@Test

    public void Ebay() throws InterruptedException {

        driver = new ChromeDriver();

//        open washingtonpost
        driver.navigate().to("https://www.washingtonpost.com/?noredirect=on");
        driver.manage().window().maximize();
        Thread.sleep(3000);


//        get text
    WebElement element = driver.findElement(By.cssSelector("#f0UNEEmjjYmkUq > div > div > div.blurb.normal.normal-style"));

//    String text = driver.findElement(By.xpath("//a[contains(text(),'Trump dangles visit to White House for North Korea’s Kim if summit goes well')]")).getText();
    System.out.println(element.getText());






    }
}
