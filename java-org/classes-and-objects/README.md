# Classes and Objects Exercises

This directory contains exercises to help you practice creating and working with classes and objects in Java using jshell.

## Setup
1. Open your terminal/command prompt
2. Navigate to this directory
3. Start jshell: `jshell`
4. Load the exercise file: `/open topic.jsh`

## Exercises

### Exercise 1: Basic Class Creation
Create a class `Person` with two fields: `String name` and `int age`.
Write a constructor that takes name and age as parameters.
Add a method `introduce()` that returns a String like "Hello, I'm John and I'm 25 years old."

### Exercise 2: Class with Methods
Create a class `BankAccount` with fields: `String accountNumber` and `double balance`.
Add a constructor that sets the account number and starts with a balance of 0.0.
Add methods:
- `deposit(double amount)` - adds money to the balance
- `withdraw(double amount)` - removes money (if sufficient funds exist)
- `getBalance()` - returns current balance
- `getAccountInfo()` - returns account details as a string

### Exercise 3: Object Creation and Usage
Write methods that demonstrate object creation:
- `createPerson(String name, int age)` - creates and returns a Person object
- `createBankAccount(String accountNumber)` - creates and returns a BankAccount object
- `demonstratePersonUsage()` - creates a Person, calls introduce(), and prints the result

### Exercise 4: Working with Multiple Objects
Create a class `Car` with fields: `String brand`, `String model`, and `int year`.
Add appropriate constructor and methods:
- `getCarInfo()` - returns formatted car information
- `isClassic()` - returns true if car is more than 25 years old
Write a method `compareCars(Car car1, Car car2)` that compares two cars and returns which is older.

### Exercise 5: Object State and Behavior
Create a class `Counter` with:
- `int count` field (starts at 0)
- `increment()` method - increases count by 1
- `decrement()` method - decreases count by 1
- `reset()` method - sets count back to 0
- `getCount()` method - returns current count value

### Exercise 6: Class with Validation
Create a class `Student` with fields: `String name`, `int grade`, and `double gpa`.
Add constructor with validation:
- Name cannot be null or empty
- Grade must be between 1 and 12
- GPA must be between 0.0 and 4.0
Add methods:
- `isHonorStudent()` - returns true if GPA >= 3.5
- `getStudentInfo()` - returns formatted student information

### Exercise 7: Object Interaction
Create a class `Book` with: `String title`, `String author`, and `boolean isCheckedOut`.
Create a class `Library` with an ArrayList<Book> to store books.
Add methods to Library:
- `addBook(Book book)` - adds a book to the collection
- `checkOutBook(String title)` - marks book as checked out if available
- `returnBook(String title)` - marks book as available
- `getAvailableBooks()` - returns count of available books

## Testing Your Code
After completing each exercise, test your classes and methods:

```java
// Example tests
Person Person = createPerson("Alice", 30);
    return (person.introduce());

BankAccount account = createBankAccount("123456");
account.deposit(100.0);
account.withdraw(30.0);
System.out.println("Balance: " + account.getBalance()); // Should be 70.0

Car car1 = new Car("Toyota", "Camry", 1995);
Car car2 = new Car("Honda", "Civic", 2020);
System.out.println(car1.isClassic()); // Should be true

Counter counter = new Counter();
counter.increment();
counter.increment();
System.out.println(counter.getCount()); // Should be 2
```

## Tips
- Read the NOTES.md file first to understand classes and objects
- Remember that classes are blueprints, objects are instances
- Use meaningful names for classes (PascalCase) and methods (camelCase)
- Always validate input in constructors and methods
- Test your objects by creating instances and calling methods
- Think about what data (fields) and behavior (methods) each class should have
