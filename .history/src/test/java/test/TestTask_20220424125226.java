package test;







import org.junit.Test;







public class TestTask extends TestBase {


    @Test
    
  

    // public void clearUsername() {
    //     getElement(By.cssSelector("[name='username']"))
    // }
    
    public void login() {
        main.goTo();
        main.submit();
        checkPage.checkPageIsCorrect();
        wait();


      
        
        // System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kisli\\Downloads\\chromedriver\\chromedriver.exe");
        // WebDriver driver = new ChromeDriver();
        // driver.manage().window().maximize();
        // driver.get("http://localhost:8080/");
            // WebDriver.findElement(By.name("username"));
        
        //  WebElement username = driver.getE(By.cssSelector("[name='username']"));
        //WebElement password=driver.findElement(By.cssSelector("[name='password']");
    
        //WebElement login = driver.findElement(By.cssSelector(".input-group-btn"));
        
        //username.sendKeys("admiwerwerwern");
        // password.sendKeys("init");
        //login.click();
        

        
        
    }

}