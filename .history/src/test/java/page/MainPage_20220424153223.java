package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {
    String Site_Url = "http://localhost:8080/";
    static String username = "admin";
    static String password = "init";
    static String keywordPageElement = "//button[contains(text(), 'New keyword')]";
    static String parametersPageElement = "//button[contains(text(), 'New parameter')]";
    static String executionPageElement = 

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
