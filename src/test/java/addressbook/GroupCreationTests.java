package addressbook;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GroupCreationTests {
    public ChromeDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost/addressbook/");
        driver.findElementByName("user").click();
        driver.findElementByName("user").sendKeys("admin");
        driver.findElementByName("pass").click();
        driver.findElementByName("pass").sendKeys("secret");
        driver.findElementByXPath("//input[@value='Login']").click();
    }

    @Test
    public void testGroupCreation() {
        driver.findElementByLinkText("groups").click();
        driver.findElementByName("new").click();
        driver.findElementByName("group_name").click();
        driver.findElementByName("group_name").sendKeys("TestName");
        driver.findElementByName("group_header").click();
        driver.findElementByName("group_header").sendKeys("TestHeader");
        driver.findElementByName("group_footer").click();
        driver.findElementByName("group_footer").sendKeys("TestFooter");
        driver.findElementByName("submit").click();
        driver.findElementByLinkText("group page").click();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
