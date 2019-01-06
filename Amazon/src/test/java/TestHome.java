import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestHome extends CommonAPI {

    @Test
    public void openAmazon() throws InterruptedException {
        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(20000);
    }

    @Test
    public void testSearch() throws InterruptedException {
        driver.findElement(By.id("nav-search-label"));
        Thread.sleep(20000);

    }

    @Test
    public void test3() throws InterruptedException {
        driver.findElement(By.id("nav-link-accountList")).sendKeys("Sunglasses");
        Thread.sleep(20000);
    }
}
