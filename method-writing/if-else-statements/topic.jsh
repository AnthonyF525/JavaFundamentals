// If Statements Exercises - Complete the methods below
// Save this file and load it in jshell with: /open topic.jsh

// Exercise 1: Basic If Statement
// Write a method that checks if someone is an adult (18 or older)
public String checkAge(int age) {
    if (age >= 18) {
        return "Adult";
    } else {
        return "Minor";
    }
}

// Exercise 2: Grade Classification  
// Classify a numeric grade into a category
public String classifyGrade(int score) {
    if (score >= 90) {
        return "Excellent";
    } else if (score >= 80 && score <= 89) {
        return "Good";
    } else if (score >= 70 && score <= 79) {
        return "Average";
    } else if (score <= 70); {
        return "Below Average";
    }
    
}

// Exercise 3: Number Sign
// Determine if a number is positive, negative, or zero
public String getSign(int number) {
    if (number > 0) {
        return "Positive";
    } else if (number == 0) {
        return "Zero";
    } else {
        return "Negative";
    }
    
}

// Exercise 4: Temperature Check
// Classify temperature as hot, warm, or cold
public String checkTemperature(double temp) {
    if (temp > 80) {
        return "Hot";
    } else if (temp >= 60 && temp <= 80) {
        return "Warm";
    } else {
        return "Cold";
    }
}

// Exercise 5: Login Validation
// Check if username and password are valid (not null and not empty)
public boolean validateLogin(String username, String password) {
    if (username != null && !username.isEmpty() && password != null && !password.isEmpty()) {
        return true;
    } else {
        return false;
    }  
}

// Test your methods here - uncomment and modify as needed

System.out.println("Testing checkAge:");
System.out.println(checkAge(17));  // Should print "Minor"
System.out.println(checkAge(18));  // Should print "Adult"
System.out.println(checkAge(25));  // Should print "Adult"

System.out.println("\nTesting classifyGrade:");
System.out.println(classifyGrade(95));  // Should print "Excellent"
System.out.println(classifyGrade(85));  // Should print "Good"
System.out.println(classifyGrade(75));  // Should print "Average"
System.out.println(classifyGrade(65));  // Should print "Below Average"

System.out.println("\nTesting getSign:");
System.out.println(getSign(10));   // Should print "Positive"
System.out.println(getSign(0));    // Should print "Zero"
System.out.println(getSign(-5));   // Should print "Negative"

System.out.println("\nTesting checkTemperature:");
System.out.println(checkTemperature(85.0));  // Should print "Hot"
System.out.println(checkTemperature(70.0));  // Should print "Warm"
System.out.println(checkTemperature(50.0));  // Should print "Cold"

System.out.println("\nTesting validateLogin:");
System.out.println(validateLogin("user", "pass"));     // Should print true
System.out.println(validateLogin("", "pass"));         // Should print false
System.out.println(validateLogin("user", ""));         // Should print false
System.out.println(validateLogin(null, "pass"));       // Should print false

