package Pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class P03_RegistrationPage extends P01_PageBase{
    public P03_RegistrationPage(SHAFT.GUI.WebDriver driver) {
        super(driver);
    }
    By firstName = By.id("input-firstname");
    By lastName = By.id("input-lastname");
    By email = By.id("input-email");
    By telephone = By.id("input-telephone");
    By password = By.id("input-password");
    By confirmPass = By.id("input-confirm");
    By agree = By.cssSelector("[name='agree']");
    By submit = By.cssSelector("[type='submit']");

     public void FillingRegistrationForm(String fName,String lName , String Email, String Telephone,String pass){
     TypeIntoElement(firstName,fName);
     TypeIntoElement(lastName,lName);
     TypeIntoElement(email,Email);
     TypeIntoElement(telephone,Telephone);
     TypeIntoElement(password,pass);
     TypeIntoElement(confirmPass,pass);
     ClickOnElement(agree);
  /*    driver.element().type(firstName,fName);
      driver.element().type(lastName,lName);
      driver.element().type(email,Email);
      driver.element().type(telephone,Telephone);
      driver.element().type(password,pass);
      driver.element().type(confirmPass,pass);
      driver.element().click(agree);*/
    }
    public P04_AccountPage ClickOnSubmitButton(){
         ClickOnElement(submit);
       // driver.element().click(submit);
        return new P04_AccountPage(driver);
    }


}
