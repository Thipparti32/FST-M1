import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_1 {
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-controls");
        WebElement checkboxInput = driver.findElement(By.xpath("//input[@type='checkbox']"));
        System.out.println("Checkbox is Displayed" + checkboxInput.isDisplayed());
        driver.findElement(By.id("toggleCheckbox")).click();
        System.out.println("checkbox is Displayed"+ checkboxInput.isDisplayed());
        driver.close();
    }
}
