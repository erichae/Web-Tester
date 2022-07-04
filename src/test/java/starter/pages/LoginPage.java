package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.RenderedPageObjectView;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://opensource-demo.orangehrmlive.com/index.php/auth/login")
public class LoginPage extends PageObject {

    @FindBy(id="txtUsername")
    WebElement fieldUsername;

    @FindBy(id="txtPassword")
    WebElement fieldPassword;

    @FindBy(id="btnLogin")
    WebElement buttonLogin;

    public void inputUserName() {
    fieldPassword.sendKeys("Admin");
    }
    public void inputPassword() {
    fieldPassword.sendKeys("admin123");
    }
    public void clickLoginButton(){
        buttonLogin.click();

    }
}
