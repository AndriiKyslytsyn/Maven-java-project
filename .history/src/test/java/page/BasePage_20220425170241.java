package page;

import static org.junit.Assert.assertTrue;

import java.time.Duration;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    public static WebDriver driver;
    public static WebDriverWait wait;

    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));

    }

    public void waitVisibility(By elementBy) {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(elementBy));
    }

    public void click(By elementBy) {
        waitVisibility(elementBy);
        driver.findElement(elementBy).click();
    }

    public  void isPageElementDisplayedOnTheTestPage(By elementBy) {
        waitVisibility(elementBy);
        assertTrue("Element not ", driver.findElement(elementBy).isDisplayed());
       


    }

    public  void username(By elementBy) {
        waitVisibility(elementBy);
        driver.findElement(elementBy).clear();
        driver.findElement(elementBy).sendKeys(MainPage.username);
    }

    public  void password(By elementBy) {
        waitVisibility(elementBy);
        driver.findElement(elementBy).clear();
        driver.findElement(elementBy).sendKeys(MainPage.password);
    }

}