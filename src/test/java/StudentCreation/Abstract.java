package StudentCreation;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.text.SimpleDateFormat;

import java.util.Date;

public class Abstract {
    protected WebDriver driver;
    @Before
    public void testNavigate() throws InterruptedException {
        if(driver==null){

            String name = "VIFebMon08One";

            Date date = new Date(90,01,01);
            SimpleDateFormat formatDateJava = new SimpleDateFormat("dd/MM/yyyy");
            String date_to_string = formatDateJava.format(date);

            System.setProperty("webdriver.chrome.driver", "src"+File.separator+"main"+File.separator+"resources"+File.separator+"chromedriver");
            driver = new ChromeDriver();
//            driver = new HtmlUnitDriver();
//            driver = new FirefoxDriver();
            driver.manage().window().maximize();



            driver.navigate().to("https://test.salesforce.com");

            //Login
            driver.findElement(By.id("username")).sendKeys("crmteamfusion@noah_crm_bpp.com.noahqa");
            driver.findElement(By.id("password")).sendKeys("Fusion12345");
            driver.findElement(By.id("Login")).click();
//            String parentWindow = driver.getWindowHandle();
//
//            driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
//            String childWindow = (String) driver.getWindowHandles().toArray()[1];
//            driver.switchTo().window(childWindow);
//
//            driver.navigate().to("https://accounts.google.com/ServiceLogin?service=mail&continue=https://mail.google.com/mail/#identifier");
//
//            driver.findElement(By.id("Email")).sendKeys("crmteamfusion@gmail.com");
//            driver.findElement(By.id("next")).click();
//            driver.findElement(By.tagName("body")).click();
//            Thread.sleep(1000);
//            driver.findElement(By.xpath("//*[@id='Passwd']")).sendKeys("Fusion12345");
//
//            driver.findElement(By.id("signIn")).click();
//            Thread.sleep(1000);
//            driver.navigate().to("https://mail.google.com/mail/u/0/#inbox/152a17a850c43242");
//            String code = driver.findElement(By.xpath("//*[@id=\":qf\"]/div[3]/div[2]/text()[4]")).getText();
//            driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "w");
//            String verCode [] = code.split(": ");
//            System.out.println(verCode[1]);
//
//            driver.switchTo().window(parentWindow);
//            driver.findElement(By.id("emc")).sendKeys(verCode[1]);
//            driver.findElement(By.id("save")).click();

            Thread.sleep(1000);

            driver.findElement(By.className("allTabsArrow")).click();
            driver.findElement(By.linkText("Accounts")).click();
            driver.findElement(By.name("new")).click();
            driver.findElement(By.xpath("//*[@id='bottomButtonRow']/input[1]")).click();

            driver.findElement(By.id("name_firstacc2")).sendKeys(name);
            driver.findElement(By.id("name_lastacc2")).sendKeys(name);

            Select Student_Type = new Select(driver.findElement(By.id("00Nb0000003v7lc")));
            Student_Type.selectByVisibleText("Domestic");

            Select Gender = new Select(driver.findElement(By.id("00Nb0000003v7kV")));
            Gender.selectByVisibleText("Male");

            Select Preferred_Phone = new Select(driver.findElement(By.id("00Nb0000003v7kg")));
            Preferred_Phone.selectByVisibleText("Home");
            driver.findElement(By.id("PersonHomePhone")).sendKeys("0000000000");

            Select Preferred_Email = new Select(driver.findElement(By.id("00Nb0000003v7ke")));
            Preferred_Email.selectByVisibleText("Personal");
            driver.findElement(By.id("00Nb0000003v7kd")).sendKeys(name+"@mailinator.com");
//            driver.findElement(By.id("00Nb0000003v7kd")).sendKeys("test.fortesting@yahoo.com");
            Select Legal_Entity = new Select(driver.findElement(By.id("00Nb0000004LziE")));
            Legal_Entity.selectByVisibleText("UC~COL");

            driver.findElement(By.id("PersonBirthdate")).sendKeys(date_to_string);

            driver.findElement(By.name("save")).click();

            driver.findElement(By.name("get_profile_id_v2")).click();

            Thread.sleep(7000);

            driver.findElement(By.name("new00Nb0000004Lzej")).click();

            Select Address_Type = new Select(driver.findElement(By.id("00Nb0000004Lzeo")));
            Address_Type.selectByVisibleText("Billing");

            driver.findElement(By.id("00Nb0000004Lzed")).click();
            driver.findElement(By.id("00Nb0000004Lzef")).sendKeys(name);
            driver.findElement(By.id("00Nb0000004LzeZ")).sendKeys(name);
            driver.findElement(By.id("00Nb0000004Lzep")).sendKeys(name);
            driver.findElement(By.id("CF00Nb0000004Lzec")).sendKeys("United Kingdom");
            driver.findElement(By.name("save")).click();

            driver.findElement(By.partialLinkText(name)).click();
            driver.findElement(By.name("newOpp")).click();

            driver.findElement(By.xpath("//*[@id='bottomButtonRow']/input[1]")).click();
            driver.findElement(By.id("opp3")).sendKeys(name);

            Select Status = new Select(driver.findElement(By.id("opp11")));
            Status.selectByVisibleText("Accepted - Conditional Firm");

            Select Customer_Group = new Select(driver.findElement(By.id("00Ng0000001MZHo")));
            Customer_Group.selectByVisibleText("SELFFUND");

            Date date2 = new Date(117,01,01);
            SimpleDateFormat formatDateJava1 = new SimpleDateFormat("dd/MM/yyyy");
            String date_to_string1 = formatDateJava1.format(date2);
            driver.findElement(By.id("opp9")).sendKeys(date_to_string1);

            Select Sponsorship_Level = new Select(driver.findElement(By.id("00Nb0000009XrE0")));
            Sponsorship_Level.selectByVisibleText("None");
            driver.findElement(By.name("save")).click();
        }
    }
    @After
    public void testExit(){
//        driver.close();
    }
}
