// Instance Methods Practice - Complete the method implementations

import java.util.ArrayList;

// Exercise 1: Calculator with instance methods
class Calculator {
    double result;
    
    public Calculator() {
        result = 0.0;
    }
    
    public void add(double value) {
        result += value;
    }
    
    public void subtract(double value) {
        result -= value;
    }
    
    public void multiply(double value) {
        result *= value;
    }
    
    public void divide(double value) {
        if (value == 0) {
            System.out.println("Can't divide by 0");
            return;
        }
        result /= value;
    }
    
    public double getResult() {
        return result;
    }
    
    public void clear() {
        result = 0.0;
    }
}

// Exercise 2: Text processing with instance methods
class TextProcessor {
    String text;
    
    public TextProcessor(String initialText) {
        this.text = initialText;
    }
    
    public void setText(String newText) {
        text = newText;
    }
    
    public String getText() {
        return text;
    }
    
    public int getLength() {
        return text.length();
    }
    
    public String toUpperCase() {
        return text.toUpperCase();
    }
    
    public String toLowerCase() {
        return text.toLowerCase();
    }
    
    public String reverse() {
        return new StringBuilder(text).reverse().toString();
    }
    
    public boolean contains(String substring) {
        if (text.contains(substring)) {
        return true;
        }
        return false;
    }
    
    public int getWordCount() {
        if (text == null || text.trim().isEmpty()) return 0;
        return text.trim().split("\\s+").length;
    }
}

// Exercise 3: Counter with state management
class Counter {
    int count;
    int step;
    
    public Counter(int initialCount, int stepValue) {
        this.count = initialCount;
        this.step = stepValue;
    }
    
    public void increment() {
        count += step;
    }
    
    public void decrement() {
        count -= step;
    }
    
    public void reset() {
        count = 0; 
    }
    
    public int getCount() {
        return count;
    }
    
    public void setStep(int newStep) {
        step = newStep;
    }
    
    public int getStep() {
        return step;
    }
    
    public boolean isPositive() {
        if (count > 0) {
            return true;
        }
        return false;
    }
    
    public boolean isNegative() {
        if (count < 0) {
            return true;
        }
        return false;
    }
}

// Exercise 4: Temperature conversion and validation
class Temperature {
    double celsius;
    
    public Temperature(double temp, String unit) {
        if (unit.equalsIgnoreCase("C")) {
            celsius = temp;
        } else if (unit.equalsIgnoreCase("F")) {
            celsius = (temp - 32) * 5.0 / 9.0;
        } else if (unit.equalsIgnoreCase("K")) {
            celsius = temp - 273.15;
        } else {
            celsius = 0.0;
        }
    }
    
    public double getCelsius() {
        return celsius;
    }
    
    public double getFahrenheit() {
        return celsius * 9.0 / 5.0 + 32.0;
    }
    
    public double getKelvin() {
        return celsius + 273.15;
    }
    
    public void setCelsius(double temp) {
        celsius = temp;
    }
    
    public void setFahrenheit(double temp) {
        celsius = (temp - 32) * 5.0 / 9.0;
    }
    
    public void setKelvin(double temp) {
        celsius = temp - 273.15;
    }
    
    public boolean isFreezingWater() {
        if (celsius <= 0.0) {
            return true;
        }
        return false;
    }
    
    public boolean isBoilingWater() {
        if (celsius >= 100.0) {
            return true;
        }
        return false;
    }
    
    public String getTemperatureCategory() {
        if (celsius <= 0.0) {
            return "Cold";
        } else if (celsius > 0 && celsius <= 20) {
            return "Mild";
        } else if (celsius > 20 && celsius < 35) {
            return "Hot";
        } else if (celsius >= 35) {
            return "Extreme";
        } else {
            return "";
        }   
    }
}

// Exercise 5: Shopping cart with item management
class ShoppingCart {
    ArrayList<String> items;
    ArrayList<Double> prices;
    
    public ShoppingCart() {
        items = new ArrayList<>();
        prices = new ArrayList<>();
    }
    
    public void addItem(String item, double price) {
        items.add(item);
        prices.add(price);
        
    }
    
    public void removeItem(String item) {
        int index = items.indexOf(item);
        if (index != -1) {
            items.remove(index);
            prices.remove(index);
        }
    }
    
    public int getItemCount() {
        return items.size();
    }
    
    public double calculateTotal() {
        double sum =0.0;
        for (double price : prices) {
            sum += price;
        }
        return sum;
    }
    
    public double calculateAverage() {
        return prices.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
    }
    
    public String getMostExpensive() {
        if (items.isEmpty()) return "";
        double maxPrice = prices.get(0);
        int maxIndex = 0;
        for (int i = 1; i < prices.size(); i++) {
            if (prices.get(i) > maxPrice) {
                maxPrice = prices.get(i);
                maxIndex = i;
            }
        }
        return items.get(maxIndex);
    }
    
    public String getCheapest() {
        if (items.isEmpty()) return "";
        double minPrice = prices.get(0);
        int minIndex = 0;
        for (int i = 1; i < prices.size(); i++) {
            if (prices.get(i) < minPrice) {
                minPrice = prices.get(i);
                minIndex = i;
            }
        }
        return items.get(minIndex);
    }
    
    public boolean containsItem(String item) {
        return items.contains(item);
        
    }
    
    public void clear() {
       items.clear();
       prices.clear();
    }
}

// Exercise 6: Bank account with transaction management
class BankAccount {
    String accountNumber;
    double balance;
    ArrayList<String> transactionHistory;
    
    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
        this.transactionHistory = ArrayList<>();
    }
    
    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount; 
            transactionHistory.add(String.format("Deposited $%.2f", amount));
            return true;
        }
        return false;
    }
    
    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            transactionHistory.add(String.format("Withdrawal Failed $%.2f", amount));
            balance -= amount;  // Modify instance field
        }
        return false;
    }
    
    public boolean transfer(BankAccount toAccount, double amount) {
        // TODO: Transfer money to another account
        // Should withdraw from this account and deposit to other account
        // Add transaction to history for both accounts
        // Return true if successful
        return false;
    }
    
    public double getBalance() {
        // TODO: Return current balance
        return 0.0;
    }
    
    public String getAccountNumber() {
        // TODO: Return account number
        return "";
    }
    
    public ArrayList<String> getTransactionHistory() {
        // TODO: Return copy of transaction history
        return new ArrayList<>();
    }
    
    public int getTransactionCount() {
        // TODO: Return number of transactions
        return 0;
    }
    
    public boolean hasInsufficientFunds(double amount) {
        // TODO: Check if withdrawal would overdraft
        return false;
    }
    
    public double calculateInterest(double rate) {
        // TODO: Return interest amount for given rate
        // Interest = balance * rate
        return 0.0;
    }
}

// Exercise 7: Student grade book
class StudentGradeBook {
    String studentName;
    ArrayList<Double> grades;
    
    public StudentGradeBook(String name) {
        // TODO: Set student name and initialize empty grades list
    }
    
    public boolean addGrade(double grade) {
        // TODO: Add grade (validate 0-100 range)
        // Return true if valid and added
        return false;
    }
    
    public boolean removeLowestGrade() {
        // TODO: Remove the lowest grade
        // Return true if grade was removed
        return false;
    }
    
    public int getGradeCount() {
        // TODO: Return number of grades
        return 0;
    }
    
    public double calculateAverage() {
        // TODO: Return average of all grades
        return 0.0;
    }
    
    public double getHighestGrade() {
        // TODO: Return highest grade
        return 0.0;
    }
    
    public double getLowestGrade() {
        // TODO: Return lowest grade
        return 0.0;
    }
    
    public String getLetterGrade() {
        // TODO: Return letter grade based on average
        // A: 90-100, B: 80-89, C: 70-79, D: 60-69, F: below 60
        return "";
    }
    
    public boolean isPassingGrade() {
        // TODO: Return true if average >= 60
        return false;
    }
    
    public String getGradesSummary() {
        // TODO: Return string with key statistics
        // Format: "Student: [name], Grades: [count], Average: [avg], Letter: [letter]"
        return "";
    }
    
    public boolean hasGradeAbove(double threshold) {
        // TODO: Check if any grade exceeds threshold
        return false;
    }
}

// Test your implementations below:

// Test Calculator
System.out.println("=== Testing Calculator ===");
Calculator calc = new Calculator();
System.out.println("Initial result: " + calc.getResult()); // Should be 0.0

calc.add(10);
System.out.println("After adding 10: " + calc.getResult()); // Should be 10.0

calc.multiply(2);
System.out.println("After multiplying by 2: " + calc.getResult()); // Should be 20.0

calc.subtract(5);
System.out.println("After subtracting 5: " + calc.getResult()); // Should be 15.0

calc.divide(3);
System.out.println("After dividing by 3: " + calc.getResult()); // Should be 5.0

calc.clear();
System.out.println("After clear: " + calc.getResult()); // Should be 0.0

// Test TextProcessor
System.out.println("\n=== Testing TextProcessor ===");
TextProcessor processor = new TextProcessor("Hello World");
System.out.println("Original text: " + processor.getText()); // "Hello World"
System.out.println("Length: " + processor.getLength()); // 11
System.out.println("Uppercase: " + processor.toUpperCase()); // "HELLO WORLD"
System.out.println("Lowercase: " + processor.toLowerCase()); // "hello world"
System.out.println("Reversed: " + processor.reverse()); // "dlroW olleH"
System.out.println("Contains 'World': " + processor.contains("World")); // true
System.out.println("Word count: " + processor.getWordCount()); // 2

// Test Counter
System.out.println("\n=== Testing Counter ===");
Counter counter = new Counter(5, 2);
System.out.println("Initial count: " + counter.getCount()); // 5
System.out.println("Step: " + counter.getStep()); // 2
System.out.println("Is positive: " + counter.isPositive()); // true

counter.increment();
System.out.println("After increment: " + counter.getCount()); // 7

counter.decrement();
counter.decrement();
counter.decrement();
counter.decrement();
System.out.println("After decrements: " + counter.getCount()); // -1
System.out.println("Is negative: " + counter.isNegative()); // true

counter.reset();
System.out.println("After reset: " + counter.getCount()); // 0

// Test Temperature
System.out.println("\n=== Testing Temperature ===");
Temperature temp = new Temperature(32, "F");
System.out.println("32°F in Celsius: " + temp.getCelsius()); // 0.0
System.out.println("In Kelvin: " + temp.getKelvin()); // 273.15
System.out.println("Is freezing water: " + temp.isFreezingWater()); // true
System.out.println("Category: " + temp.getTemperatureCategory()); // "Mild"

temp.setCelsius(25);
System.out.println("After setting to 25°C: " + temp.getFahrenheit()); // 77.0
System.out.println("Is boiling water: " + temp.isBoilingWater()); // false

// Test ShoppingCart
System.out.println("\n=== Testing ShoppingCart ===");
ShoppingCart cart = new ShoppingCart();
cart.addItem("Apple", 1.50);
cart.addItem("Banana", 0.75);
cart.addItem("Orange", 2.00);

System.out.println("Item count: " + cart.getItemCount()); // 3
System.out.println("Total: $" + cart.calculateTotal()); // 4.25
System.out.println("Average: $" + cart.calculateAverage()); // 1.42 (approximately)
System.out.println("Most expensive: " + cart.getMostExpensive()); // "Orange"
System.out.println("Cheapest: " + cart.getCheapest()); // "Banana"
System.out.println("Contains Apple: " + cart.containsItem("Apple")); // true

cart.removeItem("Banana");
System.out.println("After removing Banana, count: " + cart.getItemCount()); // 2

// Test BankAccount
System.out.println("\n=== Testing BankAccount ===");
BankAccount account1 = new BankAccount("123-456");
BankAccount account2 = new BankAccount("789-012");

System.out.println("Account 1 number: " + account1.getAccountNumber()); // "123-456"
System.out.println("Initial balance: $" + account1.getBalance()); // 0.0

account1.deposit(100.0);
System.out.println("After deposit: $" + account1.getBalance()); // 100.0

boolean withdrawn = account1.withdraw(30.0);
System.out.println("Withdrawal successful: " + withdrawn); // true
System.out.println("Balance after withdrawal: $" + account1.getBalance()); // 70.0

boolean transferred = account1.transfer(account2, 20.0);
System.out.println("Transfer successful: " + transferred); // true
System.out.println("Account 1 balance: $" + account1.getBalance()); // 50.0
System.out.println("Account 2 balance: $" + account2.getBalance()); // 20.0

System.out.println("Transaction count: " + account1.getTransactionCount()); // 3
System.out.println("Interest on $50 at 5%: $" + account1.calculateInterest(0.05)); // 2.5

// Test StudentGradeBook
System.out.println("\n=== Testing StudentGradeBook ===");
StudentGradeBook gradebook = new StudentGradeBook("Alice Johnson");

gradebook.addGrade(85.0);
gradebook.addGrade(92.0);
gradebook.addGrade(78.0);
gradebook.addGrade(96.0);

System.out.println("Grade count: " + gradebook.getGradeCount()); // 4
System.out.println("Average: " + gradebook.calculateAverage()); // 87.75
System.out.println("Highest: " + gradebook.getHighestGrade()); // 96.0
System.out.println("Lowest: " + gradebook.getLowestGrade()); // 78.0
System.out.println("Letter grade: " + gradebook.getLetterGrade()); // "B"
System.out.println("Is passing: " + gradebook.isPassingGrade()); // true
System.out.println("Has grade above 90: " + gradebook.hasGradeAbove(90.0)); // true

System.out.println("Summary: " + gradebook.getGradesSummary());

gradebook.removeLowestGrade();
System.out.println("After removing lowest, average: " + gradebook.calculateAverage()); // 91.0

System.out.println("\n=== All Tests Complete! ===");
