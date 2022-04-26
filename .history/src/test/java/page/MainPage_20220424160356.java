package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {
    String Site_Url = "http://localhost:8080/";

    // Credentials
    static String username = "admin";
    static String password = "init";
    // login inputs and submit
    static String usernameInput = "[name='username']";
    static String passwordInput = "[name='password']";
    static String submitButton = "//button[@type='submit']";
    
    // Element for check loaded page
    static String keywordsPageElement = "//button[contains(text(), 'New keyword')]";
    static String parametersPageElement = "//button[contains(text(), 'New parameter')]";
    static String executionsPageElement = "//a[contains(text(), ' Execution list ')]";
    static String schedulerPageElement = "//button[contains(text(), 'New task')]";
    static String gridPageElement = "//a[contains(text(), 'Agents')]";
    static String adminPageElement = "//button[contains(text(), 'Add user')]";
    //Chenge page locators
    static String keywords = "//a[contains(text(),'Keywords')]";
    static String parameters = "//a[contains(text(),'Parameters')]";
    static String executions = "//a[contains(text(),'Executions')]";
    static String schedule = "//a[contains(text(),' Scheduler')]";
    static String grid = "//a[contains(text(),' Grid')]";
    static String admin = "//a[contains(text(),' Admin')]";

    

    public MainPage(WebDriver driver) {
        super(driver);

    }

    public void goTo() {
        driver.get(Site_Url);
    }

    public void submit() {
        click(By.xpath(submitButton));
    }
    public void keywordsClick() {
        click(By.xpath(keywords));
    }
    public void parametersClick() {
        click(By.xpath(parameters));
    }
    public void executionsClick() {
        click(By.xpath(executions));
    }
    public void scheduleClick() {
        click(By.xpath(schedule));
    }
    public void gridClick() {
        
    }

    public void enterUsername() {
        username(By.cssSelector(usernameInput));

    }

    public void enterPassword() {
        password(By.cssSelector(passwordInput));
    }

}
