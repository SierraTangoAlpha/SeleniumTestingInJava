package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;


public class RegistrationPage {

    private WebDriver driver;
    Random random = new Random();


    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }


    // Type-in forms
    private By firstNameCustomer = By.xpath("//input[@id='customer_firstname']");
    private By lastNameCustomer = By.xpath("//input[@id='customer_lastname']");
    private By passwordCustomer = By.xpath("//input[@id='passwd']");

    private By firstName = By.xpath("//input[@id='firstname']");
    private By lastName = By.xpath("//input[@id='lastname']");
    private By companyName = By.xpath("//input[@id='company']");
    private By address1 = By.xpath("//input[@id='address1']");
    private By cityName = By.xpath("//input[@id='city']");
    private By postcodeNumber = By.xpath("//input[@id='postcode']");
    private By phoneNumber = By.xpath("//input[@id='phone_mobile']");

    // Radio buttons
    private By genderButtonMale = By.xpath("//input[@id='id_gender1']");
    private By genderButtonFemale = By.xpath("//input[@id='id_gender2']");

    //Dropdown menus
    private By days = By.xpath("//select[@id='days']");
    private By months = By.xpath("//select[@id='months']");
    private By years = By.xpath("//select[@id='years']");
    private By states = By.xpath("//select[@id='id_state']");

    //Get methods

    //////////////////////////////////////////////////////////////////////////

    public String getFirstNameCustomer() {
        return driver.findElement(firstNameCustomer).getAttribute("value");
    }
    public String getLastNameCustomer() {
        return driver.findElement(lastNameCustomer).getAttribute("value");
    }
    public String getPasswordCustomer() {
        return driver.findElement(passwordCustomer).getAttribute("value");
    }
    public String getFirstName() {
        return driver.findElement(firstName).getAttribute("value");
    }
    public String getLastName() {
        return driver.findElement(lastName).getAttribute("value");
    }
    public String getAddress() {
        return driver.findElement(address1).getAttribute("value");
    }
    public String getCity() {
        return driver.findElement(cityName).getAttribute("value");
    }
    public String getPostcode() {
        return driver.findElement(postcodeNumber).getAttribute("value");
    }
    public String getCompany() {
        return driver.findElement(companyName).getAttribute("value");
    }
    public String getPhone() {
        return driver.findElement(phoneNumber).getAttribute("value");
    }
    public Boolean isChecked(String gender){
        String findByGender = gender.toLowerCase();
        if (findByGender.equals("male")) {
            return driver.findElement(genderButtonMale).isSelected();
        }
        else if (findByGender.equals("male")) {
            return driver.findElement(genderButtonFemale).isSelected();
        }
        else {return false;}
    }

    //////////////////////////////////////////////////////////////////////////

    //Fill-in methods
    public void fillFirstNameCustomer(String name) {
        driver.findElement(firstNameCustomer).sendKeys(name);
    }
    public void fillLastNameCustomer(String name) {
        driver.findElement(lastNameCustomer).sendKeys(name);
    }
    public void fillPasswordCustomer(String name) {
        driver.findElement(passwordCustomer).sendKeys(name);
    }


    public void fillFirstName(String name){
        driver.findElement(firstName).sendKeys(name);
    }
    public void fillLastName(String name) {
        driver.findElement(lastName).sendKeys(name);
    }
    public void fillCompany(String company) {
        driver.findElement(companyName).sendKeys(company);
    }
    public void fillAddress(String address){
        driver.findElement(address1).sendKeys(address);
    }
    public void fillCity(String city) {
        driver.findElement(cityName).sendKeys(city);
    }
    public void fillPostCode(int postcode) {
        driver.findElement(postcodeNumber).sendKeys(String.valueOf(postcode));
    }
    public void fillPhone(int phone) {
        driver.findElement(phoneNumber).sendKeys(String.valueOf(phone));
    }
    private void chooseMale(){
        driver.findElement(genderButtonMale).click();
    }
    private void chooseFemale(){
        driver.findElement(genderButtonFemale).click();
    }
    public void chooseGender(String sex) {
        if(sex.toLowerCase()=="male") {chooseMale();}
        else if(sex.toLowerCase()=="female") {chooseFemale();}
        else {System.out.println("Sex invalid");}
    }

    //Clear methods

    public void clearFirstName() {
        driver.findElement(firstName).clear();
    }
    public void clearLastName() {
        driver.findElement(lastName).clear();
    }


    //Drop down menu methods

    // Days menu

    //////////////////////////////////////////////////////////////////////////

    public Select findDaysMenu() {
        return new Select(driver.findElement(days));
    }
    public void chooseDays() {
        findDaysMenu().selectByIndex(random.nextInt(10 ) + 1);
    }
    public List<String> daysList() {
        List<WebElement> list = findDaysMenu().getAllSelectedOptions();
        return list.stream().map(e->e.getText()).collect(Collectors.toList());
    }
    //////////////////////////////////////////////////////////////////////////

    // Months menu

    //////////////////////////////////////////////////////////////////////////
    public Select findMonthsMenu() {
        return new Select(driver.findElement(months));
    }
    public void chooseMonths() {
        findMonthsMenu().selectByIndex(random.nextInt(10 ) + 1);
    }
    public List<String> monthsList() {
        List<WebElement> list = findMonthsMenu().getAllSelectedOptions();
        return list.stream().map(e->e.getText()).collect(Collectors.toList());
    }
    //////////////////////////////////////////////////////////////////////////

    // Years menu

    //////////////////////////////////////////////////////////////////////////
    public Select findYearsMenu() {
        return new Select(driver.findElement(years));
    }
    public void chooseYears() {
        findYearsMenu().selectByIndex(random.nextInt(10 ) + 1);
    }
    public List<String> yearsList() {
        List<WebElement> list = findYearsMenu().getAllSelectedOptions();
        return list.stream().map(e->e.getText()).collect(Collectors.toList());
    }
    //////////////////////////////////////////////////////////////////////////

    //States menu

    //////////////////////////////////////////////////////////////////////////
    public Select findStatesMenu() {
        return new Select(driver.findElement(states));
    }
    public void chooseStates() {
        findStatesMenu().selectByIndex(random.nextInt(10 ) + 1);
    }
    public List<String> statesList() {
        List<WebElement> list = findStatesMenu().getAllSelectedOptions();
        return list.stream().map(e->e.getText()).collect(Collectors.toList());
    }
    //////////////////////////////////////////////////////////////////////////

}
