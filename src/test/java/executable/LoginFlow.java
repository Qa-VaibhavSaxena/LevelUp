package executable;
import elements.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utils.Utils;

public class LoginFlow extends Utils
{
    WebDriver driver;
    //String url = "https://dev-levelup.leapscholar.com/";

    String url[] = {"https://staging-levelup.leapscholar.com/",
                    "https://staging-levelup.leapscholar.com/jobs-and-internships?page=1&limit=12&sector=All&sortBy=Most+Recent&date=All&jobTitle=&job_type=",
                    "https://staging-levelup.leapscholar.com/join-the-community",
                    "https://staging-levelup.leapscholar.com/events",
                    "https://staging-levelup.leapscholar.com/free-resources"};

    @Test
    public void loginFlow() throws Exception
    {
        driver = invoke();

        for(int i=0;i<url.length;i++)
        {
            driver.get(url[i]);

            switch(i)
            {
                case 0:
                    HomePageElements homePageElements = PageFactory.initElements(driver, HomePageElements.class);
                    homePageElements.homePageLogins(driver);
                    break;

                case 1:
                    JobsPageElements jobsPageElements = PageFactory.initElements(driver, JobsPageElements.class);
                    jobsPageElements.jobsPageLogins(driver,url[i]);
                    break;

                case 2:
                    CommunityPageElements communityPageElements = PageFactory.initElements(driver, CommunityPageElements.class);
                    communityPageElements.communityPageLogins(driver);
                    break;

                case 3:
                    EventsPageElements eventsPageElements = PageFactory.initElements(driver, EventsPageElements.class);
                    eventsPageElements.eventsPageLogins(driver,url[i]);
                    break;

                case 4:
                    ResourcesPageElements resourcesPageElements = PageFactory.initElements(driver, ResourcesPageElements.class);
                    resourcesPageElements.resourcesPageLogins(driver);
                    break;
            }
        }
        driver.quit();
    }
}

