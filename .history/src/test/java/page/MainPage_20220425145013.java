package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {
    static String Site_Url = "http://localhost:8080/";

    // Credentials
    static String username = "admin";
    static String password = "init";
    // login inputs and submit
    static String usernameInput = "[name='username']";
    static String passwordInput = "[name='password']";
    static String submitButton = "//button[@type='submit']";

    // Element for check loaded page
    public static String homePageElement = "//p[contains(text(),'STEP 3.18.3 - Copyright')]";
    static String keywordsPageElement = "//button[contains(text(), 'New keyword')]";
    static String parametersPageElement = "//button[contains(text(), 'New parameter')]";
    static String executionsPageElement = "//a[contains(text(), ' Execution list ')]";
    static String schedulerPageElement = "//button[contains(text(), 'New task')]";
    static String gridPageElement = "//a[contains(text(), 'Agents')]";

    // Chenge page locators
    static String keywords = "//a[contains(text(),'Keywords')]";
    static String parameters = "//a[contains(text(),'Parameters')]";
    static String executions = "//a[contains(text(),'Executions')]";
    static String schedule = "//a[contains(text(),' Scheduler')]";
    static String grid = "//a[contains(text(),' Grid')]";
    static String admin = "//a[contains(text(),' Admin')]";

    public MainPage(WebDriver driver) {
        super(driver);

    }

    public static void loginOnStepUrl() {

        goTo();
        enterUsername();
        enterPassword();
        submit();
    }

    public static void goTo() {
        driver.get(Site_Url);
    }

    public static void enterUsername() {
        username(By.cssSelector(usernameInput));

    }

    public static void enterPassword() {
        password(By.cssSelector(passwordInput));
    }

    public static void submit() {
        click(By.xpath(submitButton));
    }

    public static void keywordsClick() {
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
        click(By.xpath(grid));
    }

    public void adminClick() {
        click(By.xpath(admin));
    }

}