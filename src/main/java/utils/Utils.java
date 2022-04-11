package utils;
import java.util.Random;
import io.testproject.sdk.drivers.web.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Utils
{
    //public ChromeDriver driver;
    public String generatedNumber;
    public String generatedEmail;

    public Utils() throws Exception
    {
        //driver = new ChromeDriver("yMFiOh5vl4Nf-AYGTkNgVT2awPEsQqWLJjwldFY1abo",new ChromeOptions());

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
