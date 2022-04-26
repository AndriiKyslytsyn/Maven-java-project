
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
 
import java.util.concurrent.TimeUnit;
 
public class LoginTest {
    public static void main(String[] args) {
 
        System.setProperty("webdriver.chrome.driver",path_of_browser_driver);
        WebDriver driver = new ChromeDriver();
 
        String url = "https://www.lambdatest.com/";
 
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
 
 
        WebElement login = driver.findElement(By.linkText("Login"));
        System.out.println("Clicking on the login element in the main page");
        login.click();
 
        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
 
        WebElement email = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));
 
        email.clear();
        System.out.println("Entering the email");
        email.sendKeys("your_email");
 
        password.clear();
        System.out.println("entering the password");
        password.sendKeys("your_password");
 
        System.out.println("Clicking login button");
        loginButton.click();
 
        String title = "Welcome - LambdaTest";
 
        String actualTitle = driver.getTitle();
 
        System.out.println("Verifying the page title has started");
        Assert.assertEquals(actualTitle,title,"Page title doesnt match");
 
        System.out.println("The page title has been successfully verified");
 
        System.out.println("User logged in successfully");
 
        driver.quit();
    }
}
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
31
32
33
34
35
36
37
38
39
40
41
42
43
44
45
46
47
48
49
50
51
52
53
54
55
56
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
 
import java.util.concurrent.TimeUnit;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}
