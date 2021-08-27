package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrangeShopPage{

    @FindBy(xpath = "/html/body/div[1]/div/div/section/div/div[3]/div[3]/div[2]/div[1]/div[1]/div[1]/div[3]/div[3]/a/h2")
    WebElement oneModelPhone;
    //(div[class='formularz-zawodnik']>input[id='imie']));
    //@FindBy(xpath = "//img[@alt='Xiaomi Redmi 9C NFC 2 szary + Xiaomi Redmi 9A niebieski']")
    //@FindBy(partialLinkText = "Xiaomi Redmi 9C NFC szary + Xiaomi Redmi 9A niebieski")


    public void goToOneModelPhone() throws InterruptedException {
        oneModelPhone.click();
    }
}
