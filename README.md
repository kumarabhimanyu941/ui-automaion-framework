
# 🚀 UI Automation Framework – Java + Selenium + TestNG

This is a robust and scalable **UI Test Automation Framework** built using **Java**, **Selenium WebDriver**, and **TestNG**.  
It follows best practices like the **Page Object Model**, **Singleton Pattern**, **Factory Design**, and supports **parallel execution** with **ThreadLocal WebDriver**.

---

## 📂 Tech Stack

- 🔹 Java
- 🔹 Selenium WebDriver
- 🔹 TestNG
- 🔹 Maven
- 🔹 Page Object Model (POM)
- 🔹 Singleton Design Pattern
- 🔹 Factory Design Pattern
- 🔹 ThreadLocal for parallel test execution
- 🔹 TestNG XML for suite configuration
- 🔹 Log4j for logging *(coming soon)*
- 🔹 ExtentReports *(coming soon)*

---

## 🚗 How to Run

1. **Clone the repo**
   ```bash
   git clone https://github.com/kumarabhimanyu941/ui-automaion-framework
````

2. **Navigate to the project**

   ```bash
   cd ui-automaion-framework
   ```

3. **Run using Maven**

   ```bash
   mvn clean test
   ```

4. **Configure browser**

   > Update `config.properties` with desired browser (chrome/firefox)
   > e.g., `browser=chrome`

---

## 🔑 Framework Highlights

* ✅ Thread-safe WebDriver via Singleton + ThreadLocal
* ✅ `DriverFactory.java` handles browser setup and tear-down
* ✅ Clean BaseTest setup using TestNG @BeforeMethod / @AfterMethod
* ✅ Scalable Page Object Model design
* ✅ Easily extendable to API + DB + Performance testing

---

## 📂 Folder Structure

```
src
 └── main
     └── java
         ├── factory             # DriverFactory + browser management
         ├── pages               # Page classes for each UI screen
         ├── tests               # TestNG test classes
         └── utils               # WaitUtil, ElementActions, etc.
 └── test
     └── resources               # testng.xml, config.properties
```

---

## 🛠️ Coming Soon

* ✅ ExtentReports Integration
* ✅ Retry Analyzer for flaky test handling
* ✅ EnvironmentManager for test data profiles
* ✅ Cucumber support


---

## 🙋‍♂️ About Me

I’m an SDET with 10 years of QA experience, currently preparing for my next role.
Check out my [LinkedIn](https://www.linkedin.com/in/kumarabhimanyu941) to connect or collaborate!

---

## 📬 Feedback & Contributions

Feel free to fork, raise issues, or suggest improvements.
Let’s build clean, scalable, test automation frameworks together! 💻
