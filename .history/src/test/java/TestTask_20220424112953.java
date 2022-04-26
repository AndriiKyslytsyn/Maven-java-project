

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestTask {
    String Site_Url = "http://localhost:8080/";
    WebDriver driver;
    

    @Before
    public void start() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Dura300);
    }


    @Test
    
  

    // public void clearUsername() {
    //     getElement(By.cssSelector("[name='username']"))
    // }
    
    public void login() {
      
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kisli\\Downloads\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:8080/");
            // WebDriver.findElement(By.name("username"));
        
        //  WebElement username = driver.getE(By.cssSelector("[name='username']"));
        //WebElement password=driver.findElement(By.cssSelector("[name='password']");
    
        //WebElement login = driver.findElement(By.cssSelector(".input-group-btn"));
        
        //username.sendKeys("admiwerwerwern");
        // password.sendKeys("init");
        //login.click();
        

        
        
    }

}