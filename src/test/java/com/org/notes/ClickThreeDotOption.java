package com.org.notes;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

public class ClickThreeDotOption {

    AppiumDriver driver;

    //Initializing Appium Driver
    public ClickThreeDotOption(AppiumDriver driver) {

        this.driver = driver;
    }

    //More Option
    public void selectMoreOption() {

        try {

            WebElement moreOptionButton = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"More options\")"));

            moreOptionButton.click();

            System.out.println("Select More Options");

            Thread.sleep(2000);

        } catch (Exception e) {

            System.out.println("Can't Select More Options : " + e.getMessage());
        }
    }

    //Grid View in More Option
    public void clickGridView() {

        try {

            WebElement gridViewButton = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Grid view\")"));

            gridViewButton.click();

            System.out.println("Click Grid View From More Options");

            Thread.sleep(2000);

        } catch (Exception e) {

            System.out.println("Can't Click Grid View From More Options : " + e.getMessage());
        }
    }

    //List View in More Option
    public void clickListView() {

        try {

            WebElement listViewButton = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"List view\")"));

            listViewButton.click();

            System.out.println("Click List View From More Options");

            Thread.sleep(2000);

        } catch (Exception e) {

            System.out.println("Can't Click List View From More Options : " + e.getMessage());
        }
    }

    //Settings in More Option
    public void clickSettings() {

        try {

            WebElement settingsButton = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Settings\")"));

            settingsButton.click();

            System.out.println("Click Settings From More Options");

            Thread.sleep(2000);

        } catch (Exception e) {

            System.out.println("Can't Click Settings From More Options : " + e.getMessage());
        }
    }

    //Back Button for Settings in More Option
    public void clickBackButtonSettings() {

        try {

            WebElement settingsBackButton = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.coloros.note:id/coui_toolbar_back_view\")"));

            settingsBackButton.click();

            System.out.println("Go Back From Settings Options");

            Thread.sleep(2000);

        } catch (Exception e) {

            System.out.println("Can't Go Back From Settings Options : " + e.getMessage());
        }

    }

    //Sort-By-Time-Created in More Option
    public void clickSortByTimeCreated() {

        try {

            WebElement timeCreatedButton = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Sort by time created\")"));

            timeCreatedButton.click();

            System.out.println("Click Sort By Time Created From More Options");

            Thread.sleep(2000);

        } catch (Exception e) {

            System.out.println("Can't Click Sort By Time Created From More Options : " + e.getMessage());
        }
    }

    //Sort-By-Time-Edited in More Option
    public void clickSortByTimeEdited() {

        try {

            WebElement timeEditedButton = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Sort by time edited\")"));

            timeEditedButton.click();

            System.out.println("Click Sort By Time Edited From More Options");

            Thread.sleep(2000);

        } catch (Exception e) {

            System.out.println("Can't Click Sort By Time Edited From More Options : " + e.getMessage());
        }
    }
}
