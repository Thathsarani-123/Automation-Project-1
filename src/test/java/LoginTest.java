import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTest {
    WebDriver driver;

    // 1️⃣ Runs BEFORE each @Test method
    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.phptravels.com/signup");
    }

    // 2️⃣ Actual test case
    @Test (priority = 0)
    public void loginTest() {

        WebElement username = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("password"));

        username.sendKeys("standard_user");
        password.sendKeys("secret_sauce");

        driver.findElement(By.id("login-button")).click();
    }

    @Test (priority = 1)
    public void verifyDashboard() {
     String title = driver.getTitle();
     String titleExpected=" Nooby";
        System.out.println("The Titel is  ="+ title);
        SoftAssert sa = new SoftAssert();
        sa.assertEquals(title,titleExpected);
        sa.assertAll();


    }
    // 3️⃣ Runs AFTER each @Test method
    @AfterMethod (enabled = false)
    public void tearDown() {
        driver.quit();
    }
}


