package test;

import org.junit.Test;
import org.openqa.selenium.By;

import page.AdminPage;

import page.ExecutionsPage;
import page.GridPage;
import page.KeywordsPage;
import page.MainPage;
import page.ParametersPage;
import page.SchedulerPage;

public class TestTask extends TestBase {

    @Test

    public void loginToStep() {
        basePage.isPageElementDisplayedOnTheTestPage(By.xpath(MainPage.homePageElement));
    }

    @Test
    public void checkKeywordsPage() {
        mainPage.keywordsClick();
        basePage.isPageElementDisplayedOnTheTestPage(By.xpath(KeywordsPage.keywordsPageElement));
    }

    @Test
    public void checkParametersPage() {
        mainPage.parametersClick();
        basePage.isPageElementDisplayedOnTheTestPage(By.xpath(ParametersPage.parametersPageElement));
    }

    @Test
    public void checkExecutionsPage() {
        mainPage.executionsClick();
        basePage.isPageElementDisplayedOnTheTestPage(By.xpath(ExecutionsPage.executionsPageElement));
    }

    @Test
    public void checkSchedulePage() {
        mainPage.scheduleClick();
        basePage.isElementDisplayed(By.xpath(SchedulerPage.schedulerPageElement));
    }

    @Test
    public void checkGridPage() {
        mainPage.gridClick();
        basePage.isElementDisplayed(By.xpath(GridPage.gridPageElement));
    }

    @Test
    public void checkAdminPage() {
        mainPage.adminClick();
        basePage.isElementDisplayed(By.xpath(AdminPage.adminPageElement));
    }


    // driver factory

}