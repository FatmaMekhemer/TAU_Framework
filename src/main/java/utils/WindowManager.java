package utils;

import org.openqa.selenium.WebDriver;

public class WindowManager {
    private WebDriver driver;
    private WebDriver.Navigation navigate;
    public WindowManager(WebDriver driver){
        this.driver=driver;
        navigate=driver.navigate();
    }
    public void goBack(){
      navigate.back();
    }

    public void goForward(){
        navigate.forward();
    }
    public void Refresh(){
        navigate.refresh();
    }
    public void goToUrl(String url){
        navigate.to(url);
    }
    public void switchToTabs(String Tabtitle){
        var windows=driver.getWindowHandles();
        System.out.println("Number of tabs"+ windows.size());
        for(String window:windows){
            driver.switchTo().window(window);
            if(Tabtitle.equals(driver.getTitle())){
                break;
            }
        }
    }
}
