package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.security.Key;

public class KeyPressesPage {
    private WebDriver driver;
    private By inputFeild =By.id("target");
    private By result=By.id("result");
    public KeyPressesPage(WebDriver driver){
        this.driver=driver;
    }
    public void enterText(String text){
        driver.findElement(inputFeild).sendKeys(text);
    }
    public void enterPI()
    {
        enterText(Keys.chord(Keys.ALT,"p")+"=3.14");
    }
    public String getResult(){
        return driver.findElement(result).getText();
    }

}
