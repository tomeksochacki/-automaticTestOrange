package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrangeCookiesPage {
    @FindBy(xpath = "/html/body/div[1]/div/section/div/div/div/button/svg")
    WebElement cookies;

    public void closeCookies() throws InterruptedException {
        cookies.click();
    }
}
