package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Step.AddProductStep;

public class AddProductStepDef {

    @Steps
    AddProductStep addProductStep;

    @When("I click product menu")
    public void iClickProductMenu() {
        addProductStep.clickProductMenu();
    }


    @Then("Product page appear")
    public void productPageAppear() {
        addProductStep.verifyProductPage();
    }

    @When("I click action")
    public void iClickAction() {
        addProductStep.clickAction();
    }

    @Then("The action option appear")
    public void theActionOptionAppear() {
        addProductStep.verifyProductPage();
    }

    @And("I click new product")
    public void iClickNewProduct() {
        addProductStep.clickNewProductButton();
    }

    @Then("Create new product page appear")
    public void createNewProductPageAppear() {
        addProductStep.clickProductMenu();
    }

    @And("I fill name {string}")
    public void iFillName(String name) {
        addProductStep.fillProductName(name);
    }

    @And("I choose pcs for unit")
    public void iChoosePcsForUnit() {
        addProductStep.selectPcsForUnit();
    }

    @And("I choose single for product type")
    public void iChooseSingleForProductType() {
        addProductStep.selectSingleProductType();
    }

    @Then("I choose i buy this item on price setting")
    public void iChooseIBuyThisItemOnPriceSetting() {
        addProductStep.selectIBuyThisItem();
    }

    @And("I choose i sell this item on price setting")
    public void iChooseISellThisItemOnPriceSetting() {
        addProductStep.selectISellThisItem();
    }

    @And("I click create product")
    public void iClickCreateProduct() {
        addProductStep.clickAction();
        
    }

    @Then("Product with name {string} is created")
    public void productWithNameIsCreated(String name) {
        addProductStep.verifyProductCreated(name);
    }
}
