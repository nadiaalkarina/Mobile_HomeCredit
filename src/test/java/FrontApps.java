import Pages.*;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;

public class FrontApps {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        caps.setCapability("platformName", "android");
        caps.setCapability("appPackage", "id.co.myhomecredit");
        caps.setCapability("appActivity", "id.co.homecredit.v2.launcherpage.SplashScreenActivity");
        caps.setCapability("noReset", true);
        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),caps );

        Dimension size = driver.manage().window().getSize();
        System.out.println(size);

        Swipes swipes = new Swipes(driver);
        Thread.sleep(3000);
        swipes.Swipe1();
        Thread.sleep(3000);
        swipes.Swipe2();
        Thread.sleep(3000);
        swipes.Swipe3();
        swipes.BtnDaftar();

        Persetujuan persetujuan = new Persetujuan(driver);
        Thread.sleep(3000);
        persetujuan.Lanjut();

        BuatAkun buatAkun = new BuatAkun(driver);
        Thread.sleep(10000);
        buatAkun.Tanggal();
        Thread.sleep(1000);
        buatAkun.Bulan();
        Thread.sleep(1000);
        buatAkun.Tahun();
        Thread.sleep(1000);
        buatAkun.Phone("81271013634");
        Thread.sleep(2000);
        buatAkun.PIN("998877");
        Thread.sleep(2000);
        buatAkun.PIN2("998877");
        Thread.sleep(1000);
        buatAkun.Lanjut();

        KonfirmasiData konfirmasiData = new KonfirmasiData(driver);
        Thread.sleep(1000);
        konfirmasiData.Lanjutkan();

        VerifikasiKode verifikasiKode = new VerifikasiKode(driver);
        verifikasiKode.timer();
        verifikasiKode.Daftar();

        Redirected_to_home redirected_to_home = new Redirected_to_home(driver);
        redirected_to_home.Home();

    }
}