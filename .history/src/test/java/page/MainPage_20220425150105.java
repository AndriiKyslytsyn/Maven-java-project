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

    public static void parametersClick() {
        click(By.xpath(parameters));
    }

    public static void executionsClick() {
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
