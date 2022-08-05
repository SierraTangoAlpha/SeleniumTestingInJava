package base;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.IntermediatePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseTests {

    private WebDriver driver;
    protected IntermediatePage intermediatePage;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        intermediatePage = new IntermediatePage(driver);
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @AfterTest
    public void turnDown() {
        driver.quit();
    }

}