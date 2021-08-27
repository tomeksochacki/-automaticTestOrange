import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;

public class TestOrangeBuying extends TestBase{

    @Test
    public void buyingAPhone() throws InterruptedException {

        mainPage.clickSubmenuTelephonesAndDevices();

        //orangeGiftPage.closeGift();

        mainPage.clickTelephones();

        orangePr.clickButtonToReject();

        orangeShopPage.goToOneModelPhone();

        //orangeCookiesPage.closeCookies();

        orangeOneModelPhonePage.goToOneModelPhoneDetails();

    }
}
