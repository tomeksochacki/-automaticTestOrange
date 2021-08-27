package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrangeMainPage {

    @FindBy(id = "Menu_B2C_Telefony_i_urządzenia")
    WebElement submenuTelephonesAndDevices;


    @FindBy(partialLinkText = "Telefony")
    WebElement telephones;


    public void clickSubmenuTelephonesAndDevices() {
        submenuTelephonesAndDevices.click();
    }

    public void clickTelephones() throws InterruptedException {
        telephones.click();
    }

}
