package addressbook;


        import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() {
        goToGroupPage();
        initGroupCreation();
        fillGroupForm(new GroupData("TestName", "TestHeader", "TestFooter"));
        submitGroupCreation();
        returnToGroupPage();
    }

}
