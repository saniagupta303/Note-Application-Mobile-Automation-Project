package com.org.notes;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class StartNotesAppTest {

    //Initializing Appium Driver
    static AppiumDriver driver;

    public static void openApp() throws MalformedURLException {

        DesiredCapabilities cap = new DesiredCapabilities();

        //Device Name
        cap.setCapability("deviceName", "OPPO K13X 5G");
        cap.setCapability("udid", "HMUWPVF6VK8LZDIB");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "15");
        cap.setCapability("automationName", "uiAutomator2");

        //Notes Application Package
        cap.setCapability("appPackage", "com.coloros.note");
        cap.setCapability("appActivity", "com.nearme.note.main.MainActivity");

        //Ignore Hidden Policy of Notes App
        cap.setCapability("ignoreHiddenApiPolicyError", true);

        //Localhost
        URL url = new URL("http://127.0.0.1:4723/");


        driver = new AppiumDriver(url, cap);

        //Opening Notes Application
        System.out.println("Application Started");
    }

    //Ignore Option For Notes Auto Sync
    public static void ignoreOptionAutoSync() {

        try {

            WebElement ignoreButton = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.coloros.note:id/ignore\")"));

            ignoreButton.click();

            System.out.println("Click On Ignore Options For Notes Auto-Sync");

            Thread.sleep(2000);

        } catch (Exception e) {

            System.out.println("Can't Click On Ignore Options For Notes Auto-Sync : " + e.getMessage());
        }
    }

    //Turn-On Option For Notes Auto Sync
    public static void turnonOptionAutoSync() {

        try {

            WebElement turnonButton = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.coloros.note:id/action\")"));

            turnonButton.click();

            System.out.println("Click On Turn-On Options For Notes Auto-Sync");

            Thread.sleep(2000);

        } catch (Exception e) {

            System.out.println("Can't Click On Turn-On Options For Notes Auto-Sync : " + e.getMessage());
        }
    }

    //Navigating Upper Tabs in Notes Application
    public static void testFlow1() {

        //NavigateUpperTabs nut1 = new NavigateUpperTabs(driver);
        //nut1.allNotes();
        //nut1.defaultNotebook();
        //nut1.recentlyDeleted();
    }

    //More Options in Notes Application
    public static void testFlow2() {

        //ClickThreeDotOption ctdo1 = new ClickThreeDotOption(driver);
        //ctdo1.selectMoreOption();
        //ctdo1.clickGridView();
        //ctdo1.clickListView(); ---> NA
        //ctdo1.clickSettings(); ---> NA
        //ctdo1.clickBackButtonSettings(); ---> NA
        //ctdo1.clickSortByTimeCreated();
        //ctdo1.clickSortByTimeEdited();
    }

    //Notes Details in Notes Application
    public static void testFlow3() {

        ClickNotesDetails cnd1 = new ClickNotesDetails(driver);
        cnd1.clickAllNotesDetails();
        cnd1.clickCloseButtonAllNotesDetails();
    }


    //Navigating Lower Tabs in Notes Application
    public static void testFlow4() {

        NavigateLowerTabs nlt1 = new NavigateLowerTabs(driver);
        nlt1.selectNotes();
        nlt1.createNotes();
        nlt1.backNotesTab();
        nlt1.selectTodo();
        nlt1.createTodo();
        nlt1.cancelTodoTab();

    }

    public static void main(String[] args) throws MalformedURLException {

        openApp();
        //testFlow1();
        //testFlow2();
        //testFlow3();
        testFlow4();
    }
}