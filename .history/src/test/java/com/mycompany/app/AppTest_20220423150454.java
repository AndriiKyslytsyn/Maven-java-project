package com.mycompany.app;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginUsingSelenium {

    @Test
    public void login() {
        // TODO Auto-generated method stub
        
        System.setProperty("webdriver.chrome.driver", "path of driver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:8080/");
        
        WebElement username=driver.findElement(By.xpath("//*[@name="username"]"));
        WebElement password=driver.findElement(By.xpath("//*[@name='password']"));
        WebElement login=driver.findElement(By.xpath("//button[text()='Login']"));
        
        username.sendKeys("admin");
        password.sendKeys("init");
        login.click();
        

        
        
    }

}