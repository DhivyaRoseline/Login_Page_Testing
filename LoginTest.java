package loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginTest {
    public static void main(String[] args) throws InterruptedException {

    	System.setProperty("webdriver.chrome.driver", "C:/selenium webdriver/ChromeDriver/chromedriver-win64/chromedriver-win64/chromedriver.exe");


        WebDriver driver = new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.manage().window().maximize();

        String inputUsername = "divya";       
        String inputPassword = "Password123";   

        driver.findElement(By.id("username")).sendKeys(inputUsername);
        driver.findElement(By.id("password")).sendKeys(inputPassword);
        driver.findElement(By.id("submit")).click();

       
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        try {
            WebElement successHeader = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//h1[contains(text(),'Logged In Successfully')]")
                )
            );
            if (successHeader.isDisplayed()) {
                System.out.println("Login Test Passed: Successful login");
            }
        } catch (Exception e) {
            try {
                WebElement errorMessage = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//*[contains(text(),'Your username is invalid!') or contains(text(),'Your password is invalid!')]"))
                );
                System.out.println(" Login Test Failed: Invalid credentials");
            } catch (Exception ex) {
                System.out.println(" Unknown result: No expected message found");
            }
        }

        Thread.sleep(2000);
        driver.quit();
    }
}
