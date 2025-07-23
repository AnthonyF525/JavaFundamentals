// Bool and Boolean Exercises - Complete the methods below
// Save this file and load it in jshell with: /open topic.jsh

// Exercise 1: Basic Boolean Methods
// Return true if person is 18 or older
public boolean isAdult(int age) {
    return age >= 18;
}

// Exercise 2: Number Range Checker
// Return true if number is between min and max (inclusive)
public boolean isInRange(int number, int min, int max) {
    return number >= min && number <= max;
    
}

// Exercise 3: String Validation
// Return true if email contains both "@" and "." characters
public boolean isValidEmail(String email) {
    return (email.contains("@") && email.contains("."));
}

// Exercise 4: Even/Odd Checker
// Return true if number is even, false if odd
public boolean isEven(int number) {
    return number % 2 == 0;
    
}

// Exercise 5: Leap Year Calculator
// Return true if year is a leap year
// Leap year: divisible by 4, but not by 100, unless also divisible by 400
public boolean isLeapYear(int year) {
   return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0); 
}

// Exercise 6: Password Strength Validator
// Return true if password is at least 8 chars AND has at least one uppercase
public boolean isStrongPassword(String password) {
    if (password.length() < 8) return false;
    for (char c: password.toCharArray()) {
        if (Character.isUpperCase(c)) {
            return true;
        }
    }
    return false;
}

// Exercise 7: Triangle Validator
// Return true if three sides can form a valid triangle
// Rule: sum of any two sides must be greater than the third side
public boolean isValidTriangle(int a, int b, int c) {
    return (a + b > c) && (a > b + c) && (a + c > b);
    
}

// Exercise 8: Boolean Object Practice
// Return true if both Boolean objects have the same value (handle nulls)
public boolean compareBoolean(Boolean b1, Boolean b2) {
    if (b1 == b2) return true;
    if (b1 == null || b2 == null) return false;
    return b1.equals(b2);
    
}

// Exercise 9: Logic Gate Simulator
// Simulate basic logic gates

public boolean andGate(boolean a, boolean b) {
    return a && b;
    
}

public boolean orGate(boolean a, boolean b) {
    return a || b;
    
}

public boolean notGate(boolean a) {
    return !a == a;
    
}

public boolean xorGate(boolean a, boolean b) {
    return !a || b;
    
}

// Test your methods here - uncomment and modify as needed

System.out.println("Testing isAdult:");
System.out.println("Age 17: " + isAdult(17));      // Should print false
System.out.println("Age 18: " + isAdult(18));      // Should print true
System.out.println("Age 25: " + isAdult(25));      // Should print true

System.out.println("\nTesting isInRange:");
System.out.println("5 in range 1-10: " + isInRange(5, 1, 10));    // Should print true
System.out.println("15 in range 1-10: " + isInRange(15, 1, 10));  // Should print false
System.out.println("1 in range 1-10: " + isInRange(1, 1, 10));    // Should print true

System.out.println("\nTesting isValidEmail:");
System.out.println("user@domain.com: " + isValidEmail("user@domain.com"));  // Should print true
System.out.println("invalid-email: " + isValidEmail("invalid-email"));      // Should print false
System.out.println("user@domain: " + isValidEmail("user@domain"));          // Should print false

System.out.println("\nTesting isEven:");
System.out.println("4 is even: " + isEven(4));     // Should print true
System.out.println("5 is even: " + isEven(5));     // Should print false
System.out.println("0 is even: " + isEven(0));     // Should print true

System.out.println("\nTesting isLeapYear:");
System.out.println("2024: " + isLeapYear(2024));   // Should print true
System.out.println("2023: " + isLeapYear(2023));   // Should print false
System.out.println("1900: " + isLeapYear(1900));   // Should print false
System.out.println("2000: " + isLeapYear(2000));   // Should print true

System.out.println("\nTesting isStrongPassword:");
System.out.println("MyPass123: " + isStrongPassword("MyPass123"));     // Should print true
System.out.println("weak: " + isStrongPassword("weak"));               // Should print false
System.out.println("longbutlowercase: " + isStrongPassword("longbutlowercase"));  // Should print false

System.out.println("\nTesting isValidTriangle:");
System.out.println("3,4,5: " + isValidTriangle(3, 4, 5));      // Should print true
System.out.println("1,1,5: " + isValidTriangle(1, 1, 5));      // Should print false
System.out.println("5,5,5: " + isValidTriangle(5, 5, 5));      // Should print true

System.out.println("\nTesting compareBoolean:");
System.out.println("true,true: " + compareBoolean(true, true));           // Should print true
System.out.println("true,false: " + compareBoolean(true, false));         // Should print false
System.out.println("null,null: " + compareBoolean(null, null));           // Should print true
System.out.println("true,null: " + compareBoolean(true, null));           // Should print false

System.out.println("\nTesting Logic Gates:");
System.out.println("AND true,false: " + andGate(true, false));    // Should print false
System.out.println("OR true,false: " + orGate(true, false));      // Should print true
System.out.println("NOT true: " + notGate(true));                 // Should print false
System.out.println("XOR true,false: " + xorGate(true, false));    // Should print true
System.out.println("XOR true,true: " + xorGate(true, true));      // Should print false

