import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Amazon extends Base {

    public static WebDriver driver;

    @Test
    public void googleapp() throws InterruptedException {

        driver = new ChromeDriver();

//        open amazon
        driver.navigate().to("https://www.amazon.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);


//        search iphone
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("iphone");
        driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();

//        Depatments mouse pointer on dropdown/mouse hoper
       WebElement depatments = driver.findElement(By.xpath("//*[@id=\"nav-link-shopall\"]/span[2]"));
        Actions action = new Actions(driver);
        action.moveToElement(depatments).perform();
        Thread.sleep(5000);





        WebElement web = driver.findElement(By.xpath("//*[@id=\"nav-flyout-shopAll\"]/div[2]/span[1]/span"));
       Actions actions = new Actions(driver);
       actions.moveToElement(web).perform();
        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"nav-flyout-shopAll\"]/div[3]/div[1]/div[1]/div/a[1]/span[1]")).click();

//        driver.findElement(By.xpath("//*[@id=\"nav-flyout-shopAll\"]/div[2]/a/span")).click();








    }
}

