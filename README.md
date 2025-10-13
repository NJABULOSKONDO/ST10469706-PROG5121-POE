# ST10469706-PROG5121-POE – Registration & Messaging System

## 👨‍💻 Author
**Njabulo Skondo**  
Rosebank College – PROG5121 Module  
GitHub: https://github.com/NJABULOSKONDO/ST10469706-PROG5121-POE/tree/KhanbanTasks

---

## 📌 Project Overview
This Java-based application simulates a basic chat system with user registration, login, and message delivery features. It was built as part of the PRLD5121 PoE to demonstrate clean, testable, and scalable code using object-oriented programming principles.

---

## ✅ Features

### 🔐 Registration & Login
- **Username validation**: Must contain an underscore and be ≤ 5 characters.
- **Password complexity**: Requires 8+ characters, a capital letter, a number, and a special character.
- **Phone number validation**: Must include international code (`+27`) and be exactly 12 characters.
- **Login simulation**: Verifies credentials and returns personalized welcome message.

### 💬 Message Payload
- Stores message content and recipient phone number.
- Tracks delivery status: `isSent`, `isReceived`, `isRead`.
- Includes methods to update status and generate a message report.

### 🧪 Manual Testing
- All features tested via `Main.java` using sample inputs.
- JUnit setup attempted; manual validation used due to environment constraints.

### 🧠 AI Integration
- AI tools were used ethically to:
  - Generate regex for phone number validation.
  - Structure clean, maintainable classes.
  - Guide Git workflow and testing strategy.

---

## 🧱 Class Structure

| Class         | Purpose |
|---------------|--------|
| `User`        | Stores user credentials and phone number |
| `UserService` | Validates input and handles registration logic |
| `Message`     | Represents a chat message with status flags |
| `Main`        | Simulates user interaction and manual testing |

---

## 📚 References

Microsoft. (2025). *Copilot*. Microsoft Corporation. Available at: https://copilot.microsoft.com/ [Accessed 19 Sep. 2025].

- GitHub Actions setup guided by:  
  [Automated Testing with GitHub Actions – YouTube](https://www.youtube.com/watch?v=b3clRsVPLR4&t=2282s)

   ```bash
   git clone https://github.com/NJABULOSKONDO/ST10469706-PROG5121-POE.git
