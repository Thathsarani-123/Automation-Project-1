import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SignUp implements ITestListener {
    WebDriver driver;

    // 1️⃣ Runs BEFORE each @Test method
    @BeforeMethod
    public void setUpChromeBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.phptravels.com/signup");
    }
    public void setUpFirefoxBrowser() {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://app.phptravels.com/signup");
    }
    public void setUpEdgeBrowser() {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.phptravels.com/signup");
    }

    // 2️⃣ Actual test case
    @Test(dataProvider = "enterUserIdAndPassword")
    public void loginTest(String email,String password) {

        driver.findElement(By.id("first_name")).sendKeys("Thathsarani");
        driver.findElement(By.id("last_name")).sendKeys("Poornima");


        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("confirm_password")).sendKeys("Dasitha@123");
        driver.findElement(By.id("mobile")).sendKeys("713452999");
        driver.findElement(By.xpath("//*[@id=\"signupForm\"]/div[5]/div/div/div/span")).click();
        //driver.findElement(By.className("recaptcha-checkbox-checkmark")).click();


        driver.findElement(By.id("submit")).click();
    }

    @Test (priority = 1, enabled = false)
    public void verifyDashboard() {
        String title = driver.getTitle();
        String titleExpected=" Nooby";
        System.out.println("The Titel is  ="+ title);
        SoftAssert sa = new SoftAssert();
        sa.assertEquals(title,titleExpected);
        sa.assertAll();


    }
    @DataProvider
    public  Object [][] enterUserIdAndPassword(){
      Object [][] data = new Object [3] [2];
//Row 1
        data[0][0] = "UserOne1@gmail.com";
        data[0][1] = "Password@123";
        //Row 2
        data[1][0] = "UserOne2@gmail.com";
        data[1][1] = "Password@456";
        //Row 3
        data[2][0] = "UserOne3@gmail.com";
        data[2][1] = "Password@789";
        //Row 4
//        data[3][0] = "UserOne4@gmail.com";
//        data[3][1] = "Password@012";
      return  data;
    }
    // 3️⃣ Runs AFTER each @Test method
    @AfterMethod(enabled = false)
    public void tearDown() {
        driver.quit();
    }


}
