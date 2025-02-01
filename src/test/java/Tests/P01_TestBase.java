package Tests;

import Pages.P02_HomePage;
import com.shaft.driver.SHAFT;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class P01_TestBase {
    SHAFT.GUI.WebDriver driver;
    SHAFT.TestData.EXCEL testData;
    P02_HomePage p02_homePage;
    @BeforeMethod
    public void SetUp(){
        driver = new SHAFT.GUI.WebDriver();
        driver.browser().maximizeWindow();
        driver.browser().navigateToURL("https://opencart.abstracta.us/index.php?route=common/home");
        testData = new SHAFT.TestData.EXCEL("./src/main/resources/UserRegistrationData.xlsx");
        p02_homePage = new P02_HomePage(driver);
    }

    @AfterMethod
    public void Quit(){
        driver.quit();
    }
}
