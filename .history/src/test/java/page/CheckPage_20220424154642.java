package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckPage extends BasePage {

    public CheckPage(WebDriver driver) {
        super(driver);

    }

    public void checkHomePageIsCorrect() {
        isElementDisplayed(By.xpath("//p[contains(text(),'STEP 3.18.3 - Copyright')]"));
    }
    public void checkKeywordsPage() {
        isElementDisplayed(By);
    }

}
