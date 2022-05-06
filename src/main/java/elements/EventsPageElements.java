package elements;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EventsPageElements
{
    @FindBy(xpath="//div[@class='authLinksContainer']")
    private WebElement signUp_NavigationBar;

    @FindBy(xpath="//div[contains(text(),'Notify Me')]")
    private WebElement notifyMeButton;

    @FindBy(xpath="//div[@class='card']/img")
    private WebElement youTubeCard;

    public void eventsPageLogins(@NotNull WebDriver driver,String url) throws Exception
    {
        LoginModalElements loginModalElements = PageFactory.initElements(driver, LoginModalElements.class);

        signUp_NavigationBar.click();
        loginModalElements.login(driver);

        driver.get(url);
        notifyMeButton.click();
        loginModalElements.login(driver);

        driver.get(url);
        youTubeCard.click();
        loginModalElements.login(driver);
        driver.switchTo().window(driver.getWindowHandle()); //Switching to parent window
    }
}
