package starter.pages2;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://my.jurnal.id/products/products_and_services")
public class ProductPage extends PageObject {
    @FindBy(xpath = "//*[@id=\"main-content\"]/header/div/div[1]/div/div")
    WebElement headerProductPage;

    @FindBy(xpath = "//*[@id=\"main-content\"]/header/div/div[2]/div/div/div[1]/div")
    WebElement actionButton;

    @FindBy(xpath = "//*[@id=\"main-content\"]/header/div/div[2]/div/div/div[2]/div[1]/a/div")
    WebElement newProduct;


    public String getHeaderPage() {
        return headerProductPage.getText();
    }

    public void clickAction() {
        actionButton.click();
    }

    public void clickNewProduct() {
        newProduct.click();
    }

}