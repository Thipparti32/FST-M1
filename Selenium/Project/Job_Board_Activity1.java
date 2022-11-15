
import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.firefox.FirefoxDriver;
        import org.openqa.selenium.support.ui.WebDriverWait;

        import java.time.Duration;

public class Job_Board_Activity1 {

    public static void main(String[] args){
        WebDriver driver=new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs/\n");
        String title= driver.getTitle();
        System.out.println("The Title of the page is :" + title);
        String title2="Alchemy Jobs – Job Board Application";
        if(title.equals(title2))
        {
            System.out.println("Title matches.Closing browser");
            driver.close();
        }
        else
            System.out.println("Title do not match");

    }
}
