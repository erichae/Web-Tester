package starter.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://opensource-demo.orangehrmlive.com/index.php/dashboard")
public class DashboardPage extends PageObject {

    @FindBy(xpath= "/html/body/div[1]/div[3]/div/div[1]/h1")
    WebElement dashboardHeader;

    @FindBy(id="panel_resizable_0_0")
    WebElement panelQuickLaunch;

    public String getHeaderText() {
        return dashboardHeader.getText();
    }
    public boolean isQuickLaunchAppear() {
        return panelQuickLaunch.isDisplayed();

    }
}
