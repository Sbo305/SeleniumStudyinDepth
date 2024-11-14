import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/sbongisenindwandwe/Documents/JavaProjects/SeleniumStudyinDepth/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        // Navigating to BrowserStack website


        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com");

        driver.findElement(By.linkText("Basic Auth")).click();





        Thread.sleep(5000);
        System.out.println("Successfully launched Chrome on fullscreen mode!");

        driver.close();
    }
}