package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;
    private By signInButton = By.xpath("//a[@class='login']");


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public IntermediatePage clickOnSignIn() {
        driver.findElement(signInButton).click();
        return new IntermediatePage(driver);
    }
}
