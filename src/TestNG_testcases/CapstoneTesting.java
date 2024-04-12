package TestNG_testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CapstoneTesting {
    private ChromeDriver driver;
    private String baseUrl = "http://localhost:4200/landing";

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mayur\\Downloads\\chromedriver-win64\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        this.driver = new ChromeDriver(options); // Assign the driver to class-level variable
    }

    @Test
    public void testLogin() throws InterruptedException {
        driver.get(baseUrl);
        driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();

        // Find the email input field and enter email
        WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
        email.sendKeys("dummyaccout@email.com");

        // Find the password input field and enter password
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("b0UygFlEYbLEML8");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//BUTTON[@_ngcontent-ng-c2758230828=''][text()=' Continue ']")).click();
        Thread.sleep(2000);
        Assert.assertEquals(driver.getCurrentUrl(),"http://localhost:4200/dashboard","Page didn't open after providing login credentials");
    }

    @Test
    public void invalidLogin() throws InterruptedException {
        driver.get(baseUrl);
        driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();

        // Find the email input field and enter email
        WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
        email.sendKeys("testmail@gmail.com");

        // Find the password input field and enter password
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("password");

        Thread.sleep(1000);

        driver.findElement(By.xpath("//BUTTON[@_ngcontent-ng-c2758230828=''][text()=' Continue ']")).click();

        WebElement error = driver.findElement(By.xpath("(//DIV[@_ngcontent-ng-c2758230828=''])[13]"));
        Assert.assertTrue(error.isDisplayed());
    }
}
