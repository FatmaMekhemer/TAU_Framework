package Alerts;

import Base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUploadTests extends BaseTests {
    @Test
    public void uploadFile(){
        var file=home.clickonFile();
        file.UploadFile("C:\\Users\\aa\\IdeaProjects\\webdriver_java\\resources\\chromedriver.exe");
        Assert.assertEquals(file.getUploadedFile(),"chromedriver.exe","unsuccess");
    }

}
