package utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Utils
{
    public WebDriver driver;
    public String generatedNumber;
    public String generatedEmail;

    public Utils()
    {
        Random generator = new Random();
        int num1,num2,num3;
        num1 = generator.nextInt(900)+100;
        num2 = generator.nextInt(643)+100;
        num3 = generator.nextInt(9000)+100;
        generatedNumber = num1+""+num2+""+num3;

        if(generatedNumber.length()==9)
            generatedNumber=generatedNumber+"1";
        else if(generatedNumber.length()==8)
            generatedNumber=generatedNumber+"11";

        int randomInt = generator.nextInt(1000);
        generatedEmail  = "username"+ randomInt +"@gmail.com";
    }

    public WebDriver invoke()
    {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return driver;
    }
}
