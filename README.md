# 🧩 OOPS Banner Application

## 📌 Project Overview

The **OOPS Banner Application** is a progressive **Java console-based project** designed to demonstrate **Object-Oriented Programming (OOP)** principles, clean coding practices, and **incremental refactoring**.

The project begins with a simple console output (**UC1**) and evolves step by step into a **scalable, modular banner rendering engine** (**UC8**). Along the way, it incorporates advanced Java concepts such as **arrays, methods, collections, HashMap, StringBuilder**, and core **OOPS design principles**.

---

## 🎯 Objectives

- Print the word **“OOPS”** in a banner format using ASCII art
- Improve the solution incrementally through multiple use cases
- Demonstrate **refactoring, modularity, reusability**, and **clean architecture**
- Apply real-world **OOPS concepts** in a structured and practical manner

---

## 🛠️ Technologies Used

### 🔹 Language
- Java

### 🔹 Core Concepts
- Object-Oriented Programming (OOP)
- Arrays and Loops
- String Handling
- Java Collections Framework
- HashMap
- StringBuilder

### 🔹 Tools
- Git
- Git Flow
- GitHub

---

## 📂 Project Structure

```plaintext
OOPS-Banner-App/
│
├── src/
│   └── main/
│       └── OOPSBannerApp/
│           └── OOPSBannerApp.java
│
├── README.md
└── .gitignore

```

🚀 Use Case Breakdown
✅ UC1: Print Simple OOPS

Prints "OOPS" as plain text

Focus: Basic Java syntax

---

✅ UC2: Banner Using Print Statements

ASCII art using System.out.println()

Uses * and spaces

Drawback: Hardcoded and repetitive

---

✅ UC3: Banner Using String.join()

Replaces + operator with String.join()

Improves readability and memory efficiency

---

✅ UC4: Banner Using String Array & Loop

Stores banner lines in a String[]

Uses loops for rendering

Improves modularity

---

✅ UC5: Inline Array Initialization

Combines declaration and initialization

Uses String.join() inline

Reduces verbosity

---

✅ UC6: Refactor Banner Logic into Methods

Separate methods for characters O, P, and S

Applies DRY Principle

Improves reusability and maintainability

---

✅ UC7: Store Character Pattern in a Class

Introduces CharacterPatternMap class

Encapsulates character → pattern mapping

Demonstrates strong OOPS principles

---

✅ UC8: Use HashMap for Character Patterns

Uses HashMap<Character, String[]>

Enables O(1) pattern lookup

Uses StringBuilder and nested loops

Results in a fully scalable banner engine

---

🧠 OOPS Concepts Demonstrated

Encapsulation

Abstraction

Modularity

Reusability

Single Responsibility Principle (SRP)

Separation of Concerns

---

📈 Learning Outcomes

Incremental refactoring approach

Clean and maintainable code design

Real-world usage of Java Collections

Interview-ready Java OOPS project

---

✅ Conclusion

This project demonstrates how a simple requirement can be evolved into a clean, extensible, and scalable solution using Object-Oriented Design principles and best coding practices.

It serves as a strong foundation for understanding real-world Java application design and is ideal for learning, revision, and interview preparation.