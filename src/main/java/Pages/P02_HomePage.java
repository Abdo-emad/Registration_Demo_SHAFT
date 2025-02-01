package Pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class P02_HomePage extends P01_PageBase{
    public P02_HomePage(SHAFT.GUI.WebDriver driver) {
        super(driver);
    }

    By myAccountButton = By.xpath("//span[text()='My Account']");
    By registerButton = By.linkText("Register");
    public void clickOnMyAccountButton(){
        //driver.element().click(myAccountButton);
        ClickOnElement(myAccountButton);
    }

    public P03_RegistrationPage clickOnRegisterButton(){
        //driver.element().click(registerButton);
        ClickOnElement(registerButton);
        return new P03_RegistrationPage(driver);
    }
}
