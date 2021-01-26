package Pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KonfirmasiData {

    AndroidDriver driver;

    public KonfirmasiData(AndroidDriver driver){
        this.driver=driver;
    }

    //locator click lanjutkan
    By lanjutkan = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[4]/android.view.View/android.view.View[6]/android.widget.Button");
    //method click lanjutkan
    public void Lanjutkan(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(lanjutkan));
        driver.findElement(lanjutkan).click();
    }
}
