package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrangePromPage {
    @FindBy(xpath = "//div[@class='insider-opt-in-notification-button insider-opt-in-disallow-button']")
    WebElement infoPromButtonToReject;

    public void clickButtonToReject() throws InterruptedException {
        infoPromButtonToReject.click();
    }
}
