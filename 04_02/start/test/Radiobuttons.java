import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Radiobuttons {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Software\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/radiobutton");

        WebElement rb1 = driver.findElement(By.id("radio-button-1"));
        rb1.click();

        WebElement rb2 = driver.findElement(By.cssSelector("input[value='option2']"));
        rb2.click();

        WebElement rb3 = driver.findElement(By.xpath("/html/body/div/div[3]/input"));
        rb3.click();

        driver.quit();
    }
}
