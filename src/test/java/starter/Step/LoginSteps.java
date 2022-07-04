package starter.Step;

import net.thucydides.core.annotations.Step;
import starter.pages.DashboardPage;
import starter.pages.LoginJurnalPage;
import static org.junit.Assert.*;
import starter.pages.LoginPage;

public class LoginSteps {

    LoginPage loginPage;
    DashboardPage dashboardPage;
    LoginJurnalPage loginJurnalPage;

    @Step
    public void openLoginPage(){
        loginPage.open();
    }

    @Step
    public void inputUsername() {
        loginPage.inputUserName();
    }

    @Step
    public void inputPassword(){
        loginPage.inputPassword();
    }

    @Step
    public void clickLoginButton(){
        loginPage.clickLoginButton();
    }

    @Step
    public void verifyDashboardPage(){
        String header = dashboardPage.getHeaderText();
        assertTrue(header.equalsIgnoreCase("dashboard"));
        assertTrue(dashboardPage.isQuickLaunchAppear());
    }

    @Step
    public void loginInJurnal(){
        loginJurnalPage.open();
        loginJurnalPage.inputUserEmail();
        loginJurnalPage.inputPassword();
        loginJurnalPage.clickLoginButton();
    }
}
