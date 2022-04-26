package com.mycompany.app;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginUsingSelenium {

    @Test
    public void login() {
      
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kisli\\Downloads\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:8080/");
        
         WebElement username = driver.getClass(By.name("username"));
        // WebElement password=driver.findElement(By.cssSelector("[name='password']");
    
        //WebElement login = driver.findElement(By.cssSelector(".input-group-btn"));
        
         //username.sendKeys("admin");
        // password.sendKeys("init");
        login.click();
        

        
        
    }

}