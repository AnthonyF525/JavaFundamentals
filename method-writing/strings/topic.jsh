// String Exercises - Complete the methods below
// Save this file and load it in jshell with: /open topic.jsh

// Exercise 1: String Basics
// Return the length of a string (handle null strings)
public int getStringLength(String text) {
    if (text == null) {
        return 0;
    }
    return text.length();
}

// Return true if string is null or empty
public boolean isStringEmpty(String text) {
    return text == null || text.isEmpty();
    
}

// Exercise 2: String Comparison
// Safely compare two strings for equality (handle nulls)
public boolean areStringsEqual(String str1, String str2) {
    if (str1 == null && str2 == null) return true;
    if (str1 == null || str2 == null) return false;
    return str1.equals(str2); 
}

// Compare strings ignoring case differences
public boolean compareStringsIgnoreCase(String str1, String str2) {
    if (str1 == null && str2 == null) return true;
    if (str1 == null || str2 == null) return false;
    return str1.equalsIgnoreCase(str2);
}

// Exercise 3: String Search and Contains
// Return true if text contains the search string
public boolean containsSubstring(String text, String search) {
    if (text == null || search == null) return false;
    return text.contains(search);
    
}

// Return index of first occurrence of search in text (-1 if not found)
public int findFirstPosition(String text, String search) {
    if (text == null || search == null) return -1;
    return text.indexOf(search);
    
}

// Exercise 4: String Extraction
// Return the first character of a string (handle empty strings)
public char getFirstCharacter(String text) {
    if (text == null || text.isEmpty()) return ' ';
    return text.charAt(0);
}

// Return the last character of a string
public char getLastCharacter(String text) {
    if (text == null || text.isEmpty()) return ' ';   
    return text.charAt(text.length()-1);
}

// Return substring from start to end index
public String getSubstring(String text, int start, int end) {
    if (text == null || text.isEmpty()) return "";
    return text.substring(start, end);
    
}

// Exercise 5: String Modification
// Convert string to uppercase (handle null)
public String makeUpperCase(String text) {
    if (text == null || text.isEmpty()) return "";
    return text.toUpperCase(); 
    
}

// Convert string to lowercase (handle null)
public String makeLowerCase(String text) {
    if (text == null || text.isEmpty()) return "";
    return text.toLowerCase();
    
}

// Remove leading and trailing spaces
public String trimWhitespace(String text) {
    if (text == null || text.isEmpty()) return "";
    return text.trim();
    
}

// Exercise 6: String Building and Joining
// Join two strings together (handle nulls)
public String concatenateStrings(String str1, String str2) {
    if (str1 == null || str2 == null || str1.isEmpty() || str2.isEmpty()) return "";
    return str1 + " " + str2;
    
}

// Repeat a string the specified number of times
public String repeatString(String text, int count) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < count; i++) {
        result.append(text);
    }
    return result.toString();
    
}

// Join array of strings with a separator
public String joinWithSeparator(String[] words, String separator) {
    if (words == null || words.length == 0) return "";
    StringBuilder result = new StringBuider();
    for (int i = 0; i < word.length; i++) {
        if (word[i] != null) {
            result.append(words[i]);
        }
        if (i < words.length -1) {
            result.append(separator);
        }
    }
    return result.toString();
}

// Exercise 7: String Validation and Analysis
// Return true if email contains "@" and "." characters
public boolean isValidEmail(String email) {
    boolean hasAt = email.contains("@");
    boolean hasDot = email.contains(".");
    boolean validEmail = hasAt && hasDot;
    return hasAt && hasDot;
    
}

// Count number of vowels (a, e, i, o, u) in string (case insensitive)
public int countVowels(String text) {
    int count = 0;
    String vowels = "aeiouAEIOU";
    for (int i = 0; i < text.length(); i++) {
        if (vowels.indexOf(text.charAt(i)) >= 0) {
            count++;
        }
    }
    return count;
    
}

// Return true if string reads same forwards and backwards (ignore case and spaces)
public boolean isPalindrome(String text) {
    String cleaned = text.toLowerCase().replace(" ", "");
    String reversed = new StringBuilder(cleaned).reverse().toString();
    return cleaned.equals(reversed);
    
}

// Test your methods here - uncomment and modify as needed

System.out.println("Testing String Basics:");
System.out.println("Length of 'Hello': " + getStringLength("Hello"));      // Should print 5
System.out.println("Length of null: " + getStringLength(null));             // Should print 0
System.out.println("Is '' empty: " + isStringEmpty(""));                   // Should print true
System.out.println("Is 'Hello' empty: " + isStringEmpty("Hello"));         // Should print false

System.out.println("\nTesting String Comparison:");
System.out.println("'Hello' equals 'Hello': " + areStringsEqual("Hello", "Hello"));     // Should print true
System.out.println("'Hello' equals 'hello': " + areStringsEqual("Hello", "hello"));     // Should print false
System.out.println("'Hello' equals null: " + areStringsEqual("Hello", null));           // Should print false
System.out.println("'Hello' equalsIgnoreCase 'HELLO': " + compareStringsIgnoreCase("Hello", "HELLO")); // Should print true

System.out.println("\nTesting String Search:");
System.out.println("'Hello World' contains 'World': " + containsSubstring("Hello World", "World"));   // Should print true
System.out.println("'Hello World' contains 'xyz': " + containsSubstring("Hello World", "xyz"));       // Should print false
System.out.println("Position of 'World' in 'Hello World': " + findFirstPosition("Hello World", "World")); // Should print 6

System.out.println("\nTesting String Extraction:");
System.out.println("First char of 'Java': " + getFirstCharacter("Java"));    // Should print 'J'
System.out.println("Last char of 'Java': " + getLastCharacter("Java"));      // Should print 'a'
System.out.println("Substring of 'Hello' (1,4): " + getSubstring("Hello", 1, 4)); // Should print "ell"

System.out.println("\nTesting String Modification:");
System.out.println("'hello' uppercase: " + makeUpperCase("hello"));          // Should print "HELLO"
System.out.println("'WORLD' lowercase: " + makeLowerCase("WORLD"));          // Should print "world"
System.out.println("'  spaced  ' trimmed: '" + trimWhitespace("  spaced  ") + "'"); // Should print "spaced"

System.out.println("\nTesting String Building:");
System.out.println("Concat 'Hello' + ' World': " + concatenateStrings("Hello", " World")); // Should print "Hello World"
System.out.println("Repeat 'Hi' 3 times: " + repeatString("Hi", 3));         // Should print "HiHiHi"
String[] words = {"Java", "is", "fun"};
System.out.println("Join with spaces: " + joinWithSeparator(words, " "));    // Should print "Java is fun"

System.out.println("\nTesting String Analysis:");
System.out.println("'test@email.com' is valid email: " + isValidEmail("test@email.com")); // Should print true
System.out.println("'invalid' is valid email: " + isValidEmail("invalid"));               // Should print false
System.out.println("Vowels in 'Hello': " + countVowels("Hello"));            // Should print 2
System.out.println("'racecar' is palindrome: " + isPalindrome("racecar"));   // Should print true
System.out.println("'hello' is palindrome: " + isPalindrome("hello"));       // Should print false

