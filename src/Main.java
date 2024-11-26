
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.TreeMap;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/sbongisenindwandwe/Documents/JavaProjects/SeleniumStudyinDepth/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        // Navigating to BrowserStack website


        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com");

//        driver.findElement(By.linkText("A/B Testing")).click();
//        Thread.sleep(1000);
//        driver.navigate().back();
//        driver.findElement(By.linkText("Add/Remove Elements")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//button[@onclick='deleteElement()']")).click();
//        Thread.sleep(1000);
//        driver.navigate().back();
//        driver.findElement(By.linkText("Basic Auth")).click();
//        Thread.sleep(1000);
//        driver.navigate().back();
//        driver.findElement(By.linkText("Broken Images")).click();
//        Thread.sleep(1000);
//        driver.navigate().back();
//        driver.findElement(By.linkText("Challenging DOM")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.id("b3e15710-85ad-013d-644a-4e7e97fd5db6")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.id("b3e15710-85ad-013d-644b-4e7e97fd5db6")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.id("b3e15710-85ad-013d-644c-4e7e97fd5db6")).click();
//        driver.navigate().back();
//        driver.findElement(By.linkText("Checkboxes")).click();
//        Thread.sleep(1000);
//
//        driver.findElement(By.xpath("//input[@type='checkbox'][1]")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.cssSelector("input[type='checkbox']:nth-of-type(2)")).click();
//
////Right click function
//        driver.findElement(By.linkText("Context Menu")).click();
//        Thread.sleep(1000);
//        WebElement rightc= driver.findElement(By.id("hot-spot"));
//        Actions action =new Actions(driver);
//        action.contextClick(rightc).perform();
//        Thread.sleep(1000);
//        driver.switchTo().alert().accept();
//        Thread.sleep(1000);
//        driver.navigate().back();
//
////Auth from Javascript alert
//        driver.findElement(By.linkText("Digest Authentication")).click();
//        Thread.sleep(1000);
//        driver.get("https://admin:admin@the-internet.herokuapp.com/digest_auth");
//        Thread.sleep(3000);
//
//
//        driver.get("https://the-internet.herokuapp.com/");
//        Thread.sleep(1000);
//        driver.findElement(By.linkText("Disappearing Elements")).click();
//        Thread.sleep(3000);
//        //driver.findElement(By.linkText("Gallery")).click();
//
//        try {
//
//            WebElement element = driver.findElement(By.linkText("Gallery"));
//
//            if (element.isDisplayed()) {
//                element.click();
//            } else {
//                throw new ElementNotInteractableException("Element is hidden and cannot be interacted with.");
//            }
//        } catch (NoSuchElementException e) {
//            System.out.println("Element not found: " + e.getMessage());
//        } catch (ElementNotInteractableException e) {
//            System.out.println("Element not interactable: " + e.getMessage());
//        }
//
//
//
//        Thread.sleep(2000);
//        driver.navigate().back();
//        driver.findElement(By.linkText("Portfolio")).click();
//        Thread.sleep(2000);
//        driver.navigate().back();
//        driver.findElement(By.linkText("Contact Us")).click();
//        Thread.sleep(2000);
//        driver.navigate().back();
//        driver.findElement(By.linkText("About")).click();
//        Thread.sleep(2000);
//        driver.navigate().back();
//        driver.findElement(By.linkText("Home")).click();
//
////Drag and drop
//        driver.findElement(By.linkText("Drag and Drop")).click();
//        Thread.sleep(3000);
//        Actions DnD=new Actions(driver);
//        WebElement fromE= driver.findElement(By.id("column-a"));
//        WebElement toE= driver.findElement(By.id("column-b"));
//        Thread.sleep(3000);
//        DnD.dragAndDrop(fromE,toE).perform();
//        Thread.sleep(3000);
//        driver.navigate().back();
//
//        driver.findElement(By.linkText("Dropdown")).click();
//        Thread.sleep(2000);
//
//        Select dropdownL = new Select(driver.findElement(By.id("dropdown")));
//        dropdownL.selectByValue("1");
//        Thread.sleep(2000);
//        dropdownL.selectByValue("2");
//        Thread.sleep(2000);
//        driver.navigate().back();
//
//        driver.findElement(By.linkText("Dynamic Content")).click();
//        Thread.sleep(2000);
//        WebElement dcontent=driver.findElement(By.linkText("click here"));
//        Thread.sleep(2000);
//        if (dcontent.isDisplayed() && dcontent.isEnabled()){
//            Thread.sleep(2000);
//                    for(int loopn=0;loopn<5;loopn++)
//                    {
//                        dcontent=driver.findElement(By.linkText("click here"));
//                        dcontent.click();
//                        System.out.println("Clicked on the element. Loop count: " + (loopn + 1));
//                        Thread.sleep(2000);
//
//                    }
//        }
//        else {
//            driver.navigate().back();
//        }
        driver.get("https://the-internet.herokuapp.com");
        Thread.sleep(2000);
        driver.findElement(By.linkText("Dynamic Controls")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='button' and @onclick='swapCheckbox()']")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));

        WebElement loadingElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("loading")));

        if(loadingElement.isDisplayed()){

            System.out.println(loadingElement.getText());
        }








        System.out.println("Successfully launched Chrome on fullscreen mode!");

        driver.quit();
    }
}