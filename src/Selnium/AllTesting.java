package Selnium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import java.util.Iterator;
import java.util.*;

class Testing {
    public static void performLoginTesting(ChromeDriver driver) {
        driver.get("http://localhost:4200/landing");

        // Find the login link and click it
        driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();

        // Find the email input field and enter email
        WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
        email.sendKeys("testmail@gmail.com");

        // Find the password input field and enter password
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("password");

//        driver.findElement(By.xpath("//div[@id='signupPopup']/div/div[2]/button")).click();

//        WebElement errorMessage = driver.findElement(By.className("alert"));
//        String alertText = errorMessage.getText();
//        System.out.println(alertText);

//        driver.findElement(By.className("close-button")).click();
    }

    public static void performSignUpTesting(ChromeDriver driver) {
        driver.get("http://localhost:4200/landing");

        // Find the login link and click it
        driver.findElement(By.xpath("//a[contains(text(),'Sign Up')]")).click();

        WebElement fullName = driver.findElement(By.xpath("//input[@name='email']"));
        fullName.sendKeys("Tester Name");

        // Find the email input field and enter email
        WebElement email = driver.findElement(By.xpath("//input[@name='fullName']"));
        email.sendKeys("testEmail@gmail.com");

        // Find the password input field and enter password
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("password");
    }

    public static void DragAndDrop(ChromeDriver driver) {
        driver.get("https://jqueryui.com/resources/demos/droppable/default.html");

        // Locate the draggable element
        WebElement draggable = driver.findElement(By.id("draggable"));

        // Locate the droppable element
        WebElement droppable = driver.findElement(By.id("droppable"));

        // Create Actions class object
        Actions actions = new Actions(driver);

        // Perform drag and drop
        actions.dragAndDrop(draggable, droppable).build().perform();
    }

    public static void Move(ChromeDriver driver) throws InterruptedException {
        driver.get("https://schooledn.py.gov.in/admission/hsc.html");

        WebElement school = driver.findElement(By.xpath("//A[@href='#'][text()='Schools']"));

        WebElement privates = driver.findElement(By.xpath("//A[@href='#'][text()='Private']"));

        WebElement govt = driver.findElement(By.xpath("//A[@href='../schools/govtAided.html'][text()='Govt Aided']"));

        Actions actions = new Actions(driver);

        actions.moveToElement(school).click().perform();
        Thread.sleep(1000);
        actions.moveToElement(privates).click().perform();
        Thread.sleep(1000);
        actions.moveToElement(govt).click().perform();
    }

    public static void Redbus(ChromeDriver driver) throws InterruptedException {
        driver.get("https://www.redbus.com/");

        WebElement help = driver.findElement(By.linkText("Help"));
        help.click();

        Thread.sleep(3000);

        Set<String> alw= driver.getWindowHandles();
        Iterator<String> it = alw.iterator();

        String pw = it.next();
        String cw= it.next();

        driver.switchTo().window(cw);
        WebElement close = driver.findElement(By.xpath("//i[@class='icon-close']"));
        close.click();
    }
}

public class AllTesting {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mayur\\Downloads\\chromedriver-win64\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        ChromeDriver driver = new ChromeDriver(options);


//        Testing.performLoginTesting(driver);
//        Selnium.Testing.performSignUpTesting(driver);
//        Selnium.Testing.DragAndDrop(driver);
//        Selnium.Testing.Move(driver);
//        Selnium.Testing.Redbus(driver);
    }
}
