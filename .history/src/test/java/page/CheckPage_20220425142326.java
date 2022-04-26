package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckPage extends BasePage {

    public CheckPage(WebDriver driver) {
        super(driver);

    }

    public void checkHomePageIsCorrect() {
        isElementDisplayed(By.xpath(MainPage.homePageElement));
    }

    public void checkKeywordsPageLoaded() {
        isElementDisplayed(By.xpath(MainPage.keywordsPageElement));
    }

    public void checkParametersPageLoaded() {
        isElementDisplayed(By.xpath(MainPage.parametersPageElement));
    }

    public void checkExecutionPageLoaded() {
        isElementDisplayed(By.xpath(MainPage.executionsPageElement));
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
