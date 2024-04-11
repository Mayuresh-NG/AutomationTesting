package Selnium.Storage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Modular {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mayur\\Downloads\\chromedriver-win64\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        ChromeDriver driver = new ChromeDriver(options);

        driver.get("https://www.calculator.net/");

        elementStore.search(driver).sendKeys("calorie");
//        Selnium.Storage.elementStore.LoanLink(driver).click();

    }
}
