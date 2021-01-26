package Pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Persetujuan {
    AndroidDriver driver;

    //Constructor that will be automatically called as soon as the object of the class is created
    public Persetujuan(AndroidDriver driver){
        this.driver=driver;
    }

    //locator button setuju & lanjutkan
    By lanjut = By.id("id.co.myhomecredit:id/agree_button");
    //method click setuju & lanjutkan
    public void Lanjut(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(lanjut));
        driver.findElement(lanjut).click();
    }

}
