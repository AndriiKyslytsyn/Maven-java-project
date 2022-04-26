package test;







import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;








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
        WebDriverWait
        


        
        
    }



}