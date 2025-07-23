// While Loops Exercises - Complete the methods below
// Save this file and load it in jshell with: /open topic.jsh

// Exercise 1: Countdown
// Print numbers from start down to 1, then print "Blast off!"
public void countdown(int start) {
    while(start > 0) {
        System.out.println("Count is: " + start);
        start--;
    }
    System.out.print("Blast off!");
}

// Exercise 2: Sum Calculator
// Calculate the sum of all integers from 1 to n
public int sumUpTo(int n) {
    int sum = 0;
    int i = 1;
    while (i <= n) {
        sum = sum + i;  
        i++;
    }
    return sum;
}

// Exercise 3: Number Guessing Helper
// Count how many steps it takes to get from start to target (adding 1 each time)
public int findNumber(int target, int start) {
    int step = 0;
    while (start < target) {
        start++;
        step++;
    }
    return step;
}

// Exercise 4: Digit Counter
// Count how many digits are in a positive integer
public int countDigits(int number) {
    // Your code here
    
}

// Exercise 5: Password Strength Checker
// Use a while loop to count characters and determine password strength
public String checkPasswordStrength(String password) {
    // Your code here
    
}

// Exercise 6: Factorial Calculator
// Calculate n! (n factorial) using a while loop
public long factorial(int n) {
    // Your code here
    
}

// Exercise 7: Power Calculator
// Calculate base^exponent using a while loop (don't use Math.pow)
public int power(int base, int exponent) {
    // Your code here
    
}

// Test your methods here - uncomment and modify as needed

System.out.println("Testing countdown:");
countdown(5);

System.out.println("\nTesting sumUpTo:");
System.out.println("Sum 1 to 4: " + sumUpTo(4));    // Should print 10
System.out.println("Sum 1 to 5: " + sumUpTo(5));    // Should print 15
System.out.println("Sum 1 to 1: " + sumUpTo(1));    // Should print 1

System.out.println("\nTesting findNumber:");
System.out.println("Steps from 5 to 10: " + findNumber(10, 5));  // Should print 5
System.out.println("Steps from 1 to 1: " + findNumber(1, 1));    // Should print 0
/*
System.out.println("\nTesting countDigits:");
System.out.println("Digits in 12345: " + countDigits(12345));    // Should print 5
System.out.println("Digits in 7: " + countDigits(7));            // Should print 1
System.out.println("Digits in 100: " + countDigits(100));        // Should print 3

System.out.println("\nTesting checkPasswordStrength:");
System.out.println("'password123': " + checkPasswordStrength("password123"));  // Should print "Strong"
System.out.println("'hello': " + checkPasswordStrength("hello"));              // Should print "Medium"
System.out.println("'hi': " + checkPasswordStrength("hi"));                    // Should print "Weak"

System.out.println("\nTesting factorial:");
System.out.println("5!: " + factorial(5));    // Should print 120
System.out.println("3!: " + factorial(3));    // Should print 6
System.out.println("1!: " + factorial(1));    // Should print 1

System.out.println("\nTesting power:");
System.out.println("2^3: " + power(2, 3));    // Should print 8
System.out.println("5^2: " + power(5, 2));    // Should print 25
System.out.println("3^0: " + power(3, 0));    // Should print 1
*/
