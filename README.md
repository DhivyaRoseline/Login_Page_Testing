#  Login Page Test Automation (Java + Selenium)

This project focuses on automating the login functionality of a sample web application using **Java** and **Selenium WebDriver**.  
I used this project to practice both **positive (valid login)** and **negative (invalid login)** scenarios, and understand how websites handle form validation and error messages.



##  Test Website

- [Practice Test Automation – Login Page](https://practicetestautomation.com/practice-test-login/)



##  What the Script Covers

- Launches Chrome browser and opens the test login page
- Enters valid credentials and verifies successful login
- Enters invalid username/password combinations and verifies error messages
- Uses `if-else` conditions to check the result and print the outcome in console
- Closes the browser after test execution



##  Tools & Technologies Used

- **Language:** Java  
- **Automation Tool:** Selenium WebDriver  
- **IDE:** Eclipse  
- **Driver:** ChromeDriver  
- **Testing Type:** Functional Testing (Positive and Negative scenarios)

---

##  Folder Structure
Login-Test/
├── LoginTest.java # Selenium script with multiple test flows
├── Screenshots
└── README.md # You're reading it now!
##  What I Practiced in This Project

- Writing test cases for valid and invalid inputs
- Understanding conditional validations in automation
- Using `getPageSource().contains()` to validate outcomes
- Practicing simple debugging and console-based result tracking



##  Sample Console Output

 Login Test Passed: Successful login
 Login Test Failed: Invalid credentials
