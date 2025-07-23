// Double and double Exercises - Complete the methods below
// Save this file and load it in jshell with: /open topic.jsh

// Exercise 1: Basic Double Operations
// Return the sum of two doubles
public double calculateSum(double a, double b) {
    return a + b;
    
}

// Return the average of three doubles
public double calculateAverage(double a, double b, double c) {
    return (a + b + c) / 3;
    
}

// Exercise 2: Math Operations
// Return the larger of two doubles
public double findLarger(double a, double b) {
    return (a > b) ? a : b;
    
}

// Return the absolute value of a double
public double calculateAbsolute(double number) {
    return Math.abs(number);
    
}

// Round double to nearest integer
public int roundToNearestInt(double number) {
    return (int) Math.round(number);
    
}

// Exercise 3: Precision and Comparison
// Check if two doubles are equal within tolerance
public boolean areDoublesEqual(double a, double b, double tolerance) {
    return Math.abs(a - b) <= tolerance;
    
}

// Format double to string with 2 decimal places
public String formatToTwoDecimals(double number) {
    return String.format("%.2f", number);
    
}

// Exercise 4: Mathematical Calculations
// Calculate area of circle (π × r²)
public double calculateCircleArea(double radius) {
    return Math.PI * radius * radius;
    
}

// Calculate distance between two points using distance formula
// √[(x2-x1)² + (y2-y1)²]
public double calculateDistance(double x1, double y1, double x2, double y2) {
    double dx = x2 - x1;
    double dy = y2 - y1;
    return Math.sqrt(dx * dx + dy * dy);
    
}

// Calculate compound interest: principal × (1 + rate)^years
public double calculateCompoundInterest(double principal, double rate, int years) {
    return principal * Math.pow(1 + rate, years);
    
}

// Exercise 5: Range and Validation
// Check if value is between min and max (inclusive)
public boolean isInRange(double value, double min, double max) {
    return value >= min && value <= max;
    
}

// Constrain value to be within min and max bounds
public double clampValue(double value, double min, double max) {
    return Math.max(min, Math.min(max, value));
    
}

// Exercise 6: Double Object Practice
// Safely parse string to Double, return null if fails
public Double parseDoubleSafely(String text) {
    try {
        return Double.parseDouble(text);
    } catch (NumberFormatException e) {
        return null;
    }
}

// Safely compare Double objects (handle nulls)
// Return: -1 if d1 < d2, 0 if equal, 1 if d1 > d2
// null is considered less than any number
public int compareDoubles(Double d1, Double d2) {
    if (d1 == d2) return 0;
    if (d1 == null) return -1;
    if (d2 == null) return 1;
    return Double.compare(d1, d2);
    
}

// Exercise 7: Array Statistics
// Find maximum value in array
public double findMaximum(double[] numbers) {
    if (numbers == null || numbers.length == 0) {
        throw new IllegalArgumentException("Array must not be empty");
    }
    double max = numbers[0];
    for (int i = 1; i < numbers.length; i++) {
        if (numbers[i] > max) {
            max = numbers[i];
        }
    }
    return max;
}

// Calculate arithmetic mean (average) of array
public double calculateMean(double[] numbers) {
    if (numbers == null || numbers.length == 0) {
        throw new IllegalArgumentException("Array must not be empty");
    }
    double sum = 0;
    for (double num : numbers) {
        sum += num;
    } 
    return sum / numbers.length;
}

// Calculate standard deviation of array
public double calculateStandardDeviation(double[] numbers) {
    if (numbers == null || numbers.length == 0) {
        throw new IllegalArgumentException("Array must not be empty");
    }
    double mean = 0;
    for (double num : numbers) {
        mean += num;
    }
    mean /= numbers.length;

    double sumSquaredDiffs = 0;
    for (double num : numbers) {
        sumSquaredDiffs += Math.pow(num - mean, 2);
    }
    return Math.sqrt(sumSquaredDiffs / numbers.length);
}

// Test your methods here - uncomment and modify as needed

System.out.println("Testing Basic Operations:");
System.out.println("3.5 + 2.7 = " + calculateSum(3.5, 2.7));           // Should print 6.2
System.out.println("Average of 1,2,3 = " + calculateAverage(1.0, 2.0, 3.0)); // Should print 2.0

System.out.println("\nTesting Math Operations:");
System.out.println("Larger of 3.14, 2.71: " + findLarger(3.14, 2.71)); // Should print 3.14
System.out.println("Absolute of -5.5: " + calculateAbsolute(-5.5));     // Should print 5.5
System.out.println("Round 3.7: " + roundToNearestInt(3.7));             // Should print 4
System.out.println("Round 3.2: " + roundToNearestInt(3.2));             // Should print 3

System.out.println("\nTesting Precision:");
System.out.println("0.1+0.2 equals 0.3? " + areDoublesEqual(0.1 + 0.2, 0.3, 0.0001)); // Should print true
System.out.println("Exact comparison: " + (0.1 + 0.2 == 0.3));          // Should print false!
System.out.println("3.14159 formatted: " + formatToTwoDecimals(3.14159)); // Should print "3.14"

System.out.println("\nTesting Mathematical Calculations:");
System.out.println("Circle area (r=5): " + calculateCircleArea(5.0));    // Should print ~78.54
System.out.println("Distance (0,0)-(3,4): " + calculateDistance(0, 0, 3, 4)); // Should print 5.0
System.out.println("Compound interest $1000 at 5% for 3 years: " + calculateCompoundInterest(1000, 0.05, 3)); // Should print ~1157.63

System.out.println("\nTesting Range Operations:");
System.out.println("2.5 in range [1,5]: " + isInRange(2.5, 1.0, 5.0));  // Should print true
System.out.println("10.0 in range [1,5]: " + isInRange(10.0, 1.0, 5.0)); // Should print false
System.out.println("Clamp 10.0 to [1,5]: " + clampValue(10.0, 1.0, 5.0)); // Should print 5.0
System.out.println("Clamp -2.0 to [1,5]: " + clampValue(-2.0, 1.0, 5.0)); // Should print 1.0

System.out.println("\nTesting Double Objects:");
System.out.println("Parse '3.14': " + parseDoubleSafely("3.14"));        // Should print 3.14
System.out.println("Parse 'abc': " + parseDoubleSafely("abc"));           // Should print null
System.out.println("Compare 3.5, 2.1: " + compareDoubles(3.5, 2.1));     // Should print 1
System.out.println("Compare null, 5.0: " + compareDoubles(null, 5.0));   // Should print -1

System.out.println("\nTesting Array Statistics:");
double[] testArray = {1.1, 3.3, 2.2, 4.4, 1.1};
System.out.println("Maximum: " + findMaximum(testArray));                 // Should print 4.4
System.out.println("Mean: " + calculateMean(testArray));                  // Should print 2.42
System.out.println("Standard deviation: " + calculateStandardDeviation(testArray));

// Test edge cases
double[] emptyArray = {};
// System.out.println("Mean of empty array: " + calculateMean(emptyArray)); // Test your error handling

