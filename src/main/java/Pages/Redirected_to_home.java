package Pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Redirected_to_home {
    AndroidDriver driver;

    //Constructor that will be automatically called as soon as the object of the class is created
    public Redirected_to_home(AndroidDriver driver){
        this.driver=driver;
    }

    //locator assertion riderect to home
    By home = By.id("id.co.myhomecredit:id/toolbar");
    //mmthod assertion
    public void Home(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(home));
    }
}
