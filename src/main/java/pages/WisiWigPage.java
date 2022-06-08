package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WisiWigPage {
    private WebDriver driver;
    private String BiggerFrame="mce_0_ifr";
    private By textArea=By.id("tinymce");
    private By decreaseIndentButton= By.cssSelector("#mceu_12 button");
    public WisiWigPage(WebDriver driver){
        this.driver=driver;
    }
    private void switchToEditArea(){
        driver.switchTo().frame(BiggerFrame);
    }
    public void clearExistedArea(){
        switchToEditArea();
        driver.findElement(textArea).clear();
        switchToMainFrame();
    }
    public void setTextArea(String text){
        switchToEditArea();
        driver.findElement(textArea).sendKeys(text);
        switchToMainFrame();
    }
    private void switchToMainFrame(){
        driver.switchTo().parentFrame();
    }
    public void decreaseIndenentButton(){
        driver.findElement(decreaseIndentButton).click();
    }
   public String getTextFromEditor(){
       switchToEditArea();
       String text= driver.findElement(textArea).getText();
       switchToMainFrame();

       return text;
   }
}
