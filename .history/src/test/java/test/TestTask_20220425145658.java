package test;

import org.junit.Test;
import org.openqa.selenium.By;

import page.BasePage;
import page.KeywordsPage;
import page.MainPage;

public class TestTask extends TestBase {

    @Test

    public void login() {
        MainPage.loginOnStepUrl();

        BasePage.isElementDisplayed(By.xpath(MainPage.homePageElement));
    }

    @Test
    public void checkKeywordsPage() {
        MainPage.loginOnStepUrl();
        MainPage.keywordsClick();
        BasePage.isElementDisplayed(By.xpath(KeywordsPage.keywordsPage));
    }

    // main.parametersClick();
    // checkPage.checkParametersPageLoaded();
    // main.executionsClick();
    // checkPage.checkExecutionPageLoaded();
    // main.scheduleClick();
    // checkPage.checkSchedulePageLoaded();
    // main.gridClick();
    // checkPage.checkGridPageLoaded();
    // main.adminClick();
    // checkPage.checkAdminPageLoaded();
    // page to main
    // структурна організація тесту
    // driver factory & login to main(before & after)

}