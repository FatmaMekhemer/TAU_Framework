package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoadingDynamicExample1Page {
    private WebDriver driver;
    private By startButton= By.cssSelector("#start button");
    private By  locaterIndicator=By.id("loading");
    private By loadedText=By.id("finish");
    public LoadingDynamicExample1Page(WebDriver driver){
        this.driver=driver;
    }
    public void clickOnStart()
    {
        driver.findElement(startButton).click();
        WebDriverWait wait=new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(locaterIndicator)));
    }
    public String getLoadedText()
    {
        return driver.findElement(loadedText).getText();
    }
}
