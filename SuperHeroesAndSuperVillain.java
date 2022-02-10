
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
public class AreyouagameTest {
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
  public void areyouagame() {
    driver.get("https://responsivefight.herokuapp.com/");
    driver.manage().window().setSize(new Dimension(1536, 816));
    driver.findElement(By.id("worrior_username")).click();
    driver.findElement(By.id("worrior_username")).sendKeys("Pratap");
    driver.findElement(By.id("warrior")).click();
    driver.findElement(By.id("start")).click();
    driver.findElement(By.id("news")).click();
    driver.findElement(By.id("start")).click();
    driver.findElement(By.id("answer_2")).click();
    driver.findElement(By.id("close_modal_btn_2")).click();
  }
  @Test
  public void taketheBus() {
    driver.get("https://responsivefight.herokuapp.com/");
    driver.manage().window().setSize(new Dimension(1536, 816));
    driver.findElement(By.id("worrior_username")).click();
    driver.findElement(By.id("worrior_username")).sendKeys("Pratap");
    driver.findElement(By.id("warrior")).click();
    driver.findElement(By.id("start")).click();
    driver.findElement(By.id("bus")).click();
    driver.findElement(By.id("bus_timer_start")).click();
    driver.findElement(By.id("bus_answer_1")).click();
    driver.findElement(By.id("close_correct_modal_btn")).click();
    driver.findElement(By.id("restaurant_timer_start")).click();
    driver.findElement(By.id("restaurant_answer_1")).click();
    driver.findElement(By.id("close_correct_modal_btn")).click();
    driver.findElement(By.id("start")).click();
    driver.findElement(By.id("office_answer_1")).click();
    driver.findElement(By.id("close_modal_btn_1")).click();
    driver.findElement(By.id("bus_timer_start")).click();
    driver.findElement(By.id("bus_answer_2")).click();
    driver.findElement(By.id("close_correct_modal_btn")).click();
    driver.findElement(By.id("restaurant_timer_start")).click();
    driver.findElement(By.id("restaurant_answer_2")).click();
    driver.findElement(By.id("close_correct_modal_btn")).click();
    driver.findElement(By.id("start")).click();
    driver.findElement(By.id("office_answer_1")).click();
    driver.findElement(By.id("close_modal_btn_1")).click();
    driver.findElement(By.id("bus_timer_start")).click();
    driver.findElement(By.cssSelector(".btn:nth-child(2)")).click();
  }
  @Test
  public void gotoaPublicPlace() {
    driver.get("https://responsivefight.herokuapp.com/");
    driver.manage().window().setSize(new Dimension(1536, 816));
    driver.findElement(By.id("worrior_username")).click();
    driver.findElement(By.id("worrior_username")).sendKeys("Pratap");
    driver.findElement(By.id("warrior")).click();
    driver.findElement(By.id("start")).click();
    driver.findElement(By.id("restaurant")).click();
    driver.findElement(By.id("restaurant_timer_start")).click();
    driver.findElement(By.id("restaurant_answer_2")).click();
    driver.findElement(By.id("close_incorrect_modal_btn")).click();
    driver.findElement(By.id("restaurant_answer_1")).click();
    driver.findElement(By.id("close_correct_modal_btn")).click();
    driver.findElement(By.id("start")).click();
    driver.findElement(By.id("office_answer_1")).click();
    {
      WebElement element = driver.findElement(By.id("office_answer_2"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.id("close_modal_btn_1")).click();
    driver.findElement(By.id("bus_timer_start")).click();
    driver.findElement(By.id("bus_answer_1")).click();
    driver.findElement(By.id("close_correct_modal_btn")).click();
    driver.findElement(By.id("restaurant_timer_start")).click();
    driver.findElement(By.id("restaurant_answer_2")).click();
    driver.findElement(By.id("close_correct_modal_btn")).click();
    driver.findElement(By.id("start")).click();
    driver.findElement(By.id("office_answer_2")).click();
    driver.findElement(By.id("close_modal_btn_2")).click();
    driver.findElement(By.id("office_answer_2")).click();
    driver.findElement(By.id("close_modal_btn_2")).click();
    driver.findElement(By.id("office_answer_2")).click();
    driver.findElement(By.id("close_modal_btn_2")).click();
    {
      WebElement element = driver.findElement(By.id("office_answer_2"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.cssSelector("#staticBackdrop4 .btn:nth-child(1)")).click();
    driver.findElement(By.id("office_answer_2")).click();
    driver.findElement(By.id("close_modal_btn_2")).click();
    driver.findElement(By.id("office_answer_2")).click();
    driver.findElement(By.id("close_modal_btn_2")).click();
    driver.findElement(By.id("office_answer_2")).click();
    driver.findElement(By.id("close_modal_btn_2")).click();
    driver.findElement(By.id("office_answer_2")).click();
    driver.findElement(By.id("close_modal_btn_2")).click();
    driver.findElement(By.id("office_answer_2")).click();
    driver.findElement(By.id("close_modal_btn_2")).click();
    driver.findElement(By.id("office_answer_2")).click();
    driver.findElement(By.id("close_modal_btn_2")).click();
    {
      WebElement element = driver.findElement(By.id("office_answer_2"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.cssSelector(".btn:nth-child(2)")).click();
  }
  @Test
  public void gototheOffice() {
    driver.get("https://responsivefight.herokuapp.com/");
    driver.manage().window().setSize(new Dimension(1536, 816));
    driver.findElement(By.id("worrior_username")).click();
    driver.findElement(By.id("worrior_username")).sendKeys("pratap");
    driver.findElement(By.id("warrior")).click();
    driver.findElement(By.id("start")).click();
    driver.findElement(By.id("office")).click();
    driver.findElement(By.id("start")).click();
    driver.findElement(By.id("office_answer_1")).click();
    {
      WebElement element = driver.findElement(By.id("office_answer_2"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.id("close_modal_btn_1")).click();
    driver.findElement(By.id("bus_timer_start")).click();
    driver.findElement(By.id("bus_answer_2")).click();
    driver.findElement(By.id("close_incorrect_modal_btn")).click();
    driver.findElement(By.id("bus_answer_1")).click();
    {
      WebElement element = driver.findElement(By.id("bus_answer_2"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.id("leaderboard_link")).click();
    driver.findElement(By.id("leaderboard_link")).click();
    driver.findElement(By.id("office")).click();
    driver.findElement(By.id("start")).click();
    driver.findElement(By.id("office_answer_1")).click();
    driver.findElement(By.id("close_modal_btn_1")).click();
    driver.findElement(By.id("bus_timer_start")).click();
    driver.findElement(By.id("bus_answer_2")).click();
    driver.findElement(By.id("close_incorrect_modal_btn")).click();
    driver.findElement(By.id("bus_answer_2")).click();
    driver.findElement(By.id("close_incorrect_modal_btn")).click();
    driver.findElement(By.id("bus_answer_2")).click();
    driver.findElement(By.id("close_incorrect_modal_btn")).click();
    driver.findElement(By.id("bus_answer_2")).click();
    driver.findElement(By.id("close_incorrect_modal_btn")).click();
    driver.findElement(By.id("bus_answer_2")).click();
    driver.findElement(By.id("close_incorrect_modal_btn")).click();
    driver.findElement(By.id("bus_answer_2")).click();
    driver.findElement(By.id("close_incorrect_modal_btn")).click();
    driver.findElement(By.cssSelector(".btn:nth-child(2)")).click();
  }
}
