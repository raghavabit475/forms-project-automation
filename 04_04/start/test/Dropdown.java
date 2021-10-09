import com.gargoylesoftware.htmlunit.javascript.host.Console;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Dropdown {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Software\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement ddmenu = driver.findElement(By.id("dropdownMenuButton"));
        ddmenu.click();

        WebElement autocompleteitem = driver.findElement(By.id("autocomplete"));
        autocompleteitem.click();

        driver.quit();
    }
}
