
package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest {

    @Test
    public void testLogin() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("Admin", "admin123");

        driver.quit();
    }
}
