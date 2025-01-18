
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.io.File;
import java.time.Duration;



public class Main {
    public static void main(String[] args) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "/Users/sbongisenindwandwe/Documents/JavaProjects/SeleniumStudyinDepth/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        // Navigating to BrowserStack website


        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com");

        driver.findElement(By.linkText("A/B Testing")).click();
        Thread.sleep(1000);
        driver.navigate().back();
        driver.findElement(By.linkText("Add/Remove Elements")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@onclick='deleteElement()']")).click();
        Thread.sleep(1000);
        driver.navigate().back();
        driver.findElement(By.linkText("Basic Auth")).click();
        Thread.sleep(1000);
        driver.navigate().back();
        driver.findElement(By.linkText("Broken Images")).click();
        Thread.sleep(1000);
        driver.navigate().back();
        driver.findElement(By.linkText("Challenging DOM")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("b3e15710-85ad-013d-644a-4e7e97fd5db6")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("b3e15710-85ad-013d-644b-4e7e97fd5db6")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("b3e15710-85ad-013d-644c-4e7e97fd5db6")).click();
        driver.navigate().back();
        driver.findElement(By.linkText("Checkboxes")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@type='checkbox'][1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[type='checkbox']:nth-of-type(2)")).click();

//Right click function
        driver.findElement(By.linkText("Context Menu")).click();
        Thread.sleep(1000);
        WebElement rightc= driver.findElement(By.id("hot-spot"));
        Actions action =new Actions(driver);
        action.contextClick(rightc).perform();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        Thread.sleep(1000);
        driver.navigate().back();

//Auth from Javascript alert
        driver.findElement(By.linkText("Digest Authentication")).click();
        Thread.sleep(1000);
        driver.get("https://admin:admin@the-internet.herokuapp.com/digest_auth");
        Thread.sleep(3000);


        driver.get("https://the-internet.herokuapp.com/");
        Thread.sleep(1000);
        driver.findElement(By.linkText("Disappearing Elements")).click();
        Thread.sleep(3000);
        //driver.findElement(By.linkText("Gallery")).click();

        try {

            WebElement element = driver.findElement(By.linkText("Gallery"));

            if (element.isDisplayed()) {
                element.click();
            } else {
                throw new ElementNotInteractableException("Element is hidden and cannot be interacted with.");
            }
        } catch (NoSuchElementException e) {
            System.out.println("Element not found: " + e.getMessage());
        } catch (ElementNotInteractableException e) {
            System.out.println("Element not interactable: " + e.getMessage());
        }



        Thread.sleep(2000);
        driver.navigate().back();
        driver.findElement(By.linkText("Portfolio")).click();
        Thread.sleep(2000);
        driver.navigate().back();
        driver.findElement(By.linkText("Contact Us")).click();
        Thread.sleep(2000);
        driver.navigate().back();
        driver.findElement(By.linkText("About")).click();
        Thread.sleep(2000);
        driver.navigate().back();
        driver.findElement(By.linkText("Home")).click();

//Drag and drop
        driver.findElement(By.linkText("Drag and Drop")).click();
        Thread.sleep(3000);
        Actions DnD=new Actions(driver);
        WebElement fromE= driver.findElement(By.id("column-a"));
        WebElement toE= driver.findElement(By.id("column-b"));
        Thread.sleep(3000);
        DnD.dragAndDrop(fromE,toE).perform();
        Thread.sleep(3000);
        driver.navigate().back();

        driver.findElement(By.linkText("Dropdown")).click();
        Thread.sleep(2000);

        Select dropdownL = new Select(driver.findElement(By.id("dropdown")));
        dropdownL.selectByValue("1");
        Thread.sleep(2000);
        dropdownL.selectByValue("2");
        Thread.sleep(2000);
        driver.navigate().back();

        driver.findElement(By.linkText("Dynamic Content")).click();
        Thread.sleep(2000);
        WebElement dcontent=driver.findElement(By.linkText("click here"));
        Thread.sleep(2000);
        if (dcontent.isDisplayed() && dcontent.isEnabled()){
            Thread.sleep(2000);
                    for(int loopn=0;loopn<5;loopn++)
                    {
                        dcontent=driver.findElement(By.linkText("click here"));
                        dcontent.click();
                        System.out.println("Clicked on the element. Loop count: " + (loopn + 1));
                        Thread.sleep(2000);

                    }
        }
        else {
            driver.navigate().back();
        }
        driver.get("https://the-internet.herokuapp.com");
        Thread.sleep(2000);
        driver.findElement(By.linkText("Dynamic Controls")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='button' and @onclick='swapCheckbox()']")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        WebElement loadingElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("loading")));

        if(loadingElement.isDisplayed()){

            System.out.println(loadingElement.getText());

        }

        WebDriverWait waitsecButton = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement secButton = waitsecButton.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[text()='Add']")));
        Thread.sleep(2000);
        secButton.click();
        WebElement messageElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("message")));
        if(messageElement.isDisplayed()){
            System.out.println(messageElement.getText());

        }

        WebDriverWait waitenableButton = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement enableButton = waitenableButton.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[text()='Enable']")));
        Thread.sleep(2000);
        enableButton.click();

        Thread.sleep(3000);
        WebDriverWait waitdisableButton = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement disableButton = waitdisableButton.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[text()='Disable']")));
        Thread.sleep(2000);
        disableButton.click();
        Thread.sleep(3000);
        driver.navigate().back();

        driver.findElement(By.linkText("Dynamic Loading")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Example 1: Element on page that is hidden")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='Start']")).click();
        Thread.sleep(10000);
        driver.navigate().back();

        Thread.sleep(2000);
        driver.findElement(By.linkText("Example 2: Element rendered after the fact")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='Start']")).click();
        Thread.sleep(10000);
        driver.navigate().back();

        driver.get("https://the-internet.herokuapp.com");
        driver.findElement(By.linkText("Entry Ad")).click();
        Thread.sleep(3000);
        driver.switchTo().activeElement();
        Thread.sleep(3000);
        WebElement closeButton = driver.findElement(By.xpath("//div[@class='modal-footer']/p[text()='Close']"));
        closeButton.click();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);


        driver.findElement(By.linkText("Exit Intent")).click();
        Thread.sleep(3000);
        Robot robot = new Robot();
        robot.mouseMove(600, 0);
        driver.switchTo().activeElement();
        Thread.sleep(3000);
        WebElement closeexitmodal = driver.findElement(By.xpath("//div[@class='modal-footer']/p[text()='Close']"));
        closeexitmodal.click();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);

        driver.findElement(By.linkText("File Download")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("mytest.pdf")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("bb.txt")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("wel.png")).click();
        Thread.sleep(3000);
        driver.navigate().back();

        File fileToUpload=new File("/Users/sbongisenindwandwe/Downloads/mytest.pdf");

        driver.findElement(By.linkText("File Upload")).click();
        Thread.sleep(3000);
        WebElement fileupload= driver.findElement(By.cssSelector("input[type=file]"));
        fileupload.sendKeys(fileToUpload.getAbsolutePath());
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input[type=submit]")).click();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.get("https://the-internet.herokuapp.com");
        Thread.sleep(3000);



        System.out.println("Successfully launched Chrome on fullscreen mode!");

        driver.quit();
    }
}