package com.org.notes;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

public class ClickNotesDetails {

    AppiumDriver driver;

    //Initializing Appium Driver
    public ClickNotesDetails(AppiumDriver driver) {

        this.driver = driver;
    }

    //All-Notes Details
    public void clickAllNotesDetails() {

        try {

            WebElement allNotesButton = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.coloros.note:id/entrance\")"));

            allNotesButton.click();

            System.out.println("Click On All-Notes-Details Options");

            Thread.sleep(2000);

        } catch (Exception e) {

            System.out.println("Can't Click On All-Notes-Details Options : " + e.getMessage());
        }
    }

    //Close Button for All-Notes Details
    public void clickCloseButtonAllNotesDetails() {

        try {

            WebElement allNotesCloseButton = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.coloros.note:id/coui_toolbar_back_view\")"));

            allNotesCloseButton.click();

            System.out.println("Click On Back Button Of All-Notes-Details Options");

            Thread.sleep(2000);

        } catch (Exception e) {

            System.out.println("Can't Click On Back Button Of All-Notes-Details Options : " + e.getMessage());
        }
    }
}