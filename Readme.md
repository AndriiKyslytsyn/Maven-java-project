# Simple test on Step(MongoDB) using Maven framework on Java
## Description

*This simple automated test make login to STEP and сhecks the loading of tabs(Plans, Keywords, Parameters, etc.)*


## **Prerequisites**
1. Install the Open-Source version of our step application
2. If Java is not installed on your device, download JDK 11 from [Oracle’s website](https://www.oracle.com/java/technologies/downloads/#java11). Alternatively, you can also use the [Zulu SDK](https://www.azul.com/downloads/?version=java-11-lts&package=jdk), the recommended version is version 11.
3. Download the latest Community MongoDB Server instance from the [official website](https://www.mongodb.com/try/download/community). Quick download link: [4.0.9](https://fastdl.mongodb.org/win32/mongodb-win32-x86_64-2008plus-ssl-4.0.9-signed.msi)
4. Download controller archives from our [github release page](https://github.com/exense/step/releases/latest). 

-  Follow our documentation to install the Open-Source version of our step application on-premise on your laptop (https://step.exense.ch/knowledgebase/3.18/getting-started/quick-setup/) and start it. You do not need a step agent for this exercise
-  Install Chrome and the appropriate version of ChromeDriver on your laptop (https://chromedriver.chromium.org/downloads)
-   Start a new Maven Java project with the Selenium test framework as a dependency (https://www.selenium.dev/documentation/webdriver/)
### Creating simple Maven Java Project
-   Write a simple JUnit test that will perform a login to your local step instance using the Selenium framework (the browser must be Chrome or Chromium)
-   Extend the test to browse the step tabs (Plans, Keywords, Parameters, etc.) and make sure that the tab is loaded (lookup for an element on the page) before moving to the next one----
-pre requisitories
how to Start+desciption of pages and files+ pom.xml
Check for all works