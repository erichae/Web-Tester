package starter.pages2;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://my.jurnal.id/products/new")
public class CreateProductPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"main-content\"]/header/div/div[1]/h1")
    WebElement headerNewProductPage;

    @FindBy (id="name")
    WebElement fieldName;

    @FindBy (xpath = "//*[@id=\"react-select-3--value-item\"]/div")
    WebElement choosePcsForUnit;

    @FindBy (xpath = "//*[@id=\"react-select-5--value-item\"]/div")
    WebElement chooseSingleProductType;

    @FindBy (id="buy-panel")
    WebElement chooseIBuyThisItem;

    @FindBy (id="sell-panel")
    WebElement chooseISellThisItem;

    @FindBy (xpath = "//*[@id=\"product-new-react\"]/div/div/div/div/div/div[1]/div[9]/div/button[1]")
    WebElement createProductButton;


    public String getNewProductHeader(){
        return headerNewProductPage.getText();
    }

    public void fillName(String name) {
        fieldName.sendKeys(name);
    }

    public void chosePcsForUnit(){
        choosePcsForUnit.click();
    }

    public void choseSingleProductType(){
        chooseSingleProductType.click();
    }
    public void choseIBuyThisItem(){
        chooseIBuyThisItem.click();
    }
    public void choseISellThisItem(){
        chooseISellThisItem.click();
    }
    public void clickCreateProduct(){
        createProductButton.click();
    }
}
