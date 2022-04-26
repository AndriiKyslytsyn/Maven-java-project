package test;

import org.junit.Test;
import org.openqa.selenium.By;

import page.BasePage;
import page.ExecutionsPage;
import page.GridPage;
import page.KeywordsPage;
import page.MainPage;
import page.ParametersPage;
import page.SchedulerPage;

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
        BasePage.isElementDisplayed(By.xpath(KeywordsPage.keywordsPageElement));
    }

    @Test
    public void checkParametersPage() {
        MainPage.loginOnStepUrl();
        MainPage.parametersClick();
        BasePage.isElementDisplayed(By.xpath(ParametersPage.parametersPageElement));

    }

    @Test
    public void checkExecutionsPage() {
        MainPage.loginOnStepUrl();
        MainPage.executionsClick();
        BasePage.isElementDisplayed(By.xpath(ExecutionsPage.executionsPageElement));

    }

    @Test
    public void checkSchedulePage() {
        MainPage.loginOnStepUrl();
        MainPage.scheduleClick();
        BasePage.isElementDisplayed(By.xpath(SchedulerPage.schedulerPageElement));

    }

    @Test
    public void checkGridPage() {
        MainPage.loginOnStepUrl();
        MainPage.gridClick();
        BasePage.isElementDisplayed(By.xpath(GridPage.gridPageElement));

    }

    @Test
    public void checkSchedulePage() {
        MainPage.loginOnStepUrl();
        MainPage.scheduleClick();
        BasePage.isElementDisplayed(By.xpath(SchedulerPage.schedulerPageElement));

    }




    // main.adminClick();
    // checkPage.checkAdminPageLoaded();
    // page to main
    // структурна організація тесту
    // driver factory & login to main(before & after)

}