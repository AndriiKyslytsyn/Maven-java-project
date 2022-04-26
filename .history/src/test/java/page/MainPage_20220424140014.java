package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class MainPage extends BasePage{
    String Site_Url = "http://localhost:8080/";
    String username = "admin";
    String password = "init";
    public MainPage(WebDriver driver) {
        super(driver);
        
    }
    
    public void goTo() {
        driver.get(Site_Url);
    }
    public void submit() {
        click(By.xpath("//button[@type='submit']"));
    }
    public void enterUsername() {
        username(((Object) By.cssSelector("[name='username']")).sendKeys(username));
    }
    public void enterPassword() {
        password(By.cssSelector("[name='password']"));
    }

}
