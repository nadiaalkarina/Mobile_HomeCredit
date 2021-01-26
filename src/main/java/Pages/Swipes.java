package Pages;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;

public class Swipes {
   AndroidDriver driver;

   //Constructor that will be automatically called as soon as the object of the class is created
   public Swipes(AndroidDriver driver){
      this.driver=driver;
   }

   //locator for swipes coordinate
   By btnRegis = By.id("com.loginmodule.learning:id/textViewLinkRegister");
   //method to click the button
   public void ClickRegis(){
      driver.findElement(btnRegis).click();
   }

   //method swipe 1
   public void Swipe1(){
      AndroidElement slider = (AndroidElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup"));
      new TouchAction<>(driver)
              .press(PointOption.point(1045, 1181))
              .moveTo(PointOption.point(5, 1136))
              .release().perform();

   }

   //method swipe 2
   public void Swipe2(){
      AndroidElement slider = (AndroidElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup"));
      new TouchAction<>(driver)
              .press(PointOption.point(1060, 1110))
              .moveTo(PointOption.point(15, 1136))
              .release().perform();

   }

   //method swipe 3
   public void Swipe3(){
      AndroidElement slider = (AndroidElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup"));
      new TouchAction<>(driver)
              .press(PointOption.point(1060, 1095))
              .moveTo(PointOption.point(25, 1050))
              .release().perform();

   }

   //locator button daftar
   By btnDaftar = By.id("id.co.myhomecredit:id/button_register");
   //method click button daftar
   public void BtnDaftar(){
      driver.findElement(btnDaftar).click();
   }

}
