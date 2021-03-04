package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import static io.github.bonigarcia.wdm.config.DriverManagerType.CHROME;
import static io.github.bonigarcia.wdm.config.DriverManagerType.FIREFOX;

public class TestBase {
    protected static WebDriver driver;
    public static WebDriverWait wait;
    public Actions action;

    @BeforeClass
    @Parameters({"browser","url", "waitTime"})
    public void launchBrowser(String browser, String url, String waitTime){

        if(browser.equalsIgnoreCase("chrome")){
            WebDriverManager.getInstance(CHROME).setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("enable-automation", "--silent", "--ignore-certificate-errors", "--disable-dev-shm-usage", "--disable-gpu");
            this.driver = new ChromeDriver(options);
        }
        else if (browser.equalsIgnoreCase("firefox")){
            WebDriverManager.getInstance(FIREFOX).setup();
            FirefoxOptions options = new FirefoxOptions();
            options.addArguments("--headless", "enable-automation", "--silent", "--ignore-certificate-errors", "--disable-dev-shm-usage", "--disable-gpu");
            this.driver = new FirefoxDriver(options);
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(url);
        wait = new WebDriverWait(driver, Integer.parseInt(waitTime));
        action = new Actions(driver);
    }

    @AfterClass
    public void closeBrowser() {
        driver.quit();
    }
}
