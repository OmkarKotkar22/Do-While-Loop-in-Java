# 🔄 Java Projects: Practical Applications of the Do-While Loop

This repository is a collection of practical Java programs specifically designed to demonstrate the effective use of the **Do-While Loop**.

The `do-while` loop is crucial for scenarios where the code block **must execute at least once** before the termination condition is checked. This is ideal for menus, validation, and simulations.

---

📋 Table of Contents

* [🎯 Simulation & System Programs](#🎯-simulation--system-programs)
* [✅ Validation & Checking Programs](#✅-validation--checking-programs)
* [🛠️ Utility Programs](#🛠️-utility-programs)
* [💻 Getting Started](#💻-getting-started)

---

## 🎯 Simulation & System Programs

These files model real-world systems and user interactions, where the initial execution or a continuous loop based on user input is essential.

| File Name | Description |
| :--- | :--- |
| `E_commerce_Checkout_Simulation_dowhile.java` | Simulates an e-commerce checkout process, likely prompting the user for confirmation after showing the total. |
| `Restaurant_Ordering_System_dowhile.java` | Manages a restaurant order, ensuring the ordering menu is displayed at least once, and repeats until the user chooses to finalize the order. |
| `Train_Ticket_Booking_dowhile.java` | Simulates a basic train ticket booking interface, potentially repeating the booking process or passenger entry. |
| `bank_balance_do_while.java` | Simulates basic banking operations (like viewing balance or withdrawing), ensuring a transaction option is presented at least once. |
| `Menu_Driven_Calculator_dowhile.java` | Presents a calculator menu, executing the operation once and repeating the menu until the exit option is chosen. |

---

## ✅ Validation & Checking Programs

The `do-while` loop is perfect for enforcing input constraints, forcing the user to re-enter data until it meets validation criteria.

| File Name | Description |
| :--- | :--- |
| `Email_Address_Validator_dowhile.java` | Validates an entered email address, forcing re-entry if the format is incorrect. |
| `Password_Strength_Checker_dowhile.java` | Checks a password against strength rules (length, characters), prompting the user to set a new one if it fails the check. |
| `atm_pin_validation_dowhile.java` | Validates an ATM PIN, typically allowing a set number of retry attempts or looping until the correct PIN is entered. |
| `Student_Marks_Entry_dowhile.java` | Ensures that entered student marks are within a valid range (e.g., 0-100), prompting re-entry upon invalid input. |
| `Student_Marks_Entry_dowhiletest.java` | Likely a test or alternate version of the student marks entry program. |
| `Student_marks_Entry_dowhile.java` | Another file related to student mark entry validation. |

---

## 🛠️ Utility Programs

These files demonstrate simple loop mechanics for common programming tasks.

| File Name | Description |
| :--- | :--- |
| `Number_Guessing_Game_dowhile.java` | A classic game where the user guesses a secret number, the loop continues until the correct number is found. |
| `Temperature_Logger_dowhile.java` | Logs temperature readings, perhaps prompting the user for input repeatedly until a specific stop condition is met. |
| `Single_Character_do_while.java` | Simple program to process a single character input, potentially repeating the process or validating the character. |
| `Single_Number_do_while.java` | Simple program to process a single number input, possibly used for basic validation or repeated input. |

---

## 💻 Getting Started

### Prerequisites

* **Java Development Kit (JDK 8+)**: Ensure you have a recent version of the JDK installed.

### Running the Code

1.  **Clone this repository:**
    ```bash
    git clone [Your Repository URL]
    ```

2.  **Navigate to the directory:**
    ```bash
    cd [repository-name]
    ```

3.  **Compile any Java source file** (e.g., for `atm_pin_validation_dowhile.java`):
    ```bash
    javac atm_pin_validation_dowhile.java
    ```

4.  **Execute the compiled class:**
    ```bash
    java atm_pin_validation_dowhile
    ```
