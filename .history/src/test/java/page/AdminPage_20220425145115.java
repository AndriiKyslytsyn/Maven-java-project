package page;

import org.openqa.selenium.WebDriver;

public class AdminPage extends MainPage{

    public AdminPage(WebDriver driver) {
        super(driver);

    }

    static String adminPageElement = "//button[contains(text(), 'Add user')]";    
    
}
