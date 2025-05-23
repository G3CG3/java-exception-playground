# Java Exception Playground 

A modular Java console application designed to demonstrate robust exception handling in real-world scenarios. This project is ideal for learners and developers who want to understand how to write clean, maintainable, and safe Java code using `try-catch`, custom exceptions, input validation, and file I/O.

---

## 📚 Features

- **Division Calculator**: Handles division-by-zero with clear error reporting.
- **File Reader Checker**: Reads text files with graceful failure on missing or unreadable files.
- **Input Validator**: Validates integer input within range and checks for empty input.
- **Expense Limit Checker**: Uses a custom checked exception to flag when expenses exceed a set limit.
- **Central CLI Menu**: Simple, interactive menu system for easy testing and exploration.

---

## 🧩 Tech Stack

- Java 17+
- IntelliJ IDEA (recommended)
- Console-based input/output

---

## 🔧 How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/java-exception-playground.git
   cd java-exception-playground
2. Open in IntelliJ (or your preferred IDE)

3. Run the ExceptionPlaygroundApp class

4. Follow the CLI instructions to explore each module

## Sample Output

>=== Java Exception Playground === <br>
>Division Calculator <br>
>File Reader Checker <br>
>Input Validator <br>
>Expense Limit Checker <br>
>Exit <br>
>Choose an option: 1 <br>
>Enter numerator: 10 <br>
>Enter denominator: 0 <br>
>Error: Cannot divide by zero.

--

>Choose an option: 2 <br>
>Enter file path to read: missingfile.txt <br>
>Error: File not found or unreadable: missingfile.txt

--

>Choose an option: 3 <br>
>Enter an integer between 1 and 5: abc <br>
>Error: Input is not a valid integer: abc

--

>Choose an option: 4 <br>
>Enter your monthly expense limit: 100 <br>
>Enter your current total expenses: 150 <br>
>Error: Expense limit exceeded! Limit: 100.0, Current: 150.0

---

## Concepts Demonstrated

- Try-catch-finally blocks
- Custom exception classes
- Input validation
- File I/O with error handling
- Modularity and clean code structure
- CLI interface design

---

## License
This project is licensed under the MIT License — see the LICENSE file for details.

---

## Extend the Project
Feel free to contribute by adding more exception use cases, refining validations, or integrating logging functionality!