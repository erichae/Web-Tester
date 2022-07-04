package starter.pages;


import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://account.mekari.com/users/sign_in")
public class LoginJurnalPage extends PageObject {

    @FindBy (id="user_email")
    WebElement fieldEmail;

    @FindBy (id="user_password")
    WebElement fieldPassword;

    @FindBy (id="new-signin-button")
    WebElement loginButton;

    public void inputUserEmail(){
    fieldEmail.sendKeys("forever_secret@yahoo.com");
    }
    public void inputPassword() {
        fieldPassword.sendKeys("52Erikaa");
    }
    public void clickLoginButton(){
        loginButton.click();

    }
}
