public class TestBase {

    String Site_Url = "http://localhost:8080/";
    WebDriver driver;
    

    @Before
    public void start() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @After
    public void finish() {
        driver.quit();
    }

    
}
