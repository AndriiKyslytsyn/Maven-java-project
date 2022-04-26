package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckPage extends BasePage {

    public CheckPage(WebDriver driver) {
        super(driver);

    }

    public void checkHomePageIsCorrect() {
        isElementDisplayed(By.xpath("//p[contains(text(),'STEP 3.18.3 - Copyright')]"));
    }
    public void checkKeywordsPageLoaded() {
        isElementDisplayed(By.xpath(MainPage.keywordPageElement));
    }
    public void checkParametersPageLoaded() {
        isElementDisplayed(By.xpath(MainPage.parametersPageElement));
    }
    public void checkExecutionPageLoaded() {
        isElementDisplayed(By.xpath(MainPage.executionPageElement));
    }
    public void checkSchedulePageLoaded() {
        isElementDisplayed(By.xpath(MainPage.schedulerPageElement));
    }
    public void checkGridPageLoaded() {
        isElementDisplayed(By.xpath(MainPage.gridPageElement));
    }
    public void checkAdminPageLoaded() {
        isElementDisplayed(By.xpath(MainPage.adminPageElement));
    }

}
