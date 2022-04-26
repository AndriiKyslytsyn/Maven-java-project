# Simple test on Step(MongoDB) using Maven framework on Java
## Description

*This simple automated test make login to STEP and сhecks the loaded pages of tabs(Plans, Keywords, Parameters, etc.)*


## **Prerequisites**
1. Install the Open-Source version of [step application](https://step.exense.ch/knowledgebase/3.18/getting-started/quick-setup/)
2. If Java is not installed on your device, download JDK 11 from [Oracle’s website](https://www.oracle.com/java/technologies/downloads/#java11). Alternatively, you can also use the [Zulu SDK](https://www.azul.com/downloads/?version=java-11-lts&package=jdk), the recommended version is version 11.
3. Download the latest Community MongoDB Server instance from the [official website](https://www.mongodb.com/try/download/community). Quick download link: [4.0.9](https://fastdl.mongodb.org/win32/mongodb-win32-x86_64-2008plus-ssl-4.0.9-signed.msi)
4. Download controller archives from our [github release page](https://github.com/exense/step/releases/latest). 

## How to start
1. Create a new Maven Java project using this [guide](https://maven.apache.org/) (the browser must be Chrome or Chromium)
2. Clone a repository to created project
3. Start a controller ...\controller\bin\startController.bat. Wait when it start:
```javascript
Started o.e.j.s.ServletContextHandler@c6bf8d9{/rest,null,AVAILABLE}
Started o.e.j.s.h.ContextHandler@44392e64{/,null,AVAILABLE}
Started o.e.j.s.ServletContextHandler@e18d2a2{/files,null,AVAILABLE}
Started ServerConnector@7aedcf87{HTTP/1.1,[http/1.1]}{0.0.0.0:8080}
Started @55602ms
```
4. Open project
5. Start test from terminal use *"mvm test"*
6. If all test complete successfully(without any message) it works.

### **Descriptions of working files**
- The directory (main project)\src\test\java\page\ include ***Page.java files. Those files has main function and locators that used on TestTask.java
- The directory (main project)\src\test\java\test\
include TestBase.java(@Before and @after preconditions) and TestTask.java(test program code)

