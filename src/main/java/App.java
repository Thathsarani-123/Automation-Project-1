import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class App {public static void main(String[] args) {

    XSSFWorkbook workbook;
    XSSFSheet worksheet;
    XSSFCell cell;
   // 1. Set ChromeDriver path
    //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dasitha\\Desktop\\Poornima Auto\\chrome-win32\\chrome-win32\\chrome.exe");
    //WebDriver driver = new ChromeDriver();



    // 2. Launch browser
    WebDriver driver = new ChromeDriver();

    // 3. Open application
    driver.get("https://www.saucedemo.com/");

    // 4. Locate username and password fields
    WebElement username = driver.findElement(By.id("user-name"));
    WebElement password = driver.findElement(By.id("password"));

    // 5. Enter credentials
    username.sendKeys("standard_user");
    password.sendKeys("secret_sauce");

    // 6. Click login button
    driver.findElement(By.id("login-button")).click();

    // 7. Close browser
    //driver.quit();
}


}

