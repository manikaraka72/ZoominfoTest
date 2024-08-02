package StepDefinition;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Hook {

    public static WebDriver driver;
  @Before
  public void beforeScenario(){
      driver=getChromeDriver();
      driver.get("https://web2.0calc.com");
    }
    private static WebDriver getChromeDriver() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("window-size=1920,1080");
        options.addArguments("--disable-extensions");
        options.addArguments("disable-infobars");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        capabilities.setBrowserName("chrome");

        return new ChromeDriver(options);
    }
    @After
    public void afterScenario(){
     driver.quit();
    }

}
