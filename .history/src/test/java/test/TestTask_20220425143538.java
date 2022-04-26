package test;

import org.junit.Test;
import org.openqa.selenium.By;

import page.BasePage;
import page.MainPage;

public class TestTask extends TestBase {

    @Test

    public void login() {
        mainPage.loginOnStepUrl();
        
BasePage.isElementDisplayed(By.xpath(MainPage.ho))
    }

    @Test
    public void checkKeywordsPage() {
        mainPage.loginOnStepUrl();
        mainPage.keywordsClick();
        checkPage.checkKeywordsPageLoaded();
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