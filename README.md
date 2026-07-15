# Note Application Mobile Automation

Mobile automation framework for a Notes Android application, built using **Java** and **Appium**. This project automates the core **CRUD** operations of the Notes app — **Create**, **Read**, **Update**, and **Delete** — to validate functional behavior across different scenarios.

## Overview

This project uses **Appium** with **UiAutomator2** to drive automated UI tests against a real Android device running the Notes application. It follows a clean, modular test structure that separates navigation, actions, and test execution logic.

## Tech Stack

- **Language:** Java
- **Automation Tool:** Appium
- **Automation Engine:** UiAutomator2
- **Build Tool:** Maven
- **Platform:** Android

## Features Automated

- Create a new note
- Read / view note details
- Update an existing note
- Delete a note
- Navigate through upper and lower tabs
- Interact with the three-dot (overflow) menu options

## Prerequisites

Before running this project, ensure you have the following installed and configured:

- Java Development Kit (JDK 8 or above)
- Apache Maven
- Node.js and npm
- Appium Server (`npm install -g appium`)
- Android SDK & Platform Tools
- A physical Android device (or emulator) with USB debugging enabled
- Notes application installed on the device

## Desired Capabilities

The following desired capabilities are configured to launch and interact with the Notes application:

```java
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
```

> **Note:** Update the `deviceName` and `udid` values to match your own connected device. You can find your device's UDID by running `adb devices` in the terminal.

## Project Structure

```
NotesAppMobileAutomation
├── .idea
├── .mvn
├── src
│   ├── main
│   │   ├── java
│   │   └── resources
│   └── test
│       └── java
│           └── notes
│               ├── ClickNotesDetails.java
│               ├── ClickThreeDotOption.java
│               ├── NavigateLowerTabs.java
│               ├── NavigateUpperTabs.java
│               └── StartNotesAppTest.java
├── target
├── .gitignore
└── pom.xml
```

## Test Scenarios

| Test Scenario Title | Description |
|---|---|
| `StartNotesAppTest` | Initializes the Appium driver session and launches the Notes application |
| `NavigateUpperTabs` | Handles navigation actions across the upper tab section of the app |
| `NavigateLowerTabs` | Handles navigation actions across the lower tab section of the app |
| `ClickNotesDetails` | Handles opening and reading individual note details |
| `ClickThreeDotOption` | Handles interactions with the three-dot (overflow) menu, used for update/delete actions |

## How to Run

1. Clone this repository:
   ```
   git clone https://github.com/<your-username>/NotesAppMobileAutomation.git
   ```
2. Navigate to the project directory:
   ```
   cd NotesAppMobileAutomation
   ```
3. Connect your Android device via USB and verify it's detected:
   ```
   adb devices
   ```
4. Start the Appium server:
   ```
   appium
   ```
5. Update the desired capabilities in the code (`deviceName`, `udid`) to match your device.
6. Run the tests using Maven:
   ```
   mvn test
   ```

## Important Points

- Ensure USB debugging is enabled on the test device before running the tests.
- The `appPackage` and `appActivity` values are specific to the ColorOS Notes application (`com.coloros.note`). Update these if testing against a different Notes app.

## License

This project is intended for personal learning and testing purposes.

## Author

**Sania Gupta**
