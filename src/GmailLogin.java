import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GmailLogin {
    public static void main(String[] args) {
        WebDriver driver;
        driver= new EdgeDriver();
        driver.get("https://mail.google.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("identifierId")).sendKeys("");
        //driver.findElement(By.className("VfPpkd-vQzf8d")).click();
        driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
        driver.findElement(By.xpath("//*[@id=\"next\"]/div/div/a")).click();
        driver.getTitle();
    }
}
