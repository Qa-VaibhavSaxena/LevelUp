import io.testproject.sdk.drivers.web.ChromeDriver;
import levelUp.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class Base
{
    ChromeDriver driver;
    String url = "https://dev-levelup.leapscholar.com/";
    public void invoke() throws Exception {
        driver = new ChromeDriver("yMFiOh5vl4Nf-AYGTkNgVT2awPEsQqWLJjwldFY1abo",new ChromeOptions());
        driver.get(url);
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
        LoginPage lp = PageFactory.initElements(driver,LoginPage.class);
        lp.homePage();
        oTP();
        close();
    }
}
