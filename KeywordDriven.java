package KeywordDrivenDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeywordDriven {
    public static WebDriver driver;

    public static void main(String[]args){
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo");
        driver.findElement(By.linkText("My Account")).click();
        driver.findElement(By.linkText("Login")).click();
        KeywordDriven.enterEmail("seleniumpanda@gmail.com");
        KeywordDriven.enterPassword("Selenium@123");
        KeywordDriven.clickOnLoginButton();
        KeywordDriven.verifyLoginSuccess();
        driver.quit();
    }
        public static void enterEmail(String email){
            WebElement emailField = driver.findElement(By.id("input-email"));
            emailField.sendKeys(email);
        }
        public static void enterPassword(String password){
            WebElement passwordField = driver.findElement(By.id("input-password"));
            passwordField.sendKeys(password);
    }
        public static void clickOnLoginButton(){
             WebElement loginButton = driver.findElement(By.cssSelector("input.btn.btn-primary"));
             loginButton.click();
    }
        public static void verifyLoginSuccess(){
        WebElement Logoutlink = driver.findElement(By.linkText("Logout"));
        String text = Logoutlink.getText();

        if(text.contains("Logout")){
            System.out.println("Login is successful");
        } else {
            System.out.println("login is failed");
        }

    }

}
















































