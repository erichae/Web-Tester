package starter.pages;

import net.thucydides.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://my.jurnal.id/")
public class MenuPage extends PageObject {

    @FindBy(id="contacts-li")
    WebElement contactMenu;

    public void clickContactMenu(){
        contactMenu.click();

    }
}
