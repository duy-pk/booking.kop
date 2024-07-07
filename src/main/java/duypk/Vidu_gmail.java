package duypk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Vidu_gmail {
    private static String url = "https://accounts.google.com/lifecycle/steps/signup/name?continue=https://mail.google.com/mail/&ddm=0&dsh=S855867904:1720260293224634&ec=asw-gmail-globalnav-create&flowEntry=SignUp&flowName=GlifWebSignIn&service=mail&theme=glif&TL=ALoj5ApfchZud5WhmYYC_1aPWJ1QJDL1im7o08liqg8S6Kqs-An45wxzxBoe_sb6";

    private static  By inputLastName = By.xpath("//input[@id='lastName']");
    private static  By inputFirstName = By.xpath("//input[@id='firstName']");
    private static  By tieptheoButton1 = By.xpath("//span[@class='VfPpkd-vQzf8d']");

    private static  By inputNgaysinh = By.xpath("//input[@id='day']");
    private static  By inputThangsinh = By.xpath("//select[@id='month']");
    private static  By inputNamsinh = By.xpath("//input[@id='year']");
    private static  By inputGioitinh = By.xpath("//select[@id='gender']");
    private static  By tieptheoButton2 = By.xpath("//span[@class='VfPpkd-vQzf8d']");

    private static By inputUsername = By.xpath("//input[@name='Username']");
    private static By tieptheoButton3 = By.xpath("//span[@class='VfPpkd-vQzf8d']");

    private static By inputPass = By.xpath("//input[@name='Passwd']");
    private static By inputConfirmPass = By.xpath("//input[@name='PasswdAgain']");
    private static By tieptheoButton4 = By.xpath("//span[@class='VfPpkd-vQzf8d']");

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(url);

        ConfigData.waitElementVisible(driver,tieptheoButton1,20);
        driver.findElement(tieptheoButton1).click();

        ConfigData.waitElementVisible(driver,inputLastName,20);
        driver.findElement(inputLastName).sendKeys("Vuong");
        driver.findElement(inputFirstName).sendKeys("Dong");
        driver.findElement(tieptheoButton1).click();

        ConfigData.waitElementVisible(driver,inputNgaysinh,20);
        driver.findElement(inputNgaysinh).sendKeys("10");
        driver.findElement(inputThangsinh).sendKeys("Tháng 10");
        driver.findElement(inputGioitinh).sendKeys("Nam");
        driver.findElement(inputNamsinh).sendKeys("1995");
        driver.findElement(tieptheoButton2).click();

        ConfigData.waitElementVisible(driver,inputUsername,20);
        driver.findElement(inputUsername).sendKeys("vuongdongdinhat123");
        driver.findElement(tieptheoButton3).click();

        ConfigData.waitElementVisible(driver,inputPass,20);
        driver.findElement(inputPass).sendKeys("A@123456789");
        driver.findElement(inputConfirmPass).sendKeys("A@123456789");
        driver.findElement(tieptheoButton4).click();

    }
}
