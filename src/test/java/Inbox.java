import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class Inbox {

    WebDriver driver;

    @Test
    public void setUpChromeBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.phptravels.com/signup");
    }
    @Test
    public void setUpFirefoxBrowser() {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://app.phptravels.com/signup");
    }
    @Test
    public void setUpEdgeBrowser() {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.phptravels.com/signup");
    }

































}
