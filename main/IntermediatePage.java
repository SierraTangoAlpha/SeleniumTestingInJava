package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class IntermediatePage {


        private WebDriver driver;


        private By emailForm = By.xpath("//input[@id='email_create']");
        private By button = By.xpath("//button[@id='SubmitCreate']");

        public IntermediatePage(WebDriver driver) {
            this.driver = driver;
        }

        public RegistrationPage fillEmailAndClick() {
            driver.findElement(emailForm).sendKeys("dawdwa@gmail.com");
            driver.findElement(button).click();
              WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
              wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='customer_firstname']")));
              return new RegistrationPage(driver);
            }
}
