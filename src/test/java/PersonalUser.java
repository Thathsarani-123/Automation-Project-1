import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class PersonalUser {
    WebDriver driver;

    // 1️⃣ Runs BEFORE each @Test method
    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.phptravels.com/signup");
    }

}
