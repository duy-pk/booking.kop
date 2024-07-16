package duypk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ConfigData {

    //url den trang booking vang
    public static String url = "https://bookingonline.agribank.com.vn/muavangSJCtructuyen";

    //Page1
    public static String DiemGiaoDich = "Agribank HN";
    public static String SoLuong = "1";
    public static String NgayGiaoDich = "12/6/2024";

    //Page 2
    public static String Name = "Pham Khuong Duy";
    public static String NamSinh = "1994";
    public static String ThangSinh = "Thg 10";
    public static String NgaySinh = "19";
    public static String Address = "Gia Lam, Ha Noi";
    public static String Email = "khuongduypham0175@gmail.com";
    public static String Phone = "0976367965";
    public static String CCCD = "037094002492";
    public static String CCCD_Nam = "2022";
    public static String CCCD_Thang = "Thg 8";
    public static String CCCD_Ngay = "22";
    public static String CCCD_address = "Cuc canh sat quan ly hanh chinh ve trat tu xa hoi";
    public static String Nationality = "Viet Nam";

    //Time Sleep
    public static void sleep(Integer second){
        try {
            Thread.sleep(second*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    //Wait Element visible
    public static void waitElementVisible(WebDriver driver, By by, int Time){
        try{
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Time));
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        } catch (Throwable error) {
            System.out.println("Time out to wait Element");
        }
    }
}
