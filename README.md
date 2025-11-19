# ST10469706-PROG5121-POE – Registration & Messaging System

## 👨‍💻 Author
**Njabulo Skondo**  
Rosebank College – PROG5121 Module  
GitHub: https://github.com/NJABULOSKONDO/ST10469706-PROG5121-POE/tree/KhanbanTasks

---

## Project Overview
This Java-based console application simulates a basic chat system with user registration, login, and message delivery features. It was built as part of the PROG5121 PoE to demonstrate clean, testable, and scalable code using object-oriented programming principles.

The project was expanded in **Part 2** to include message hashing, JSON-based storage using Gson, and a console-based menu loop for sending, storing, and printing messages.

---

## Features

### Registration & Login (Part 1)
- **Username validation**: Must contain an underscore and be ≤ 5 characters.
- **Password complexity**: Requires 8+ characters, a capital letter, a number, and a special character.
- **Phone number validation**: Must include international code (`+27`) and be exactly 12 characters.
- **Login simulation**: Verifies credentials and returns a personalized welcome message.

### Message Payload (Part 1)
- Stores message content and recipient phone number.
- Tracks delivery status: `isSent`, `isReceived`, `isRead`.
- Includes methods to update status and generate a message report.

### MessageStatus & Console Menu (Part 2)
- **Message ID generation**: Each message gets a unique 10-digit ID.
- **Hashing**: Messages are hashed using a custom format for tracking.
- **Storage**: Messages can be stored in a JSON file using Gson.
- **Console Menu**: Users can send, store, print, and count messages via a looped menu.
- **Validation**: Recipient numbers are validated to start with `+` and be ≤ 10 characters.

---

## Class Structure

| Class            | Purpose |
|------------------|---------|
| `User`           | Stores user credentials and phone number |
| `UserService`    | Validates input and handles registration logic |
| `Message`        | Represents a chat message with status flags (Part 1) |
| `MessageStatus`  | Handles message ID generation, hashing, storing, and tracking (Part 2) |
| `Main`           | Simulates user interaction and manual testing |
| `MainLoop`       | Console-based menu loop for sending, storing, and printing messages (Part 2) |

---

## JUnit Testing

Unit tests were written for key methods in `MessageStatus`:

- `checkMessageID()`
- `checkRecipientCell()`
- `createMessageHash()`

## Tests are located in:
src/test/java/com/mycompany/st10469706/MessageStatusTest.java

## References
Microsoft. (2025). Copilot. Microsoft Corporation. Available at: https://copilot.microsoft.com/ [Accessed 19 Sep. 2025].

## AI Integration
AI tools were used ethically to:
- Generate regex for phone number validation
- Structure clean, maintainable classes
- Guide Git workflow and testing strategy
- Troubleshoot Maven, Gson, and NetBeans integration



- GitHub Actions setup guided by:  
  [Automated Testing with GitHub Actions – YouTube](https://www.youtube.com/watch?v=b3clRsVPLR4&t=2282s)

   ```bash
   git clone https://github.com/NJABULOSKONDO/ST10469706-PROG5121-POE.git
