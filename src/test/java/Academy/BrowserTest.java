package Academy;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {

    @Test
    public void getData() {
        System.out.println("Hello Guys");

        // Manually set up the ChromeDriver path
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\femip\\git\\Automation\\lib\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        
        driver.get("http://localhost:8080/webapp/");
        
        String text = driver.findElement(By.cssSelector("h1")).getText();
        System.out.println(text);
        
        Assert.assertTrue(text.equalsIgnoreCase("RahulShettyAcademy.com Learning"));
        
        driver.close();
    }
}
