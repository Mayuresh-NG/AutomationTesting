package Selnium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectDropdown {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mayur\\Downloads\\chromedriver-win64\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.calculator.net/");

        // Find the email input field by its XPath
        driver.findElement(By.linkText("Calorie Calculator")).click();

        WebElement select = driver.findElement(By.id("cactivity"));

        Select s =new Select(select);
        s.selectByIndex(5);

//      Print array of options
        List<WebElement> l=s.getOptions();
        l.size();

        for (int i=0;i<l.size();i++)
        {
          String k=l.get(i).getText();
          System.out.println(k);
        }
    }
}
