## 📄 Description – Exercise Statement

### ✅ Exercise 1
This Java exercise introduces the use of the `@Override` annotation in a class hierarchy.

- The base class `Worker` contains attributes for name, surname, and hourly rate, as well as a method `calculateSalary(int hours)`.
- Two subclasses, `RemoteWorker` and `OnsiteWorker`, extend `Worker` and override the `calculateSalary` method.
- `RemoteWorker` adds a constant flat internet fee.
- `OnsiteWorker` adds a static gasoline supplement.
- The `@Override` annotation is used to ensure correct method overriding.
- The `Main` class demonstrates polymorphism and calls to overridden methods.

This exercise focuses on:
- Understanding inheritance and method overriding
- Using the `@Override` annotation properly
- Demonstrating object-oriented design principles

### ✅ Exercise 2
This task introduces the use of the `@Deprecated` annotation and how to suppress related warnings.

- Obsolete methods are added to both `RemoteWorker` and `OnsiteWorker` using the `@Deprecated` annotation.
- A separate class `LegacyUsageDemo` demonstrates how to use these methods.
- The `@SuppressWarnings("deprecation")` annotation is used to silence the warning during method invocation.

This exercise focuses on:
- Using the `@Deprecated` annotation
- Suppressing deprecation warnings in a controlled way
- Highlighting best practices when maintaining legacy code

---

## 💻 Technologies Used

- Java 21
- IntelliJ IDEA (or any Java IDE)
- Git & GitHub (optional, for version control)

---

## 📋 Requirements

- Java SDK 21 or higher
- An IDE like IntelliJ IDEA or Eclipse
- Git installed (optional)

---

## 🛠️ Installation

1. Clone the repository (if available):

   ```bash
   git clone https://github.com/alaw810/1.7-JavaLanguage-Annotations-Level1.git
   ```

2. Open the project in IntelliJ IDEA:

   File → Open → Select the project folder

3. Set the correct Java SDK:

   File → Project Structure → SDKs → Java 21+

---

## ▶️ Execution

1. Run the `Main` class to test salary calculation with overridden methods.
2. Run the `LegacyUsage` class to see how deprecated methods are handled.

The console will display:
- Calculated salaries using overridden methods
- Output from obsolete methods with suppressed warnings

---

## 🌐 Deployment

This is a Java console-based educational exercise and doesn't require production deployment. If desired, you can compile and run it manually:

```bash
javac -d out src/com/alaw810/*.java
java -cp out com.alaw810.Main
java -cp out com.alaw810.LegacyUsage
```

---

## 🤝 Contributions

This is a learning exercise intended for individual academic practice. However, pull requests with enhancements or improvements are welcome!

1. Fork the repo
2. Create a new branch (`git checkout -b feature/your-feature`)
3. Commit and push your changes
4. Open a Pull Request

