package starter.pages2;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetail extends PageObject {
    @FindBy(xpath = "//*[@id=\"product-detail-react\"]/div[1]/div/div[1]/div/div[1]/div/div[1]")
    WebElement productName;

    @FindBy (xpath = "//*[@id=\"tab-header-unit\"]/a")
    WebElement productUnit;

    @FindBy (xpath = "//*[@id=\"product-detail-react\"]/div[1]/div/div[1]/div/div[8]/div[2]")
    WebElement productType;

    @FindBy (xpath = "//*[@id=\"product-detail-react\"]/div[1]/div/div[2]/div[2]/div[1]/div/div[1]")
    WebElement productBuyItem;

    @FindBy (xpath = "//*[@id=\"product-detail-react\"]/div[1]/div/div[2]/div[2]/div[2]/div/div[1]")
    WebElement productSellItem;

    public String getProductName(){
        return productName.getText();
    }
    public String verifyProductUnit(){
        return productUnit.getText();
    }
    public String verifyProductType(){
        return productType.getText();
    }
    public String verifyProductBuyItem(){
        return productBuyItem.getText();
    }
    public String verifyProdutcSellItem(){
        return productSellItem.getText();
    }
}
