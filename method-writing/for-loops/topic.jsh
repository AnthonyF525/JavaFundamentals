// For Loops Exercises - Complete the methods below
// Save this file and load it in jshell with: /open topic.jsh

// Exercise 1: Number Sequence
// Print all numbers from start to end (inclusive)
public void printNumbers(int start, int end) {
    for(int i = start; i < end; i++) {
        System.out.println(i);
    }  
}

// Exercise 2: Sum Calculator
// Calculate the sum of all integers from 1 to n
public int calculateSum(int n) {
    int sum = 0;
    for(int i = 1; i <= n; i++) {
        sum = sum +i;
    }
    return sum;
}

// Exercise 3: Multiplication Table
// Print the multiplication table for the given number (1 through 10)
public void multiplicationTable(int number) {
    for (int i = 1; i <= number; i++) {
    for (int j = 1; j <= number; j++) {
        System.out.print((i * j) + "\t");
    }
    System.out.println();
}
    
}

// Exercise 4: Even Numbers Only
// Print all even numbers from 2 up to the limit (inclusive)
public void printEvenNumbers(int limit) {
    for (int i = 2; i <= limit; i += 2) {
    System.out.println(i);
}
    
}

// Exercise 5: String Repeater
// Return a string with the given text repeated the specified number of times
public String repeatString(String text, int times) {
    StringBuilder result = new StringBuilder();
    for (int i =0; i < times; i++) {
        result.append(text);
    }
    return result.toString();
}

// Exercise 6: Factorial Calculator
// Calculate n! (n factorial) using a for loop
public long calculateFactorial(int n) {
    long result = 1;
    for (int i = 2; i <= n;i++) {
        result *= i;
    }
    return result;
}

// Exercise 7: Array Sum
// Calculate and return the sum of all numbers in an array
public int sumArray(int[] numbers) {
    int sum = 0;
    for (int num : numbers) {
        sum += num;
    }
    return sum;
}

// Exercise 8: Character Counter
// Count how many times a specific character appears in a string
public int countCharacter(String text, char target) {
    int count = 0;
    for (int i = 0; i < text.length(); i++) {
        if (text.charAt(i) == target) {
            count++;
        }
    }
    return count;
}

// Exercise 9: Pattern Printer
// Print a triangle pattern of stars
public void printStars(int rows) {
    for (int i = 1; i <= rows; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}

// Test your methods here - uncomment and modify as needed

System.out.println("Testing printNumbers:");
printNumbers(1, 5);
printNumbers(3, 7);

System.out.println("\nTesting calculateSum:");
System.out.println("Sum 1 to 4: " + calculateSum(4));    // Should print 10
System.out.println("Sum 1 to 5: " + calculateSum(5));    // Should print 15
System.out.println("Sum 1 to 1: " + calculateSum(1));    // Should print 1

System.out.println("\nTesting multiplicationTable:");
multiplicationTable(3);

System.out.println("\nTesting printEvenNumbers:");
printEvenNumbers(10);
printEvenNumbers(15);

System.out.println("\nTesting repeatString:");
System.out.println("'" + repeatString("Hi", 3) + "'");     // Should print 'HiHiHi'
System.out.println("'" + repeatString("Java", 2) + "'");   // Should print 'JavaJava'
System.out.println("'" + repeatString("X", 0) + "'");      // Should print ''

System.out.println("\nTesting calculateFactorial:");
System.out.println("5!: " + calculateFactorial(5));       // Should print 120
System.out.println("3!: " + calculateFactorial(3));       // Should print 6
System.out.println("1!: " + calculateFactorial(1));       // Should print 1
System.out.println("0!: " + calculateFactorial(0));       // Should print 1

System.out.println("\nTesting sumArray:");
System.out.println("Sum [1,2,3,4]: " + sumArray(new int[]{1,2,3,4}));     // Should print 10
System.out.println("Sum [5,10,15]: " + sumArray(new int[]{5,10,15}));      // Should print 30
System.out.println("Sum []: " + sumArray(new int[]{}));                    // Should print 0

System.out.println("\nTesting countCharacter:");
System.out.println("'l' in 'hello': " + countCharacter("hello", 'l'));     // Should print 2
System.out.println("'a' in 'Java': " + countCharacter("Java", 'a'));       // Should print 2
System.out.println("'x' in 'hello': " + countCharacter("hello", 'x'));     // Should print 0

System.out.println("\nTesting printStars:");
printStars(4);
System.out.println();
printStars(2);

