// Classes and Objects Exercises - Complete the classes and methods below
// Save this file and load it in jshell with: /open topic.jsh
import java.util.ArrayList;

// Exercise 1: Basic Class Creation
// Create a Person class with name and age fields
class Person { 
    String name;
    int  age;
    
    public Person(String name, int age) {
        this.name = name; 
        this.age = age;
    }
    
    public String introduce() {
        return "Hello, I'm " + name + " and I'm " + age + " years old.";
    }

}

// Exercise 2: Class with Methods
// Create a BankAccount class with account operations
class BankAccount {
    String accountNumber;
    double balance;
    
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        balance += amount;
    }
    
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("insufficient funds");
        }
    }
    
    public double getBalance() {
        return balance;
    }
    
    public String getAccountInfo() {
        return "Hello, " + accountNumber + " your balance is " + balance + " .";
    }
    
}

// Exercise 3: Object Creation and Usage
// Create and return a Person object
public Person createPerson(String name, int age) {
    return new Person(name ,age);    
}

// Create and return a BankAccount object
public BankAccount createBankAccount(String accountNumber) {
    return new BankAccount(accountNumber,0.0);
    
}

// Demonstrate creating and using a Person object
public void demonstratePersonUsage() {
    Person person = new Person(name, age);
    System.out.println(Person.introduce());
    
}

// Exercise 4: Working with Multiple Objects
// Create a Car class
class Car {
    String brand;
    String model;
    int year;
    
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    
    public String getCarInfo() {
        return " Car brand: " + brand + " , Model: " + model + " ,Year made: " + year + ".";
    }
    
    public boolean isClassic() {
        int currentYear = java.time.Year.now().getValue();
        return (currentYear - year) > 25;
    }    
}

// Compare two cars and return which is older
public Car compareCars(Car car1, Car car2) {
    if (car1.year < car2.year) {
        return car1;
    } else if (car2.year < car1.year) {
        return car2;
    } else {
        return null;
    }
    
}

// Exercise 5: Object State and Behavior
// Create a Counter class that can increment/decrement
class Counter {
    int count;

    public Counter() {
        this.count = 0;
    }
    
    public Counter(int count) {
        this.count = count;
    }
    
    public int increment() {
        count++;
        return count;
    }
    
    public int decrement() {
        count--;
        return count;
    }
    
    public void reset() {
        count = 0;
    }
    
    public int getCount() {
        return count;
    }   
}

// Exercise 6: Class with Validation
// Create a Student class with input validation
class Student {
    String name;
    int grade;
    double gpa;
    
    public Student( String name, int grade, double gpa) {
        this.name = name;
        if (grade >= 1 && grade <= 12) {
            this.grade = grade;
        } else {
            System.out.println("Grade must be between 1 and 12");
            this.grade = 1;
        }
        if (gpa >= 0.0 && gpa <= 4.0) {
            this.gpa = gpa;
        } else {
            System.out.println("GPA must be between 0.0 and 4.0");
            this.gpa = 0.0;
        }
    }
    
    public boolean isHonorStudent() {
        return gpa >= 3.5;
    }
    
    public String getStudentInfo() {
        return "Student record: Name: " + name + " Grade: " + grade + " GPA: " + gpa + ".";
    }
    
}

// Exercise 7: Object Interaction
// Create a Book class
class Book {
    String title;
    String author;
    boolean isCheckedOut;
    
    public Book(String title, String author, boolean isCheckedOut) {
        this.title = title;
        this.author = author;
        this.isCheckedOut = isCheckedOut;
    }
    
    // Add any helpful methods here
    
}

// Create a Library class that manages books
class Library {
    ArrayList<Book> books;
    String title;

    public Library() {
    this.title = "Untitled Library";
    this.books = new ArrayList<>();
}
    
    public Library(String title) {
        this.title = title;
        this.books = new ArrayList<>();
    }
    
    public void addBook(Book book) {
        books.add(book);
    }
    
    public void checkOutBook(String title) {
        for (Book book : books) {
            if (book.title.equals(title) && !book.isCheckedOut) {
                book.isCheckedOut = true;
                break;
            }
        }
    }
    
    public void returnBook(String title) {
        for (Book book : books) {
            if (book.title.equals(title) && book.isCheckedOut) {
                book.isCheckedOut = false;
                break;
            }
        }

    }
    
    public String getAvailableBooks() {
        StringBuilder available = new StringBuilder();
        for (Book book : books) {
            if (!book.isCheckedOut) {
                if (available.length() > 0) {
                    available.append(", ");
                }
                available.append(book.title);
            }
        }
        return available.toString();
    }
    
}

// Test your classes here - uncomment and modify as needed

System.out.println("Testing Person class:");
Person person1 = createPerson("Alice", 30);
Person person2 = new Person("Bob", 25);
System.out.println(person1.introduce());
System.out.println(person2.introduce());

System.out.println("\nTesting BankAccount class:");
BankAccount account = createBankAccount("123456");
System.out.println("Initial: " + account.getAccountInfo());
account.deposit(100.0);
System.out.println("After deposit: Balance = " + account.getBalance());
account.withdraw(30.0);
System.out.println("After withdrawal: Balance = " + account.getBalance());
account.withdraw(100.0); // Should fail - insufficient funds
System.out.println("Final: " + account.getAccountInfo());

System.out.println("\nTesting Car class:");
Car car1 = new Car("Toyota", "Camry", 1995);
Car car2 = new Car("Honda", "Civic", 2020);
System.out.println(car1.getCarInfo());
System.out.println("Is classic: " + car1.isClassic());
System.out.println(car2.getCarInfo());
System.out.println("Is classic: " + car2.isClassic());
Car older = compareCars(car1, car2);
System.out.println("Older car: " + older.getCarInfo());

System.out.println("\nTesting Counter class:");
Counter counter = new Counter();
System.out.println("Initial count: " + counter.getCount());
counter.increment();
counter.increment();
counter.increment();
System.out.println("After 3 increments: " + counter.getCount());
counter.decrement();
System.out.println("After 1 decrement: " + counter.getCount());
counter.reset();
System.out.println("After reset: " + counter.getCount());

System.out.println("\nTesting Student class:");
try {
    Student student1 = new Student("John", 10, 3.8);
    System.out.println(student1.getStudentInfo());
    System.out.println("Is honor student: " + student1.isHonorStudent());
    
    Student student2 = new Student("Jane", 12, 2.5);
    System.out.println(student2.getStudentInfo());
    System.out.println("Is honor student: " + student2.isHonorStudent());
} catch (Exception e) {
    System.out.println("Validation error: " + e.getMessage());
}

System.out.println("\nTesting Library system:");
Library library = new Library();
Book book1 = new Book("1984", "George Orwell", false);
Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", false);

library.addBook(book1);
library.addBook(book2);
System.out.println("Available books: " + library.getAvailableBooks());

library.checkOutBook("1984");
System.out.println("After checking out 1984: " + library.getAvailableBooks());

library.returnBook("1984");
System.out.println("After returning 1984: " + library.getAvailableBooks());

