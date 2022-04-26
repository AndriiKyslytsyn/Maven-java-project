package com.mycompany.app;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginUsingSelenium {

    @Test
    public WebDriver driver {
        this.driver=driver;
    }

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
        
        username.sendKeys("admiwerwerwern");
        // password.sendKeys("init");
        //login.click();
        

        
        
    }

}