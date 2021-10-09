import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class ScrollToElement {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Software\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/scroll");
        WebElement firstname = driver.findElement(By.id("name"));
        Actions action = new Actions(driver);
        action.moveToElement(firstname);
        firstname.sendKeys("Ken Ken");

        WebElement datetofill = driver.findElement(By.id("date"));
        datetofill.sendKeys("10/06/2021");




        driver.quit();
    }
}
