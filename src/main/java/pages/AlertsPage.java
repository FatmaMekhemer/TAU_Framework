package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {
    private WebDriver driver;
    private By triggerAlertButton=By.xpath("//button[text()='Click for JS Alert']");
    private By confirmButton=By.xpath("//button[text()='Click for JS Confirm']");
    private By prompt=By.xpath("//button[text()='Click for JS Prompt']");
    private By result=By.id("result");
    public AlertsPage(WebDriver driver){
        this.driver=driver;
    }
    public void clickOn1stButton(){
        driver.findElement(triggerAlertButton).click();
    }
    public void acceptAlert1(){
        driver.switchTo().alert().accept();
    }
    public void confirmButton(){
        driver.findElement(confirmButton).click();
    }
    public void promptButton(){
        driver.findElement(prompt).click();
    }
    public void enterTextPrompt(String text){
        driver.switchTo().alert().sendKeys(text);
    }
    public void cancelAlert(){
        driver.switchTo().alert().dismiss();
    }
    public String getConfirmText(){
        return driver.switchTo().alert().getText();
    }
    public String getResult(){
        return driver.findElement(result).getText();
    }

}
