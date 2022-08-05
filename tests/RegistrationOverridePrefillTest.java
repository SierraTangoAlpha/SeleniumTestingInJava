package base;
import pages.*;
import org.testng.annotations.Test;
import static org.testng.Assert.*;


public class RegistrationOverridePrefillTest extends BaseTests {

    @Test
    public void testGettingThere () {

        RegistrationPage registrationPage = intermediatePage.fillEmailAndClick();

        //Fill forms
        registrationPage.fillFirstNameCustomer("SomeFirstName");
        assertEquals(registrationPage.getFirstNameCustomer(), "SomeFirstName");

        registrationPage.fillLastNameCustomer("SomeLastName");
        assertEquals(registrationPage.getLastNameCustomer(), "SomeLastName");

        registrationPage.fillPasswordCustomer("aGenericPassword");
        assertEquals(registrationPage.getPasswordCustomer(), "aGenericPassword");

        registrationPage.clearFirstName();
        registrationPage.clearLastName();

        registrationPage.fillFirstName("SomeFirstName");
        assertEquals(registrationPage.getFirstName(), "SomeFirstName");

        registrationPage.fillLastName("SomeLastName");
        assertEquals(registrationPage.getLastName(), "SomeLastName");

        registrationPage.fillCompany("SomeCompany");
        assertEquals(registrationPage.getCompany(), "SomeCompany");

        registrationPage.fillAddress("SomeAddress");
        assertEquals(registrationPage.getAddress(), "SomeAddress");

        registrationPage.fillCity("SomeCity");
        assertEquals(registrationPage.getCity(), "SomeCity");

        registrationPage.fillPostCode(59800);
        assertEquals(registrationPage.getPostcode(), "59800");

        registrationPage.fillPhone(456845699);
        assertEquals(registrationPage.getPhone(), "456845699");


        //Choose and check
        registrationPage.chooseGender("male");
        assertTrue(registrationPage.isChecked("male"));

        registrationPage.chooseDays();
        assertEquals(registrationPage.daysList().size(), 1);
        registrationPage.chooseMonths();
        assertEquals(registrationPage.monthsList().size(), 1);
        registrationPage.chooseYears();
        assertEquals(registrationPage.yearsList().size(), 1);
        registrationPage.chooseStates();
        assertEquals(registrationPage.statesList().size(), 1);
    }




}
