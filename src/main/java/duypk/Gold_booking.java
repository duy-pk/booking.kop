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
        ConfigData.waitElementVisible(driver, Locator.inputDiemGiaoDich,10);
        driver.findElement(Locator.inputDiemGiaoDich).sendKeys(ConfigData.DiemGiaoDich);
        //So luong
        driver.findElement(Locator.inputSoLuong).sendKeys(ConfigData.SoLuong);
        //Ngay giao dich
        driver.findElement(Locator.inputNgayGiaoDich).sendKeys(ConfigData.NgayGiaoDich);
        //Click button Tiep tuc
        driver.findElement(Locator.tieptucButton).click();

        //Page2
        //Nhap ho ten
        ConfigData.waitElementVisible(driver, Locator.inputName,10);
        driver.findElement(Locator.inputName).sendKeys(ConfigData.Name);
        //Nhap ngay sinh
        driver.findElement(Locator.inputBirthday).sendKeys(ConfigData.Birthday);
        //Nhap dia chi
        driver.findElement(Locator.inputAddress).sendKeys(ConfigData.Address);
        //Nhap Email
        driver.findElement(Locator.inputEmail).sendKeys(ConfigData.Email);
        //Nhap sdt
        driver.findElement(Locator.inputPhone).sendKeys(ConfigData.Phone);
        //Nhap CCCD
        driver.findElement(Locator.inputCCCD).sendKeys(ConfigData.CCCD);
        //Nhap ngay cap CCCD
        driver.findElement(Locator.inputCCCDday).sendKeys(ConfigData.CCCD_day);
        //Nhap noi cap CCCD
        driver.findElement(Locator.inputCCCDaddress).sendKeys(ConfigData.CCCD_address);
    }
}
