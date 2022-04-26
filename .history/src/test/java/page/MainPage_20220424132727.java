package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v95.css.model.Value;

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
    public void enterPassword() {
        password(By.cssSelector("[name='password']"));
    }

}
