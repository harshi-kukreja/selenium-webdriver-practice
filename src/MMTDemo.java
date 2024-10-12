import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class MMTDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver=new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","C:\\Users\\harsh\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();


        //to select fromCity
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='flt_fsw_inputBox searchCity inactiveWidget ']/label")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='autoSuggestPlugin hsw_autocomplePopup']/div/input")).sendKeys("Mumbai");

        List<WebElement> dynamicListFromCity = driver.findElements(By.cssSelector("p[class='font14 appendBottom5 blackText']"));

        for (int i=0;i<dynamicListFromCity.size();i++)
        {
            String text= dynamicListFromCity.get(i).getText();
            System.out.println("Text is:" +text);
            if(text.contains("Mumbai"))
            {
                dynamicListFromCity.get(i).click();
                break;
            }
        }

        // to select toCity

        driver.findElement(By.xpath("//div[@class='flt_fsw_inputBox searchToCity inactiveWidget ']/label")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='autoSuggestPlugin hsw_autocomplePopup makeFlex column spaceBetween']/div/input")).sendKeys("New Delhi");

        List<WebElement> dynamicListToCity = driver.findElements(By.cssSelector("p[class='font14 appendBottom5 blackText']"));

        for (int i=0;i<dynamicListToCity.size();i++)
        {
            String text= dynamicListToCity.get(i).getText();
            System.out.println("Text is:" +text);
            if(text.contains("Delhi"))
            {
                dynamicListToCity.get(i).click();
                break;
            }
        }

        //select departure date
        driver.findElement(By.xpath("//div[@class='flt_fsw_inputBox dates inactiveWidget ']/label")).click();
        Thread.sleep(3000);
        //driver.findElement(By.xpath(""));
       while(!driver.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[1]/span[2]")).getText().contains("July"));


//driver.findElement(By.xpath("//div[@class='flt_fsw_inputBox searchToCity inactiveWidget ']/label")).sendKeys("New Delhi");

      //  Thread.sleep(5000);
        //driver.close();
    }
}
