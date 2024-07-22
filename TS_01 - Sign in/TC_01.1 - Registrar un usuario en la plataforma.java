import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class TC011RegistrarunusuarioenunaplataformaTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void tC011Registrarunusuarioenunaplataforma() {
    driver.get("https://test-qa.inlaze.com/auth/sign-in");
    driver.findElement(By.linkText("Sign up")).click();
    driver.findElement(By.id("full-name")).sendKeys("Pedro Cardona");
    driver.findElement(By.id("email")).sendKeys("pedrocardona@email.com");
    driver.findElement(By.cssSelector(".w-full > #password")).sendKeys("Mayo98*+");
    driver.findElement(By.cssSelector(".w-full > #confirm-password")).sendKeys("Mayo98*+");
    driver.findElement(By.cssSelector(".btn:nth-child(5)")).click();
  }
}
