package utils;
import java.util.Random;

public class Utils
{
    //public WebDriver driver;
    public String generatedNumber;
    public String generatedEmail;

    public Utils() throws Exception
    {
        //System.setProperty("webdriver.chrome.driver","src\\test\\resources\\chromedriver.exe");
        //driver = new ChromeDriver();

        Random generator = new Random();
        int num1,num2,num3;
        num1 = generator.nextInt(900)+100;
        num2 = generator.nextInt(643)+100;
        num3 = generator.nextInt(9000)+100;
        generatedNumber = num1+""+num2+""+num3;

        int randomInt = generator.nextInt(1000);
        generatedEmail  = "username"+ randomInt +"@gmail.com";
    }
}
