import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntroduction {
    public static void main(String[] args) {
        // Invoke Browser
        System.setProperty("webdriver.chrome.driver","/opt/homebrew/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        // Tell selenium to perform actions
        driver.get("https://forrestbear.org");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.quit();
    }
}
