package com.org.notes;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

public class NavigateUpperTabs {

    AppiumDriver driver;

    //Initializing Appium Driver
    public NavigateUpperTabs(AppiumDriver driver) {

        this.driver = driver;
    }

    //All-Notes Tab
    public void allNotes() {

        try {

            WebElement allNotesTab = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"All notes\")"));

            allNotesTab.click();

            System.out.println("Navigate to All-Notes-Tab");

            Thread.sleep(2000);

        } catch (Exception e) {

            System.out.println("Can't Navigate to All-Notes-Tab: " + e.getMessage());
        }
    }

    //Default Notebook Tab
    public void defaultNotebook() {

        try {

            WebElement defaultNotebookTab = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Default notebook\")"));

            defaultNotebookTab.click();

            System.out.println("Navigate to Default-Tab");

            Thread.sleep(2000);

        } catch (Exception e) {

            System.out.println("Can't Navigate to Default-Tab: " + e.getMessage());
        }
    }

    //Recently Deleted Tab
    public void recentlyDeleted() {

        try {

            WebElement recentlyDeletedTab = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Recently deleted\")"));

            recentlyDeletedTab.click();

            System.out.println("Navigate to Recently-Deleted-Tab");

            Thread.sleep(2000);

        } catch (Exception e) {

            System.out.println("Can't Navigate to Recently-Deleted-Tab: " + e.getMessage());
        }
    }
}
