package starter.pages2;

import net.thucydides.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://my.jurnal.id/")
public class MenuPage2 extends PageObject {

    @FindBy(id="vnav-inventory-link")
    WebElement productMenu;

    public void clickProductMenu(){
        productMenu.click();

    }
}