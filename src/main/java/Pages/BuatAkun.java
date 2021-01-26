package Pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class BuatAkun {
    AndroidDriver driver;

    public BuatAkun(AndroidDriver driver){
        this.driver=driver;
    }

    //locator tanggal lahir
    By tanggal = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[3]/android.view.View[1]/android.widget.Spinner[1]");
    By PTanggal = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[10]");
    //method pilih tanggal
    public void Tanggal(){
        driver.findElement(tanggal).click();
        driver.findElement(PTanggal).click();

    }

    //locator bulan lahir
    By bulan = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[3]/android.view.View[1]/android.widget.Spinner[2]");
    By PBulan = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[5]");
    //method pilih bulan
    public void Bulan(){
        driver.findElement(bulan).click();
        driver.findElement(PBulan).click();
    }

    //locator tahun lahir
    By tahun = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[3]/android.view.View[1]/android.widget.Spinner[3]");
    By Ptahun = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]");
    //method pilih tahun
    public void  Tahun(){
        driver.findElement(tahun).click();
        driver.findElement(Ptahun).click();
    }

    //locator phone number
    By phone = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[3]/android.view.View[2]/android.view.View/android.widget.EditText");
    //methpd input number
    public void Phone(String nmr){
        driver.findElement(phone).sendKeys(nmr);
    }


    //locator pin
    By pin = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[3]/android.view.View[3]/android.view.View/android.widget.EditText");
    //methpd input pin
    public void PIN(String nmr){
        driver.findElement(pin).sendKeys(nmr);
    }

    //locator pin
    By pin2 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[3]/android.view.View[4]/android.view.View/android.widget.EditText");
    //methpd input pin
    public void PIN2(String nmr){
        driver.findElement(pin2).sendKeys(nmr);
    }

    //locator button submit
    By btnSubmit = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[3]/android.view.View[5]/android.widget.Button");
    //method click button lanjutkan
    public void Lanjut(){
        driver.findElement(btnSubmit).click();
    }

}
