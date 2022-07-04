package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Step.AddContactStep;

public class AddContactStepDef {

    @Steps
    AddContactStep addContactStep;

    @When("I click contact menu")
    public void iClickContactMenu() {
        addContactStep.clickContactMenu();
    }

    @Then("Contact page appear")
    public void contactPageAppear() {
        addContactStep.verifyContactPage();
    }
    
    @When("I click new contact")
    public void clickNewContact(){
        addContactStep.clickNewContact();
    }

    @Then("Create new contact page appear")
    public void createNewContactPageAppear() {
        addContactStep.clickContactMenu();
    }

    @When("i fill name with {string}")
    public void fillName(String name) {
        addContactStep.fillContactName(name);
    }

    @And("I choose contact type as customer")
    public void chooseContactTypeAsCustomer() {
        addContactStep.selectAsCustomer();
    }
    @And("I choose SIM for identity")
    public void iChooseSIMForIdentity() {addContactStep.selectSIMIdentity();
    }

    @And("I click add button")
    public void iClickAddButton() {
        addContactStep.clickAddButton();
    }

    @Then("Contact with name {string} is created")
    public void contactNameCreated(String name) {
        addContactStep.verifyContactCreated(name);
    }


}
