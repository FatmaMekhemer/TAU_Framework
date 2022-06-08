package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private WebDriver driver;
    private By fileUpload=By.id("file-upload");
    private By fileSubmit=By.id("file-submit");
    private By uploadedFiles=By.id("uploaded-files");
    public FileUploadPage(WebDriver driver){
        this.driver=driver;
    }
    public void clickUploadButton(){
        driver.findElement(fileSubmit).click();
    }
    public void UploadFile(String absPathOfFile){
        driver.findElement(fileUpload).sendKeys(absPathOfFile);
        clickUploadButton();
    }
    public String getUploadedFile(){
        return driver.findElement(uploadedFiles).getText();
    }
}
