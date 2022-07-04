package starter.Step;

import net.thucydides.core.annotations.Step;
import starter.pages.ContactDetail;
import starter.pages.ContactPage;
import starter.pages.CreateContactPage;
import starter.pages.MenuPage;
import static org.junit.Assert.*;

public class AddContactStep {

    MenuPage menuPage;
    CreateContactPage createContactPage;
    ContactPage contactPage;
    ContactDetail contactDetail;

    @Step
    public void clickContactMenu(){
        menuPage.open();
        menuPage.clickContactMenu();
    }

    @Step
    public void verifyContactPage(){
        String headerPage = contactPage.getHeaderPage();
        assertTrue(headerPage.equalsIgnoreCase("contacts"));
    }

    @Step
    public void clickNewContact(){
        contactPage.clickNewContact();
    }

    @Step
    public void verifyCreateNewContactPage(){
    String headerPage=createContactPage.getNewContactHeader();
    assertTrue(headerPage.equalsIgnoreCase("create new contact"));
    }

    @Step
    public void fillContactName(String name){
        createContactPage.fillName(name);
    }

    @Step
    public void selectAsCustomer(){
    createContactPage.choseTypeAsCustomer();
    }

    @Step
    public void selectSIMIdentity() {createContactPage.choseSIMIdentity();}

    @Step
    public void clickAddButton(){
    createContactPage.clickAddButton();
    }

    @Step
    public void verifyContactCreated(String ExpectedName) {
        String actualName = contactDetail.getContactName();
        assertTrue (ExpectedName.equalsIgnoreCase(actualName));
        String type= contactDetail.verifyContactType();
        assertTrue(type.equalsIgnoreCase("customer"));
        String Type= contactDetail.verifyIdentityType();
        assertTrue(Type.equalsIgnoreCase("SIM"));
    }

}
