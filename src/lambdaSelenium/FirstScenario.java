package lambdaSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScenario {
	
		    public static void main(String[] args) {
		        // 1. Set ChromeDriver path (change path as per your system)
		        System.setProperty("webdriver.chrome.driver", "C:\\Windows\\chromedriver.exe");

		        // 2. Launch browser
		        WebDriver driver = new ChromeDriver();

		        try {
		            // 3. Open LambdaTest Playground
		            driver.get("https://www.lambdatest.com/selenium-playground");

		            // 4. Click on "Simple Form Demo"
		            driver.findElement(By.linkText("Simple Form Demo")).click();

		            // 5. Verify URL
		            if (!driver.getCurrentUrl().contains("simple-form-demo")) {
		                System.out.println("URL is incorrect. Test failed.");
		                return;
		            }

		            // 6. Enter a message
		            String testMessage = "Welcome to LambdaTest!";
		            WebElement messageBox = driver.findElement(By.id("user-message"));
		            messageBox.sendKeys(testMessage);

		            // 7. Click "Get Checked Value"
		            driver.findElement(By.id("showInput")).click();

		            // 8. Verify output
		            WebElement displayed = driver.findElement(By.id("message"));
		            String output = displayed.getText();

		            if (output.equals(testMessage)) {
		                System.out.println("✅ Test Passed: Message displayed correctly.");
		            } else {
		                System.out.println("❌ Test Failed: Message mismatch.");
		            }

		        } finally {
		            // 9. Close browser
		            driver.quit();
		        }
		    }
		
	}


