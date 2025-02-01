package Pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class P01_PageBase {
    public SHAFT.GUI.WebDriver driver;

    public P01_PageBase(SHAFT.GUI.WebDriver driver){
        this.driver=driver;
    }
public void TypeIntoElement(By element,String value){
        driver.element().type(element,value);
}

public void ClickOnElement(By element){
        driver.element().click(element);
}
}
