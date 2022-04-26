package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {
    String Site_Url = "http://localhost:8080/";
    
    //Credentials
    static String username = "admin";
    static String password = "init";
    static String submitButton = ""
    //Element for check loaded page
    static String keywordPageElement = "//button[contains(text(), 'New keyword')]";
    static String parametersPageElement = "//button[contains(text(), 'New parameter')]";
    static String executionPageElement = "//a[contains(text(), ' Execution list ')]";
    static String schedulerPageElement = "//button[contains(text(), 'New task')]";
    static String gridPageElement = "//a[contains(text(), 'Agents')]";
    static String adminPageElement = "//button[contains(text(), 'Add user')]";
    //



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
