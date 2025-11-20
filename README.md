## 📘 # ST10469706-PROG5121-POE Part 3

![Java CI](https://github.com/NJABULOSKONDO/ST10469706-PROG5121-POE/actions/workflows/TestJava.yml/badge.svg)
 
**Developer:** Njabulo Skondo  
**Course:** Bachelor of IT in Business Systems  
**Institution:** Rosebank College  
**Semester:** 2025 Second Semester  

---

### 🧠 Project Overview  
This Java-based messaging system simulates user registration, message handling, and reporting. It demonstrates string manipulation, array operations, and unit testing using JUnit. The application supports message categorization, search, deletion, and automated reporting — all verified through GitHub Actions and Maven Daemon.

---

### 🧩 Key Features  
- ✅ **User Registration Validation**  
  - Username, password, and phone number format checks  
- ✅ **Message Categorization**  
  - Sent, Stored, Disregarded messages stored in parallel arrays  
- ✅ **Message Operations**  
  - Search by message ID  
  - Search by recipient  
  - Delete by message hash  
  - Display longest message  
  - Generate full message report  
- ✅ **JSON Integration**  
  - Stored messages loaded from JSON using Gson  
- ✅ **Unit Testing**  
  - 17 JUnit tests covering all core features  
- ✅ **CI/CD Automation**  
  - GitHub Actions workflow runs tests on every push  

---

### 🧪 Test Data Used  
| Recipient | Message | Flag |
|-----------|---------|------|
| +27834557896 | "Did you get the cake?" | Sent |
| +27838884567 | "Where are you? You are late! I have asked you to be on time." | Stored |
| +27834484567 | "Yohoooo, I am at your gate." | Disregard |
| 0838884567 | "It is dinner time!" | Sent |
| +27838884567 | "Ok, I am leaving without you." | Stored |

---

### 🛠 Technologies Used  
- Java 17  
- Maven Daemon (mvnd)  
- JUnit 5  
- Git & GitHub  
- GitHub Actions  
- Gson (for JSON parsing)

---

### 🚀 How to Run Locally  
1. Clone the repo:  
   ```bash
   git clone https://github.com/NJABULOSKONDO/ST10469706-PROG5121-POE.git
   ```
2. Navigate to project folder  
3. Run tests using Maven Daemon:  
   ```bash
   mvnd clean test
   ```
---

### 🧾 Reflection  
This project challenged me to integrate validation logic, parallel arrays, and search algorithms while maintaining clean code and test coverage. I resolved merge conflicts, automated test runs, and verified behavior using both GitHub Actions and Maven Daemon. The experience sharpened my skills in systems analysis, CI/CD, and professional documentation.
---
### ✅ Local Test Verification
All unit tests passed using Maven Daemon on Windows. See screenshot below for confirmation.
