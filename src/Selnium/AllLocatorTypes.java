package Selnium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AllLocatorTypes {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mayur\\Downloads\\chromedriver-win64\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.facebook.com/");

        //ID locator
        WebElement elementById = driver.findElement(By.id("email"));
        elementById.sendKeys("example@example.com");

        // Name locator
        WebElement elementByName = driver.findElement(By.name("email"));
        elementByName.sendKeys("abc@gmail.com");

        // CSS Selector locator (using class)
        WebElement elementByCssSelector = driver.findElement(By.cssSelector("#email"));
        elementByCssSelector.sendKeys("CSS-Selector");

        // Link Text locator
        WebElement elementByLinkText = driver.findElement(By.linkText("Forgotten password?"));
        elementByLinkText.click();

        // Partial Link Text locator
        WebElement elementByPartialLinkText = driver.findElement(By.partialLinkText("Forgotten"));
        elementByPartialLinkText.click();

        // Tag Name locator
        WebElement elementByTagName = driver.findElement(By.tagName("input"));
        elementByTagName.sendKeys("Hello");

        // Class Name locator
        WebElement elementByClassName = driver.findElement(By.className("inputtext _55r1 _6luy _9npi"));
        elementByClassName.sendKeys("password");
    }
}
