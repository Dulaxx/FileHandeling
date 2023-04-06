package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.cdimascio.dotenv.Dotenv;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.asserts.SoftAssert;

public class BaseClass {
    public WebDriver driver;
    public Dotenv dotenv = Dotenv.configure().load();
    public SoftAssert sa;

    @BeforeClass
    public void setup(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get(this.dotenv.get("URL"));
        sa = new SoftAssert();
    }
    @AfterClass
    public void result(){
        driver.quit();
        driver.close();
    }

}
