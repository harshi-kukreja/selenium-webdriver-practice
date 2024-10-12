import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AmazonDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;

        System.setProperty("webdriver.edge.driver","C:\\Users\\harsh\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 15 pro max");
        driver.findElement(By.id("nav-search-submit-button")).click();
        //driver.findElement(By.linkText("Apple iPhone 15 Pro Max (256 GB) - Blue Titanium")).click();
        driver.get("https://www.amazon.in/Apple-iPhone-Pro-Max-256/dp/B0CHX1K2ZC/ref=sr_1_1_sspa?crid=1L0QVN3VGJ5W1&keywords=iphone+15+pro+max&qid=1705647967&sprefix=iphone%2Caps%2C208&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&psc=1");
        //driver.findElement(By.id("add-to-cart-button")).click();
        WebElement AddToCart= driver.findElement(By.xpath("//input[@id=\"add-to-cart-button\"]"));
        AddToCart.click();
        WebElement CheckOut= driver.findElement(By.xpath("//input[@class=\"a-button-input\"]"));
        CheckOut.click();
        Thread.sleep(2000);
        driver.close();
    }
}
