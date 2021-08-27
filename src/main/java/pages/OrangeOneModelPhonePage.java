package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrangeOneModelPhonePage {
    @FindBy(className = "css-ggujbk")
    WebElement oneModelPhoneDetails;

    public void goToOneModelPhoneDetails() throws InterruptedException {
        oneModelPhoneDetails.click();
    }

}
