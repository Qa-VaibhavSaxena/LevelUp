package login;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Utils;

public class LoginPage
{
    @FindBy(xpath="//div[@class='authLinksContainer']")
    private WebElement navLogin;
    @FindBy(xpath="//input[@placeholder='Enter your Mobile Number']")
    private WebElement phoneField;

    public void homePage() throws Exception
    {
        Utils var = new Utils();
        navLogin.click();
        phoneField.sendKeys(""+var.generatedNumber,Keys.ENTER);
    }
}
