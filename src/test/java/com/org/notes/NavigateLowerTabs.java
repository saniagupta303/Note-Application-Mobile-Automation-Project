package com.org.notes;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

public class NavigateLowerTabs {

    AppiumDriver driver;

    //Initializing Appium Driver
    public NavigateLowerTabs(AppiumDriver driver) {

        this.driver = driver;
    }

    //Notes Tab
    public void selectNotes() {

        try {

            WebElement notesTab = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.coloros.note:id/navigation_bar_item_icon_view\").instance(0)"));

            notesTab.click();

            System.out.println("Click On Notes Tab");

            Thread.sleep(2000);

        } catch (Exception e) {

            System.out.println("Can't Click On Notes Tab : " + e.getMessage());
        }
    }

    //Clicking Add Button to Create Notes
    public void createNotes() {

        try {

            WebElement addNotesButton = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.view.View\").instance(1)"));

            addNotesButton.click();

            System.out.println("Click On Add Notes Button");

            Thread.sleep(2000);

        } catch (Exception e) {

            System.out.println("Can't Click On Add Notes Button : " + e.getMessage());
        }
    }

    //Back Button of Notes Tab
    public void backNotesTab() {

        try {

            WebElement backNotesButton = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.coloros.note:id/coui_toolbar_back_view\")"));

            backNotesButton.click();

            System.out.println("Click On Back Button Of Notes Tab");

            Thread.sleep(2000);

        } catch (Exception e) {

            System.out.println("Can't Click On Back Button Of Notes Tab : " + e.getMessage());
        }

    }

    //Todos Tab
    public void selectTodo() {

        try {

            WebElement todoTab = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.coloros.note:id/navigation_bar_item_icon_view\").instance(1)"));

            todoTab.click();

            System.out.println("Click On Todo Tab");

            Thread.sleep(2000);

        } catch (Exception e) {

            System.out.println("Can't Click On Todo Tab : " + e.getMessage());
        }

    }

    //Clicking Add Button to Create Todos
    public void createTodo() {

        try {

            WebElement addTodoButton = driver.findElement(AppiumBy.xpath("//android.widget.LinearLayout[@resource-id=\"com.coloros.note:id/fab\"]/android.widget.FrameLayout/android.view.View"));

            addTodoButton.click();

            System.out.println("Click On Add Todo Button");

            Thread.sleep(2000);

        } catch (Exception e) {

            System.out.println("Can't Click On Add Todo Button : " + e.getMessage());
        }
    }

    //Cancel Button of Todos Tab
    public void cancelTodoTab() {

        try {

            WebElement cancelTodoButton = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.coloros.note:id/cancel\")"));

            cancelTodoButton.click();

            System.out.println("Click On Cancel Button Of Todo Tab");

            Thread.sleep(2000);

        } catch (Exception e) {

            System.out.println("Can't Click On Cancel Button Of Todo Tab : " + e.getMessage());
        }
    }
}
