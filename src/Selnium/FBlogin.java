package Selnium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FBlogin {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mayur\\Downloads\\chromedriver-win64\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.facebook.com/");

        // Find the email input field by its XPath
        WebElement emailInput = driver.findElement(By.xpath("//input[@id='email']"));

        // Enter email addressa
        emailInput.sendKeys("example@gmail.com");

        // Find the password input field by its XPath
        WebElement passwordInput = driver.findElement(By.xpath("//input[@id='pass']"));

        // Enter password
        passwordInput.sendKeys("yourpassword");

        passwordInput.submit();
    }
}
