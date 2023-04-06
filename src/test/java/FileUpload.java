import base.BaseClass;
import org.testng.annotations.Test;
import pages.FileUploadPage;

public class FileUpload extends BaseClass {
    @Test(priority = 1, description = "Validate the image upload")
    public void testCase_01(){
        FileUploadPage fileUploadPage = new FileUploadPage(driver);
        fileUploadPage.verifyfilesPageTitle();
        fileUploadPage.clickChooseFileButton();
        fileUploadPage.clickFileTypeImage();
        fileUploadPage.clickUploadButton();
        fileUploadPage.verifyUploadFile();
        System.out.println("Test Case 01 - Pass");
    }
}
