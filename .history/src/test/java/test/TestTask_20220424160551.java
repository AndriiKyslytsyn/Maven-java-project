package test;

import org.junit.Test;

public class TestTask extends TestBase {

    @Test

    public void login() {
        main.goTo();
        main.enterUsername();
        main.enterPassword();
        main.submit();
        checkPage.checkHomePageIsCorrect();
        main.keywordsClick();
        checkPage.checkKeywordsPageLoaded();
        main.parametersClick();
        checkPage.checkParametersPageLoaded();
        mai

    }
    

}