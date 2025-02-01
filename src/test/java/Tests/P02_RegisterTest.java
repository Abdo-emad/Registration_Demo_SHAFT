package Tests;

import Pages.P03_RegistrationPage;
import Pages.P04_AccountPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import java.io.IOException;


public class P02_RegisterTest extends P01_TestBase{
    SoftAssert softAssert= new SoftAssert();
    P03_RegistrationPage p03RegistrationPage;
    P04_AccountPage p04AccountPage;
    String CurrentDate = String.valueOf(System.currentTimeMillis());
    String EmailValue="AB"+CurrentDate+"@gmail.com";

    @Test()
    public void validRegistration() throws IOException, InterruptedException {
        p02_homePage.clickOnMyAccountButton();
        p03RegistrationPage = p02_homePage.clickOnRegisterButton();
        // Generate New Email By using Current TimeStamp
       // p03RegistrationPage.FillingRegistrationForm("A","B",EmailValue,"123456789","P@ssw0rd");
        System.out.println(EmailValue);
         //Using Excel Sheet Data
        p03RegistrationPage.FillingRegistrationForm(testData.getCellData("FirstName"),testData.getCellData("LastName"),EmailValue,testData.getCellData("Telephone"),testData.getCellData("Password"));
        p04AccountPage = p03RegistrationPage.ClickOnSubmitButton();
        softAssert.assertTrue(p04AccountPage.getSuccessMessage().equalsIgnoreCase("Congratulations! Your new account has been successfully created!"));
        softAssert.assertTrue(p04AccountPage.IsLogoutVisible());
        softAssert.assertAll();
        p04AccountPage.logOut();
    }

}
