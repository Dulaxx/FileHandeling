package pages;

import io.github.cdimascio.dotenv.Dotenv;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class FileUploadPage {
    WebDriver driver;
    Dotenv dotenv = Dotenv.configure().load();
    By filesPageTitle = By.xpath("//h1[contains(text(),'Upload a File')]");
    By chooseFileButton = By.id("fileinput");
    By fileTypeImage = By.id("itsanimage");
    By uploadButton = By.xpath("//input[@name='upload']");
    By uploadFileName = By.id("uploadedfilename");

    public FileUploadPage(WebDriver driver){
        this.driver = driver;
    }
    public void verifyfilesPageTitle(){
        String actualTitle = driver.findElement(filesPageTitle).getText();
        String expectTitle = "Upload a File";
        Assert.assertEquals(actualTitle,expectTitle,"Expected Title is " + expectTitle);
    }
    public void clickChooseFileButton(){
        WebElement fileInput = driver.findElement(chooseFileButton);
        fileInput.sendKeys("C:\\Users\\User\\Downloads\\cutey.jpg");
    }
    public void clickFileTypeImage(){
        driver.findElement(fileTypeImage).click();
    }
    public void clickUploadButton(){
        driver.findElement(uploadButton).click();
    }
    public void verifyUploadFile(){
        String actualName = driver.findElement(uploadFileName).getText();
        String expectName = this.dotenv.get("FILENAME");
        Assert.assertEquals(actualName,expectName,"Uploaded file name is " + expectName);
    }


}
