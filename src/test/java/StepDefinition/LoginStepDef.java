package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Step.LoginSteps;

public class LoginStepDef {
    @Steps
    LoginSteps loginSteps;

    @Given("I already on login page")
    public void iAlreadyOnLoginPage() {
        loginSteps.openLoginPage();

    }

    @When("I input my username")
    public void iInputMyUsername() {
        loginSteps.inputUsername();
    }

    @And("I input my password")
    public void iInputMyPassword() {
        
    }

    @And("I click login button")
    public void iClickLoginButton() {
        loginSteps.clickLoginButton();
    }

    @Then("The system show dashboard page")
    public void theSystemShowDashboardPage() {
        loginSteps.verifyDashboardPage();
    }

    @And("The system show welcome")
    public void theSystemShowUsername() {
    }


    @Given("I already logged in")
    public void iAlreadyLoggedIn() {
        loginSteps.loginInJurnal();
    }
}
