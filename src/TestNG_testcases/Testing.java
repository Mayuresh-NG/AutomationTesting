package TestNG_testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testing {
    private ChromeDriver driver;
    private String baseUrl = "https://www.calculator.net/";

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mayur\\Downloads\\chromedriver-win64\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        this.driver = new ChromeDriver(options); // Assign the driver to class-level variable
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void testUrl() {
        driver.get(baseUrl);
        driver.findElement(By.partialLinkText("Mortgage")).click();

        String currentUrl = driver.getCurrentUrl();

        // Define the expected URL after clicking on the "Mortgage" link
        String expectedUrl = "https://www.calculator.net/mortgage-calculator.html";

        // Assert that the current URL matches the expected URL
        Assert.assertEquals(currentUrl, expectedUrl, "Incorrect URL after clicking on the Mortgage link");
    }
}
