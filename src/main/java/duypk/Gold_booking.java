package duypk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gold_booking {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(ConfigData.url);

        //Page1
        //Dia diem giao dich
//        ConfigData.waitElementVisible(driver, Locator.inputDiemGiaoDich,10);
//        driver.findElement(Locator.inputDiemGiaoDich).sendKeys(ConfigData.DiemGiaoDich);
        //So luong
//        driver.findElement(Locator.inputSoLuong).sendKeys(ConfigData.SoLuong);
        //Ngay giao dich
//        driver.findElement(Locator.inputNgayGiaoDich).sendKeys(ConfigData.NgayGiaoDich);
        //Click button Tiep tuc
//        driver.findElement(Locator.tieptucButton).click();

        //Page2
        //Nhap ho ten
        ConfigData.waitElementVisible(driver, Locator.inputName,300);
        driver.findElement(Locator.inputName).sendKeys(ConfigData.Name);

        //Nhap dia chi
        driver.findElement(Locator.inputAddress).sendKeys(ConfigData.Address);
        //Nhap Email
        driver.findElement(Locator.inputEmail).sendKeys(ConfigData.Email);
        //Nhap sdt
        driver.findElement(Locator.inputPhone).sendKeys(ConfigData.Phone);
        //Nhap CCCD
        driver.findElement(Locator.inputCCCD).sendKeys(ConfigData.CCCD);

        //Nhap noi cap CCCD
        driver.findElement(Locator.inputCCCDaddress).sendKeys(ConfigData.CCCD_address);

        //Nhap ngay sinh
        driver.findElement(Locator.inputBirthdayButton).click();
        ConfigData.waitElementVisible(driver, Locator.inputNamSinh,20);
        driver.findElement(Locator.inputNamSinh).click();
//        ConfigData.waitElementVisible(driver, Locator.inputThangSinh,20);
        ConfigData.sleep(1);
        driver.findElement(Locator.inputThangSinh).click();
//        ConfigData.waitElementVisible(driver, Locator.inputNgaySinh,20);
        ConfigData.sleep(1);
        driver.findElement(Locator.inputNgaySinh).click();

        //Nhap ngay cap CCCD
        driver.findElement(Locator.inputCCCDbutton).click();
        ConfigData.waitElementVisible(driver, Locator.inputCCCD_Nam,20);
        driver.findElement(Locator.inputCCCD_Nam).click();
//        ConfigData.waitElementVisible(driver, Locator.inputCCCD_Thang,20);
        ConfigData.sleep(1);
        driver.findElement(Locator.inputCCCD_Thang).click();
//        ConfigData.waitElementVisible(driver, Locator.inputCCCD_Ngay,20);
        ConfigData.sleep(1);
        driver.findElement(Locator.inputCCCD_Ngay).click();
    }
}
