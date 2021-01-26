package Pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VerifikasiKode {

    AndroidDriver driver;

    public VerifikasiKode(AndroidDriver driver){
        this.driver=driver;
    }

    //timer for input otp
    public void timer(){
        WebDriverWait wait = new WebDriverWait(driver, 240);
        wait.until(ExpectedConditions.presenceOfElementLocated(By
                .name("01.00")));
    }


    //locator for button daftar
    By daftar = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[5]/android.widget.Button");
    //Method for click button
    public void Daftar(){
        driver.findElement(daftar).click();
    }
}
