package test;

import org.junit.Test;
import org.openqa.selenium.By;

import page.AdminPage;
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
        BasePage.isElementDisplayed(By.xpath(MainPage.homePageElement));
    }

    @Test
    public void checkKeywordsPage() {
        MainPage.keywordsClick();
        BasePage.isElementDisplayed(By.xpath(KeywordsPage.keywordsPageElement));
    }

    @Test
    public void checkParametersPage() {
        MainPage.parametersClick();
        BasePage.isElementDisplayed(By.xpath(ParametersPage.parametersPageElement));

    }

    @Test
    public void checkExecutionsPage() {

        MainPage.executionsClick();
        BasePage.isElementDisplayed(By.xpath(ExecutionsPage.executionsPageElement));

    }

    @Test
    public void checkSchedulePage() {

        MainPage.scheduleClick();
        BasePage.isElementDisplayed(By.xpath(SchedulerPage.schedulerPageElement));

    }

    @Test
    public void checkGridPage() {

        MainPage.gridClick();
        BasePage.isElementDisplayed(By.xpath(GridPage.gridPageElement));

    }

    @Test
    public void checkAdminPage() {

        MainPage.adminClick();
        BasePage.isElementDisplayed(By.xpath(AdminPage.adminPageElement));

    }

    // page to main
    // структурна організація тесту
    // driver factory & login to main(before & after)

}