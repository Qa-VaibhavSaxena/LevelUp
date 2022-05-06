package elements;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResourcesPageElements
{
    @FindBy(xpath="//div[@class='authLinksContainer']")
    private WebElement signUp_NavigationBar;

    public void resourcesPageLogins(@NotNull WebDriver driver) throws Exception
    {
        LoginModalElements loginModalElements = PageFactory.initElements(driver, LoginModalElements.class);

        signUp_NavigationBar.click();
        loginModalElements.login(driver);
    }
}
