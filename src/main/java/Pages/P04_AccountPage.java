package Pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class P04_AccountPage extends P01_PageBase{
    public P04_AccountPage(SHAFT.GUI.WebDriver driver) {
        super(driver);
    }
    By successMsg = By.xpath("(//div[@id='content']//p)[1]");
    By myAccountButton = By.xpath("//span[text()='My Account']");
    //By logoutButton = By.linkText("Logout");
    By logoutButton = By.xpath("(//a[text()='Logout'])[1]");


    public String getSuccessMessage(){
      return driver.element().getText(successMsg);
    }
    public Boolean IsLogoutVisible() {
    ClickOnElement(myAccountButton);
    //driver.element().click(myAccountButton);
     return driver.element().isElementDisplayed(logoutButton);
    }
    public void logOut() {
        ClickOnElement(logoutButton);
        // driver.element().click(logoutButton);
    }
}
