import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.*;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.concurrent.TimeUnit;


public class TestBase {
    WebDriver webDriver;
    WebDriverWait wait;
    String BASE_URL = "https://www.orange.pl/";
    OrangeMainPage mainPage;
    OrangeShopPage orangeShopPage;
    OrangePromPage orangePr;
    OrangeOneModelPhonePage orangeOneModelPhonePage;
    OrangeCookiesPage orangeCookiesPage;
    OrangeGiftPage orangeGiftPage;

    @Before
    public void before(){
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\tomek\\Desktop\\SELENIUM\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(50000, TimeUnit.SECONDS);
        webDriver.manage().window().maximize();
        //webDriver.manage().timeouts().setScriptTimeout(100, TimeUnit.SECONDS);
        mainPage = PageFactory.initElements(webDriver, OrangeMainPage.class);
        orangeGiftPage = PageFactory.initElements(webDriver, OrangeGiftPage.class);
        orangeShopPage = PageFactory.initElements(webDriver, OrangeShopPage.class);
        orangePr = PageFactory.initElements(webDriver, OrangePromPage.class);
        orangeOneModelPhonePage = PageFactory.initElements(webDriver, OrangeOneModelPhonePage.class);
        webDriver.manage().deleteAllCookies();
        webDriver.get(BASE_URL);
    }

    @After
    public void after(){
        webDriver.close();
        webDriver.quit();
    }
}
