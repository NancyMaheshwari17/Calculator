# 🧮 Java Text-Based Calculator

This is a simple text-based calculator written in Java using the `Scanner` class. It performs basic arithmetic operations based on user input: addition, subtraction, multiplication, division, and modulus.

## ✨ Features

- User-friendly console interface
- Supports the following operations (by name):
  - Add
  - Subtract
  - Multiply
  - Divide
  - Modules (modulus)
- Takes two floating-point numbers as input
- Uses `switch-case` on **operation name strings**

## 🗂️ Files

- `calculator.java` – Main Java source file for the calculator.

## 🖥️ How to Run

1. **Open terminal** and navigate to the directory where `calculator.java` is saved.

2. **Compile the Java code:**
   ```bash
   javac calculator.java
   ```

3. **Run the compiled program:**
   ```bash
   java calculator
   ```

4. **Example Run:**
   ```
   CALCULATOR!!

   Operations:
   1.Add
   2.Subtract
   3.Multiply
   4.Divide!
   5.Modules

   Enter any Operation name: Add
   Enter Number 1: 5
   Enter Number 2: 7
   12.0
   ```

## ❗ Important Notes

- Make sure to type the operation names **exactly** as shown: `Add`, `Subtract`, `Multiply`, `Divide`, or `Modules`.
- Currently, there is **no input validation**. Any wrong operation name will result in no output.
- There is a **bug** in the `Subtract` case: it adds instead of subtracting. You can fix it by changing:
  ```java
  float Subtract = num1 - num2;
  ```

## 📚 Requirements

- Java Development Kit (JDK)
- Basic terminal/command line usage

---

🛠️ **Created for learning and practice.**
