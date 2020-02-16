package addressbook;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {
    public ChromeDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost/addressbook/");
        login("admin", "secret");
    }

    private void login(String username, String password) {
        driver.findElementByName("user").click();
        driver.findElementByName("user").sendKeys(username);
        driver.findElementByName("pass").click();
        driver.findElementByName("pass").sendKeys(password);
        driver.findElementByXPath("//input[@value='Login']").click();
    }

    protected void returnToGroupPage() {
        driver.findElementByLinkText("group page").click();
    }

    protected void submitGroupCreation() {
        driver.findElementByName("submit").click();
    }

    protected void fillGroupForm(GroupData groupData) {
        driver.findElementByName("group_name").click();
        driver.findElementByName("group_name").sendKeys(groupData.getName());
        driver.findElementByName("group_header").click();
        driver.findElementByName("group_header").sendKeys(groupData.getHeader());
        driver.findElementByName("group_footer").click();
        driver.findElementByName("group_footer").sendKeys(groupData.getFooter());
    }

    protected void initGroupCreation() {
        driver.findElementByName("new").click();
    }

    public void goToGroupPage() {
        driver.findElementByLinkText("groups").click();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    protected void deleteSelectedGroups() {
        driver.findElementByName("delete").click();
    }

    protected void selectGroup() {
        driver.findElementByName("selected[]").click();
    }
}
