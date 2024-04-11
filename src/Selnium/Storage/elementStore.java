package Selnium.Storage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class elementStore {
    public static WebElement search (ChromeDriver driver){
        return driver.findElement(By.id("calcSearchTerm"));
    }

    public static WebElement LoanLink (ChromeDriver driver){
        return driver.findElement(By.partialLinkText("Loan"));
    }
}
