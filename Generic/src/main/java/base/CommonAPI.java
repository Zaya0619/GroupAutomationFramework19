package base;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CommonAPI {
        public WebDriver driver;


        @BeforeMethod
        public void setUp(){
            System.setProperty("webdriver.chrome.driver", "/Users/zayka/Desktop/web-automation-Nov19/Generic/driver/chromedriver");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("https://www.amazon.com");

        }
        @AfterMethod
        public void cleanUp() {
            driver.quit();
        }
    }
