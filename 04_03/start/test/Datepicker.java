import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


public class Datepicker {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Software\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/datepicker");

        WebElement datefield = driver.findElement(By.id("datepicker"));
        datefield.sendKeys("10/10/2030");
        datefield.sendKeys(Keys.RETURN);

        driver.quit();
    }
}