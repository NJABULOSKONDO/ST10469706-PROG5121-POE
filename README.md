# 📘 ST10469706-PROG5121-POE Part 3

![Java CI](https://github.com/NJABULOSKONDO/ST10469706-PROG5121-POE/actions/workflows/TestJava.yml/badge.svg)

**Developer:** Njabulo Skondo  
**Course:** Bachelor of IT in Business Systems  
**Institution:** Rosebank College  
**Semester:** 2025 Second Semester  

---

## 🧠 Project Overview
This Java-based messaging system simulates **user registration, message handling, and reporting**.  
It demonstrates:
- String manipulation  
- Array operations  
- Unit testing with JUnit  
- JSON integration with Gson  
- CI/CD automation via GitHub Actions  

The application supports message categorization, search, deletion, and automated reporting — all verified through **Maven Daemon** and continuous integration.

---

## 🧩 Key Features
- ✅ **User Registration Validation**  
  - Username, password, and phone number format checks  
- ✅ **Message Categorization**  
  - Sent, Stored, Disregarded messages managed in parallel arrays  
- ✅ **Message Operations**  
  - Search by message ID  
  - Search by recipient  
  - Delete by message hash  
  - Display longest message  
  - Generate full message report  
- ✅ **JSON Integration**  
  - Stored messages loaded from JSON using Gson  
- ✅ **Unit Testing**  
  - 19 JUnit tests covering all core features  
- ✅ **CI/CD Automation**  
  - GitHub Actions workflow runs tests on every push  

---

## 🧪 Test Data
| Recipient     | Message                                                        | Flag      |
|---------------|----------------------------------------------------------------|-----------|
| +27834557896  | "Did you get the cake?"                                        | Sent      |
| +27838884567  | "Where are you? You are late! I have asked you to be on time." | Stored    |
| +27834484567  | "Yohoooo, I am at your gate."                                  | Disregard |
| 0838884567    | "It is dinner time!"                                           | Sent      |
| +27838884567  | "Ok, I am leaving without you."                                | Stored    |

---

## 🛠 Technologies
- Java 17  
- Maven Daemon (mvnd)  
- JUnit 5  
- Git & GitHub  
- GitHub Actions  
- Gson (JSON parsing)  

---

## 🚀 Running Locally
1. Clone the repo:
   ```bash
   git clone https://github.com/NJABULOSKONDO/ST10469706-PROG5121-POE.git
