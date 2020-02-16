package addressbook.appmanager;

import addressbook.model.GroupData;
import org.openqa.selenium.chrome.ChromeDriver;

public class GroupHelper extends HelperBase {

    public GroupHelper(ChromeDriver driver) {
        super(driver);
    }

    public void returnToGroupPage() {
        driver.findElementByLinkText("group page").click();
    }

    public void submitGroupCreation() {
        click("submit");
    }

    public void fillGroupForm(GroupData groupData) {
        type("group_name", groupData.getName());
        type("group_header", groupData.getHeader());
        type("group_footer", groupData.getFooter());
    }

    public void initGroupCreation() {
        click("new");
    }

    public void deleteSelectedGroups() {
        click("delete");
    }

    public void selectGroup() {
        click("selected[]");
    }
}
