package login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class BaseTest
{
    WebDriver driver;
    String url = "https://dev-levelup.leapscholar.com/";

    public void invoke() throws Exception {
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver");
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void close()
    {
        driver.quit();
}

    public void oTP() {
        for (int i=1;i<=6;i++)
        {
            driver.findElement((By.xpath("//div[@class='Layout__FlexRow-sc-146frxr-0 gnxOqe']/input["+i+"]")))
                    .sendKeys(""+i);
        }
    }

    @Test
    public void navigationLogin() throws Exception
    {
        invoke();
        login.LoginPage lp = PageFactory.initElements(driver, login.LoginPage.class);
        lp.homePage();
        oTP();
        close();
    }
}

