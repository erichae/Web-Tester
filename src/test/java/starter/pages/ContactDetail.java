package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactDetail extends PageObject {
    @FindBy(xpath = "//*[@id=\"main-content\"]/div[4]/div[1]/div[1]/span[1]")
    WebElement contactName;

    @FindBy(xpath = "//*[@id=\"main-content\"]/div[4]/div[1]/div[1]/span[3]")
    WebElement contactType;

    @FindBy (xpath = "//*[@id=\"main-content\"]/div[4]/div[3]/div[4]/span[4]")
    WebElement contactIdentity;

    public String getContactName(){
        return contactName.getText();
    }

    public String verifyContactType(){
        return contactType.getText();
    }

    public String verifyIdentityType() {return contactIdentity.getText();}

}
