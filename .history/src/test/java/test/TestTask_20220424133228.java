package test;







import org.junit.Test;

import page.BasePage;









public class TestTask extends TestBase {


    @Test
    
  

    // public void clearUsername() {
    //     getElement(By.cssSelector("[name='username']"))
    // }
    
    public void login() {
        main.goTo();
        main.enterUsername();
        main.enterPassword();  
        main.submit();
        checkPage.checkPageIsCorrect();
        BasePage.
        


        
        
    }



}