package duypk;

import org.openqa.selenium.By;

public class Locator {

    //Page 1
    public static By inputDiemGiaoDich = By.xpath("//input[@id='input-xxx']");
    public static By inputSoLuong = By.xpath("//input[@id='input-xxx']");
    public static By inputNgayGiaoDich = By.xpath("//input[@id='input-xxx']");
    public static By tieptucButton = By.xpath("//input[@id='input-xxx']");

    //Page2
    public static By inputName = By.xpath("//input[@id='input-96']");
    public static By inputBirthdayButton = By.xpath("//input[@id='input-101']");
    public static By inputNamSinh = By.xpath("//li[normalize-space()='" + ConfigData.NamSinh + "']");
    public static By inputThangSinh = By.xpath("//div[normalize-space()='" + ConfigData.ThangSinh + "']");
    public static By inputNgaySinh = By.xpath("//div[normalize-space()='" + ConfigData.NgaySinh + "']");
    public static By inputAddress = By.xpath("//input[@id='input-105']");
    public static By inputEmail = By.xpath("//input[@id='input-108']");
    public static By inputPhone = By.xpath("//input[@id='input-111']");
    public static By inputCCCD = By.xpath("//input[@id='input-114']");
    public static By inputCCCDbutton = By.xpath("//input[@id='input-119']");
    public static By inputCCCD_Nam = By.xpath("//li[normalize-space()='" + ConfigData.CCCD_Nam + "']");
    public static By inputCCCD_Thang = By.xpath("//div[normalize-space()='" + ConfigData.CCCD_Thang + "']");
    public static By inputCCCD_Ngay = By.xpath("//div[@class='v-menu__content theme--light menuable__content__active']//div[normalize-space()='" + ConfigData.CCCD_Ngay + "']");
    public static By inputCCCDaddress = By.xpath("//input[@id='input-123']");
    public static By inputNationality = By.xpath("//input[@id='input-126']");
}
