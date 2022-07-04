package starter.Step;

import net.thucydides.core.annotations.Step;
import starter.pages2.CreateProductPage;
import starter.pages2.MenuPage2;
import starter.pages2.ProductDetail;
import starter.pages2.ProductPage;
import static org.junit.Assert.*;

public class AddProductStep {

    MenuPage2 menuPage2;

    ProductPage productPage;

    CreateProductPage createProductPage;

    ProductDetail productDetail;


    @Step
    public void clickProductMenu(){
        menuPage2.open();
        menuPage2.clickProductMenu();
    }
    @Step
    public void verifyProductPage(){
        String headerPage = productPage.getHeaderPage();
        assertTrue(headerPage.equalsIgnoreCase("products"));
    }

    @Step
    public void fillProductName(String name){
        createProductPage.fillName(name);
    }

    @Step
    public void selectPcsForUnit(){
        createProductPage.chosePcsForUnit();
    }

    @Step
    public void selectSingleProductType(){
        createProductPage.choseSingleProductType();
    }

    @Step
    public void selectIBuyThisItem(){
        createProductPage.choseIBuyThisItem();
    }

    @Step
    public void selectISellThisItem(){
        createProductPage.choseISellThisItem();
    }
    @Step
    public void clickAction() {
        productPage.clickAction();
    }
    @Step
    public void clickNewProductButton(){
        ProductPage newProductButton = new ProductPage();
        newProductButton.clickAction();
    }
    @Step
    public void verifyProductCreated(String ExpectedName){
        String actualName=productDetail.getProductName();
        assertTrue(ExpectedName.equalsIgnoreCase(actualName));
        String type=productDetail.verifyProductUnit();
        assertTrue(type.equalsIgnoreCase("Pcs"));
        String type1=productDetail.verifyProductType();
        assertTrue(type1.equalsIgnoreCase("Single"));
        String type2=productDetail.verifyProductBuyItem();
        assertTrue(type2.equalsIgnoreCase("Buy"));
        String type3=productDetail.verifyProdutcSellItem();
        assertTrue(type3.equalsIgnoreCase("Sell"));
    }
}
