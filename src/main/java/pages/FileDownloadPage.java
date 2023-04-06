package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class FileDownloadPage {
    WebDriver driver;
    By downloadPageTitle = By.xpath("//h1[contains(text(),'Download a File via JavaScript')]");
    By directLinkDownloadButton = By.id("direct-download");

    public FileDownloadPage(WebDriver driver){
        this.driver = driver;
    }

    public void verifydownloadPageTitle(){
        String actualTitle = driver.findElement(downloadPageTitle).getText();
        String expectedTitle = "Download a File via JavaScript";
        Assert.assertEquals(actualTitle,expectedTitle,"Expected Title is " + expectedTitle);
    }
    public void clickDirectLinkDownloadButton(){
        driver.findElement(directLinkDownloadButton).click();
    }




}
