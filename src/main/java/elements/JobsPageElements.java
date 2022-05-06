package elements;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobsPageElements
{
    @FindBy(xpath="//div[@class='authLinksContainer']")
    private WebElement signUp_NavigationBar;

    @FindBy(xpath="//button[@label='Apply Now']")
    private WebElement applyNow_JobsCard;

    public void jobsPageLogins(@NotNull WebDriver driver,String url) throws Exception
    {
        LoginModalElements loginModalElements = PageFactory.initElements(driver, LoginModalElements.class);

        signUp_NavigationBar.click();
        loginModalElements.login(driver);

        driver.get(url);
        applyNow_JobsCard.click();
        loginModalElements.login(driver);
    }
}
