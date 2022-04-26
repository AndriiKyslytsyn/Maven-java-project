package page;

import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage{
    String Site_Url = "http://localhost:8080/";
    public MainPage(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }
    
    public void goTo() {
        driver.get(Site_Url);
    }
    public void submit() {
        click(By);
    }
}
