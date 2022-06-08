package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class InfiniteScrollPage {
    private WebDriver driver;
    private By textblocks=By.className("iscroll-added");
    public InfiniteScrollPage(WebDriver driver){
        this.driver=driver;
    }
    public void scrollToParagraph(int index){
        String script="window.scrollTo(0,document.body.scrollHeight)";
        while (getNumberOfParagraphs()<index){
            ((JavascriptExecutor)driver).executeScript(script);
        }
    }
    private int getNumberOfParagraphs(){
        return driver.findElements(textblocks).size();
    }
}
