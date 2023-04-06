import base.BaseClass;
import org.testng.annotations.Test;
import pages.FileDownloadPage;

public class FileDownload extends BaseClass {
    @Test(priority = 1, description = "Valide file download")
    public void testcase_01(){
        FileDownloadPage fileDownloadPage = new FileDownloadPage(driver);
        //
    }

}
