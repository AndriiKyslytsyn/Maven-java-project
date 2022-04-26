package test;

import org.junit.Test;

public class TestTask extends TestBase {

    @Test

    public void login() {
        MainPage.loginOnStepUrl();
        CheckPage.checkHomePageIsCorrect();
    }

    public void checkKeywordsPage() {

        MainPage.keywordsClick();
        CheckPage.checkKeywordsPageLoaded();
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