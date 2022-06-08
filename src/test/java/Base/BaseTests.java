package Base;

import com.google.common.io.Files;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import utils.WindowManager;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class BaseTests {
    private WebDriver driver;
    protected HomePage home;
    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver=new ChromeDriver();
        goHome();
        home=new HomePage(driver);
       // WebElement inputs= driver.findElement(By.partialLinkText("Inputs"));
        //inputs.click();
        //List<WebElement> links=driver.findElements(By.tagName("a"));
        //System.out.println(links.size());
      //  driver.manage().window().maximize();
        //System.out.println(driver.getTitle());

    }
    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/?msclkid=d298cc3db4ba11ec9e9d3823a7dcaaa3");

    }
   /* @AfterClass
    public void tearDown(){
        driver.quit();

    }*/
    @AfterMethod
    public void takeScreenshot(){
        var camera=(TakesScreenshot)driver;
        File screenshot=camera.getScreenshotAs(OutputType.FILE);
       try {
           Files.move(screenshot, new File("resources/Screenshots/test.png"));
       }catch (IOException e)
       {
           e.printStackTrace();
       }
    }
    public WindowManager getWindow(){
        return new WindowManager(driver);
    }
}
