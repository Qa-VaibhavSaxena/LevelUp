package elements;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Utils;

public class LoginModalElements extends Utils
{
    @FindBy(xpath="//input[@placeholder='Enter your Mobile Number']")
    private WebElement phoneNumberField;

    @FindBy(xpath="//*[@id='email']")
    private WebElement emailField;

    @FindBy(xpath="//p[contains(text(),'Complete Sign In')]")
    private WebElement completeSignInButton;

    @FindBy(xpath="(//p[contains(text(),'Log Out')])[2]")
    private WebElement logoutButton;

    public void login(@NotNull WebDriver driver) throws Exception
    {
        Utils var = new Utils();

        phoneNumberField.sendKeys(""+var.generatedNumber, Keys.ENTER);
        for (int i=1;i<=6;i++)
        {
            driver.findElement((By.xpath("//div[@class='Layout__FlexRow-sc-146frxr-0 eejjFb']/input["+i+"]")))
                    .sendKeys(""+i);
        }
        emailField.sendKeys(""+var.generatedEmail);
        completeSignInButton.click();
        logoutButton.click();
    }
}
