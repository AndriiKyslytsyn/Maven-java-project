package page;

import org.openqa.selenium.WebDriver;

public class CheckPage extends BasePage{

    public CheckPage(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }

    public void CheckPageIsCorrect() {
        isElementDisplayed(By);
    }
    
}
