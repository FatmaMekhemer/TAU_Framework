package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
    private WebDriver driver;
    //private String xpathFormat=".//a[contains(text(),'%s')";
    private By linkExample1= By.xpath("//ul/li/a[contains(text(),'Dynamic Loading')]");
    public DynamicLoadingPage(WebDriver driver){
      this.driver=driver;
    }
    public LoadingDynamicExample1Page clickOnExample1(){
        driver.findElement(linkExample1).click();
        return new LoadingDynamicExample1Page(driver);
    }
}
