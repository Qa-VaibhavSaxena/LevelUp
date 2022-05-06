package elements;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageElements
{
    @FindBy(xpath="//div[@class='authLinksContainer']")
    private WebElement signUp_NavigationBar;

    @FindBy(xpath="(//button[@label='Sign Up'])[3]")
    private WebElement signUp_HeroBanner;

    @FindBy(xpath="//button[@label='Find Jobs']")
    private WebElement findJobs_SearchBar;

    public void homePageLogins(@NotNull WebDriver driver) throws Exception
    {
        LoginModalElements loginModalElements = PageFactory.initElements(driver, LoginModalElements.class);

        signUp_NavigationBar.click();
        loginModalElements.login(driver);

        signUp_HeroBanner.click();
        loginModalElements.login(driver);

        findJobs_SearchBar.click();
        loginModalElements.login(driver);
    }
}
