import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Facebook extends Base {

    public static WebDriver driver;

    @Test
    public void facebook() throws InterruptedException {


        driver = new ChromeDriver();

//        open facebook
        driver.navigate().to("https://www.facebook.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);

//        fast name
        driver.findElement(By.xpath("//*[@id=\"u_0_c\"]")).sendKeys("abe");
        Thread.sleep(5000);
//        last name
        driver.findElement(By.xpath("//*[@id=\"u_0_e\"]")).sendKeys("xyz");
        Thread.sleep(5000);
//        phone number
        driver.findElement(By.xpath("//*[@id=\"u_0_h\"]")).sendKeys("5712750000");
        Thread.sleep(5000);
//        password
        driver.findElement(By.xpath("//*[@id=\"u_0_o\"]")).sendKeys("123456");
        Thread.sleep(5000);

//        birthday(dropDown)
        Select month = new Select(driver.findElement(By.xpath("//*[@id=\"month\"]")));
        month.selectByIndex(3);

        Select day = new Select(driver.findElement(By.xpath("//*[@id=\"day\"]")));
        day.selectByValue("27");

        Select year = new Select(driver.findElement(By.xpath("//*[@id=\"year\"]")));
        year.selectByVisibleText("1991");
        Thread.sleep(5000);

//        male
        driver.findElement(By.xpath("//*[@id=\"u_0_a\"]")).click();
        Thread.sleep(5000);
//        sign up
        driver.findElement(By.xpath("//*[@id=\"u_0_u\"]")).click();
        Thread.sleep(5000);

        driver.navigate().refresh();




//        fast name
        driver.findElement(By.xpath("//*[@id=\"u_0_c\"]")).sendKeys("mahabub");
        Thread.sleep(5000);
//        last name
        driver.findElement(By.xpath("//*[@id=\"u_0_e\"]")).sendKeys("md");
        Thread.sleep(5000);
//        phone number
        driver.findElement(By.xpath("//*[@id=\"u_0_h\"]")).sendKeys("123456789");
        Thread.sleep(5000);
//        password
        driver.findElement(By.xpath("//*[@id=\"u_0_o\"]")).sendKeys("123456");
        Thread.sleep(5000);

//        birthday(DropDown)
        Select month2 = new Select(driver.findElement(By.xpath("//*[@id=\"month\"]")));
        month2.selectByIndex(5);

        Select day2 = new Select(driver.findElement(By.xpath("//*[@id=\"day\"]")));
        day2.selectByValue("29");

        Select year2 = new Select(driver.findElement(By.xpath("//*[@id=\"year\"]")));
        year2.selectByVisibleText("1993");
        Thread.sleep(5000);

//        male
        driver.findElement(By.xpath("//*[@id=\"u_0_a\"]")).click();
        Thread.sleep(5000);
//        sign up
        driver.findElement(By.xpath("//*[@id=\"u_0_u\"]")).click();
        Thread.sleep(5000);






















    }
}
