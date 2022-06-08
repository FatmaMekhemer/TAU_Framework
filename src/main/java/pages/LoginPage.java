package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private  By usernameF= By.id("username");
    private  By passwordF= By.id("password");
    private By LoginButton=By.cssSelector("#login button");
    public LoginPage(WebDriver driver){
        this.driver=driver;
        }
     public void setUsername(String username){
        driver.findElement(usernameF).sendKeys(username);
     }
    public void setPassword(String password){
        driver.findElement(passwordF).sendKeys(password);
    }
    public secureAreaPage LogInClick(){
        driver.findElement(LoginButton).click();
        return new secureAreaPage(driver);
    }

}
