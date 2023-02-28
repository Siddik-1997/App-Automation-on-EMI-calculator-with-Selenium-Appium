# App-Automation-on-EMI-calculator-with-Selenium-Appium

An EMI (Equated Monthly Installment) calculator is a tool used to calculate the monthly payments that need to be made towards a loan. It takes into account the principal amount, the interest rate, and the loan tenure to calculate the EMI amount. This calculator can help borrowers plan their finances and determine the affordability of a loan. 

## Technology used:

- Selenium Webdriver
- Appium
- Intellij 
- Android Studio
- Appium Inspector
- Gradle
- Java

## How to run this project:

- Clone this project
- Open Android Studio and Open the APK file:
- Set required configuration 
- Hit this command in cmd for checking the connectivity with emulator : ``adb devices``
- Open Appium Server with following command: ```appium -p 4723```
- Open Appium Inspector
- Set desired capabilites in json format:
``` 
 {
  "appium:deviceName": "emulator",
  "appium:uuid": "emulator-5554",
  "platformName": "Android",
  "appium:platfromVersion": "11",
  "appium:appPackage": "com.continuum.emi.calculator",
  "appium:appActivity": "com.finance.emicalci.activity.Splash_screnn",
  "appium:app": "D:\\APK\\emi-calc.apk"
  }
```
- Open Intellij Idea
- Hit the following command into the terminal: ```gradle clean test```
- For generating Allure Report use these commands: ```allure generate allure-results --clean -o allure-report``` and ```allure serve allure-results```


## Project scenerio:

**If an user take loan (?) tk from a bank with interest of (?)% and  want to give (?) tk per month as EMI (installment) and processing fee (?)%, how many time period it will take to complete the loan? Take the values from dataset and assert the monthly EMI, total interest, processing fee amount and total payment from the result view.**

**For solve this question, create a dataset using following values:**

```
Amount | Interest | EMI | Processing Fee | Monthly EMI | Total Interest | Processing Fee | Total Payment | Period (Year) | Period (Month)

100000 | 6 | 2000 | 2% | 2000 | 15361.08 | 2000 | 115361.08 | 4 | 10
200000 | 8 | 5000 | 2% | 5000 | 33391.61 | 4000 | 233391.61 | 3 | 11

250000 | 7 | 8000 | 1.5% | 8000 | 26804.51 | 3750 | 276804.51 | 2 | 11

50000 | 10 | 1000 | 5% | 1000 | 14949.12 | 2500 | 64949.12 | 5 | 5

```
## Prerequisites:

- Install Android Studio latest version
- Install Appium Inspector
- Install jdk 8 or any LTS version
- Configure ANDROID_HOME, JAVA_HOME and GRADLE_HOME

## Dependencies: 

// https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java

    implementation group: 'org.seleniumhq.selenium', name: 'selenium-java', version: '3.141.59'
    
// https://mvnrepository.com/artifact/org.testng/testng

    testImplementation group: 'org.testng', name: 'testng', version: '7.5'
    
// https://mvnrepository.com/artifact/io.appium/java-client

    implementation group: 'io.appium', name: 'java-client', version: '7.5.1'
    
// https://mvnrepository.com/artifact/io.qameta.allure/allure-testng

    implementation group: 'io.qameta.allure', name: 'allure-testng', version: '2.20.1'

## Allure Report:

![Screenshot (26)](https://user-images.githubusercontent.com/123433625/221930535-336a44de-6920-4bfc-9adc-142df617e8f5.png)

![Screenshot (27)](https://user-images.githubusercontent.com/123433625/221930553-1c278197-eaed-4be6-b308-777b0384ded0.png)

# Video Output:

https://user-images.githubusercontent.com/123433625/221930571-ea4ae662-5c57-4435-82dc-0165259f4cce.mp4




