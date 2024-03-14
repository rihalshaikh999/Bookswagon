package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static Bookswagon_Base.TestBase.driver;
import static Bookswagon_Base.TestBase.initialization;

public class SignUpTest
{
    public SignUpTest()
    {
        super();
    }
    @BeforeMethod
    public void setUp1()
    {
        initialization();
    }
    @Test(priority = 1)
    public void signupTest() throws InterruptedException {
        WebElement newSignup=driver.findElement(By.xpath("//*[@id=\"ctl00_phBody_SignIn_plnLoginPassword\"]/div[4]/div/a"));
        newSignup.click();
        driver.findElement(By.xpath("//*[@id=\"ctl00_phBody_SignUp_txtName\"]")).sendKeys("Rihal Farukh Shaikh");
        driver.findElement(By.xpath("//*[@id=\"ctl00_phBody_SignUp_txtEmail\"]")).sendKeys("8830540511");
        Thread.sleep(15000);
        driver.findElement(By.xpath("//*[@id=\"ctl00_phBody_SignUp_btnContinue\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"ctl00_phBody_SignUp_txtPassword\"]")).sendKeys("Pass@123");
        driver.findElement(By.xpath("//*[@id=\"ctl00_phBody_SignUp_txtConfirmPwd\"]")).sendKeys("Pass@123");
        Thread.sleep(5000);
        WebElement button=driver.findElement(By.xpath("//*[@id=\"ctl00_phBody_SignUp_btnSubmit\"]"));
        button.click();
    }
}
