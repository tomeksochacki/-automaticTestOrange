package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class OrangeGiftPage {
    @FindBy(xpath = "/html/body/div[6]/div/div/div/div/div[1]/div[2]/div/div/div/div/button/svg/use//svg/path")
    WebElement gift;

    public void closeGift() throws InterruptedException {
        gift.click();
    }
}
