package test;







import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;







public class TestTask extends TestBase {


    @Test
    
  

    // public void clearUsername() {
    //     getElement(By.cssSelector("[name='username']"))
    // }
    
    public void login() {
        main.goTo();

        


      
        
        // System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kisli\\Downloads\\chromedriver\\chromedriver.exe");
        // WebDriver driver = new ChromeDriver();
        // driver.manage().window().maximize();
        // driver.get("http://localhost:8080/");
            // WebDriver.findElement(By.name("username"));
        
        WebElement username = driver.findElement(By.cssSelector("[name='username']"));
        username.sendKeys("asdasdasfasdasd");
        WebElement password=driver.findElement(By.cssSelector("[name='password']"));
        password.sendKeys("asdasdasdasdasd");
    
       
        main.submit();
        checkPage.checkPageIsCorrect();
        


        
        
    }



}