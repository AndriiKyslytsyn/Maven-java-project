package test;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import page.MainPage;




public class TestBase {
    public WebDriver driver;
    public MainPage mainPage;


    @Before
    public void start() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        mainPage = PageFactory.initElements(driver, MainPage.class);


    }


    @After
    public void finish() {

        driver.quit();
    }

}
