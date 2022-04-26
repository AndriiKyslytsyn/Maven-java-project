package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage{
    String Site_Url = "http://localhost:8080/";
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
        username(By.cssSelector("[name='username']"));
    }
    public void enterPassword(Valu) {
        password(By.cssSelector("[name='password']")).sendKeys(passwordValue);
    }

}
