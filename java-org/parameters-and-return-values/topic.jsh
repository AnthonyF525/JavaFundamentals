// Parameters and Return Values Practice - Focus on method input/output design

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

// Exercise 1: Parameter validation with different return types
class DataValidator {
    
    public String validateEmail(String email) {
        if (email != null && email.contains("@") && email.contains(".")) {
            return "Valid";
        } else {
            return "Invalid";
        }
    }
    
    public boolean validatePassword(String password, int minLength, boolean requireSpecial) {
        if (password == null || password.length() < minLength) {
            return false;
        }
        if (requireSpecial) {
            String specialChars = "!@#$%^&*";
            boolean hasSpecial = false;
            for (char c : password.toCharArray()) {
                if (specialChars.indexOf(c) != -1) {
                    hasSpecial = true;
                    break;
                }
            }
            if (!hasSpecial) return false;
        }
        return true;
    }
    
    public int validateAge(int age, int minAge, int maxAge) {
        if (age < minAge) {
            return -1;
        } else if (age > maxAge) {
            return 1;
        } else {
            return 0;
        }
    }
    
    public String validatePhoneNumber(String phone, String countryCode) {
        String digits = phone.replaceAll("\\D", "");
        if (digits.length() != 10) {
            return "INVALID";
        }
        String formatted = String.format("%s-%s-%s-%s",
            countryCode,
            digits.substring(0, 3),
            digits.substring(3, 6),
            digits.substring(6)
        );
        return formatted;
    }
    
    public boolean[] validateCreditCard(String cardNumber, String expiryDate) {
        boolean[] result = new boolean[2];

        String digits = cardNumber.replaceAll("\\D","");
        result[0] = digits.length() == 16;

        result[1] = false;
        if (expiryDate != null && expiryDate.matches("\\d{2}/\\d{2}")) {
            String[] parts = expiryDate.split("/");
            int month = Integer.parseInt(parts[0]);
            int year = Integer.parseInt(parts[1]) + 2000;
            if (month >= 1 && month <= 12 && year >= 2025) {
                result[1] = true;
            }
        }
        return result;
    }
    
    public String getValidationSummary(String email, String password, int age) {
        String emailResult = validateEmail(email);
        String passwordResult = validatePassword(password, 8, true) ? "Valid" : "Invalid";
        int ageResult = validateAge(age, 18, 65);
        String ageStr = (ageResult == 0) ? "Valid" : (ageResult == -1 ? "Too Young" : "Too Old");
        return String.format("Email: %s, Password: %s, Age: %s", emailResult, passwordResult, ageStr);
    }
}

// Exercise 2: Mathematical operations with various parameters
class MathEngine {
    
    public double calculate(double a, double b, String operation) {
        switch (operation) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if (b == 0.0) return 0.0;
                return a / b;
            case "%":
                if (b == 0.0) return 0.0;
                return a % b;
            default:
                return 0.0;
        }
    }
    
    public double[] findRange(double[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return new double[]{0.0, 0.0};
        }
        double min = numbers[0];
        double max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) min = numbers[i];
            if (numbers[i] > max) max = numbers[i];
        }
        return new double[] {min,max};
    }
    
    public String statisticalSummary(double[] values) {
        // TODO: Return "Mean: X.XX, Median: Y.YY, Mode: Z.ZZ"
        // Return "No data" if array is empty
        return "";
    }
    
    public double compound(double principal, double rate, int years, boolean isAnnual) {
        // TODO: Calculate compound interest
        // If isAnnual=true: A = P(1 + r)^t, else: A = P(1 + r/12)^(12*t)
        return 0.0;
    }
    
    public double distance(double x1, double y1, double x2, double y2) {
        // TODO: Return Euclidean distance between two points
        // Distance = sqrt((x2-x1)² + (y2-y1)²)
        return 0.0;
    }
    
    public String[] quadraticRoots(double a, double b, double c) {
        // TODO: Solve ax² + bx + c = 0
        // Return array of solutions or ["NO_REAL_ROOTS"] if discriminant < 0
        return new String[0];
    }
    
    public boolean isPrime(long number) {
        // TODO: Check if number is prime (handle large numbers efficiently)
        return false;
    }
}

// Exercise 3: String processing with parameter variations
class TextAnalyzer {
    
    public String[] extractWords(String text, boolean removePunctuation, boolean toLowerCase) {
        // TODO: Extract words from text with options
        // Return empty array if text is null or empty
        return new String[0];
    }
    
    public int[] findPattern(String text, String pattern, boolean ignoreCase) {
        // TODO: Find all positions where pattern occurs in text
        // Return array of starting positions, empty array if no matches
        return new int[0];
    }
    
    public String replaceText(String original, String find, String replace, int maxReplacements) {
        // TODO: Replace occurrences with limit
        // maxReplacements <= 0 means replace all
        return "";
    }
    
    public String summarizeText(String text, int maxSentences, boolean preserveOrder) {
        // TODO: Create summary with first N sentences
        // If preserveOrder=false, return longest sentences
        return "";
    }
    
    public double compareTexts(String text1, String text2, boolean ignoreCase, boolean ignoreSpaces) {
        // TODO: Return similarity score 0.0-1.0
        // Simple algorithm: count matching characters
        return 0.0;
    }
    
    public String[] formatText(String text, int lineLength, String alignment, boolean addNumbers) {
        // TODO: Format text into lines
        // alignment: "LEFT", "CENTER", "RIGHT"
        // addNumbers: add line numbers if true
        return new String[0];
    }
    
    public ArrayList<String> extractEmails(String text, String domain) {
        // TODO: Extract email addresses
        // If domain is empty, return all emails; otherwise filter by domain
        return new ArrayList<>();
    }
}

// Exercise 4: Collection operations with return collections
class CollectionProcessor {
    
    public ArrayList<Integer> filterNumbers(ArrayList<Integer> numbers, int min, int max, boolean inclusive) {
        // TODO: Filter numbers within range
        // inclusive=true: include min/max, false: exclude min/max
        return new ArrayList<>();
    }
    
    public ArrayList<String> sortStrings(ArrayList<String> strings, boolean ascending, boolean ignoreCase) {
        // TODO: Sort strings with options
        // Return new sorted list, don't modify original
        return new ArrayList<>();
    }
    
    public ArrayList<Integer> mergeLists(ArrayList<Integer> list1, ArrayList<Integer> list2, boolean removeDuplicates) {
        // TODO: Merge two lists
        // If removeDuplicates=true, remove duplicate values
        return new ArrayList<>();
    }
    
    public HashMap<String, ArrayList<String>> groupByLength(ArrayList<String> words, int targetLength, String comparison) {
        // TODO: Group words by length comparison
        // comparison: "EQUAL", "LESS", "GREATER", "LESS_OR_EQUAL", "GREATER_OR_EQUAL"
        // Return map with comparison result as key
        return new HashMap<>();
    }
    
    public Set<String> findCommonElements(ArrayList<String> list1, ArrayList<String> list2, boolean caseSensitive) {
        // TODO: Find elements present in both lists
        return new HashSet<>();
    }
    
    public ArrayList<Double> processNumbers(ArrayList<Double> numbers, String operation, Double operand) {
        // TODO: Apply operation to each number
        // operations: "ADD", "MULTIPLY", "DIVIDE", "POWER"
        return new ArrayList<>();
    }
    
    public ArrayList<ArrayList<Integer>> partitionData(ArrayList<Integer> data, int partitionSize, boolean allowPartial) {
        // TODO: Split data into chunks
        // allowPartial=false means drop incomplete last partition
        return new ArrayList<>();
    }
}

// Exercise 5: Object factory with constructor parameters
class PersonFactory {
    
    // Inner Person class for this exercise
    class Person {
        String name;
        int age;
        String email;
        String city;
        boolean isEmployed;
        
        public Person(String name, int age, String email, String city, boolean isEmployed) {
            this.name = name;
            this.age = age;
            this.email = email;
            this.city = city;
            this.isEmployed = isEmployed;
        }
        
        public String toString() {
            return String.format("Person{name='%s', age=%d, email='%s', city='%s', employed=%b}", 
                               name, age, email, city, isEmployed);
        }
    }
    
    public Person createBasicPerson(String name, int age) {
        // TODO: Create person with name and age, other fields as defaults
        // email="", city="Unknown", isEmployed=false
        return null;
    }
    
    public Person createDetailedPerson(String name, int age, String email, String city) {
        // TODO: Create person with provided info, isEmployed=false
        return null;
    }
    
    public Person createEmployedPerson(String name, int age, String email, String city, boolean isEmployed) {
        // TODO: Create person with all provided info
        return null;
    }
    
    public Person createPersonFromCsv(String csvLine) {
        // TODO: Parse CSV: "name,age,email,city,employed"
        // Return null if parsing fails
        return null;
    }
    
    public Person createRandomPerson(String[] namePool, int minAge, int maxAge) {
        // TODO: Create person with random name from pool, random age in range
        // Use simple randomization (you can use System.currentTimeMillis() % array.length)
        return null;
    }
    
    public Person validateAndCreatePerson(String name, Integer age, String email) {
        // TODO: Create person only if all parameters are valid
        // name not null/empty, age between 0-150, email contains @
        // Return null if any validation fails
        return null;
    }
    
    public ArrayList<Person> batchCreatePeople(String[] names, int[] ages, String[] emails) {
        // TODO: Create multiple people from parallel arrays
        // Arrays must be same length, skip invalid entries
        return new ArrayList<>();
    }
}

// Exercise 6: Configuration management with flexible parameters
class ConfigManager {
    private HashMap<String, Object> settings = new HashMap<>();
    
    public boolean setSetting(String key, Object value, boolean overwrite) {
        // TODO: Set setting if key doesn't exist or overwrite=true
        // Return true if setting was set
        return false;
    }
    
    public Object getSetting(String key, Object defaultValue) {
        // TODO: Get setting or return defaultValue if not found
        return null;
    }
    
    public String getStringSetting(String key, String defaultValue, boolean trim) {
        // TODO: Get setting as String, apply trim if requested
        return "";
    }
    
    public int getIntSetting(String key, int defaultValue, int minValue, int maxValue) {
        // TODO: Get setting as int, clamp to min/max range
        return 0;
    }
    
    public boolean getBooleanSetting(String key, boolean defaultValue) {
        // TODO: Get setting as boolean
        // Convert "true"/"1" to true, anything else to false
        return false;
    }
    
    public String exportSettings(String[] keys, String format) {
        // TODO: Export specified keys in JSON or XML format
        // format: "JSON" or "XML"
        // JSON: {"key1":"value1","key2":"value2"}
        // XML: <settings><key1>value1</key1><key2>value2</key2></settings>
        return "";
    }
    
    public int importSettings(String data, String format, boolean replaceExisting) {
        // TODO: Import settings from formatted string
        // Return count of successfully imported settings
        // Simple parsing expected
        return 0;
    }
}

// Exercise 7: Advanced parameter patterns
class DatabaseQuery {
    
    // Simple result class for queries
    class QueryResult {
        String query;
        int rowCount;
        boolean success;
        
        public QueryResult(String query, int rowCount, boolean success) {
            this.query = query;
            this.rowCount = rowCount;
            this.success = success;
        }
        
        public String toString() {
            return String.format("QueryResult{query='%s', rowCount=%d, success=%b}", query, rowCount, success);
        }
    }
    
    public String select(String table, String[] columns, String whereClause, Object[] parameters) {
        // TODO: Build SELECT SQL statement
        // Example: "SELECT col1,col2 FROM table WHERE condition"
        return "";
    }
    
    public String insert(String table, HashMap<String, Object> data, boolean ignoreConflicts) {
        // TODO: Build INSERT SQL statement
        // ignoreConflicts: add "OR IGNORE" clause
        return "";
    }
    
    public String update(String table, HashMap<String, Object> updates, String whereClause, Object[] whereParams) {
        // TODO: Build UPDATE SQL statement
        return "";
    }
    
    public String join(String leftTable, String rightTable, String joinType, String[] conditions) {
        // TODO: Build JOIN SQL
        // joinType: "INNER", "LEFT", "RIGHT", "FULL"
        return "";
    }
    
    public String buildQuery(String operation, String table, Object... parameters) {
        // TODO: Build query using varargs (variable arguments)
        // operation: "SELECT", "INSERT", "UPDATE", "DELETE"
        return "";
    }
    
    public QueryResult executeQuery(String sql, Object[] parameters, boolean returnResults) {
        // TODO: Simulate query execution
        // Return QueryResult with simulated data
        return null;
    }
    
    public int[] batchExecute(String[] queries, Object[][] allParameters, boolean stopOnError) {
        // TODO: Execute multiple queries
        // Return array of affected row counts
        // stopOnError: return immediately if any query fails
        return new int[0];
    }
}

// Test your implementations:

// Test DataValidator
System.out.println("=== Testing DataValidator ===");
DataValidator validator = new DataValidator();
System.out.println("Email validation: " + validator.validateEmail("test@example.com"));
System.out.println("Email validation (invalid): " + validator.validateEmail("invalid"));
System.out.println("Password valid: " + validator.validatePassword("Password123!", 8, true));
System.out.println("Age validation: " + validator.validateAge(25, 18, 65));
System.out.println("Phone validation: " + validator.validatePhoneNumber("5551234567", "+1"));
System.out.println("Credit card: " + Arrays.toString(validator.validateCreditCard("1234567890123456", "12/26")));
System.out.println("Summary: " + validator.getValidationSummary("test@example.com", "Pass123!", 25));

// Test MathEngine
System.out.println("\n=== Testing MathEngine ===");
MathEngine math = new MathEngine();
System.out.println("Calculate 10 + 5: " + math.calculate(10, 5, "+"));
System.out.println("Range of [1,5,3,9,2]: " + Arrays.toString(math.findRange(new double[]{1,5,3,9,2})));
System.out.println("Statistics: " + math.statisticalSummary(new double[]{1,2,3,4,5}));
System.out.println("Compound interest: " + math.compound(1000, 0.05, 2, true));
System.out.println("Distance (0,0) to (3,4): " + math.distance(0, 0, 3, 4));
System.out.println("Quadratic roots x²-5x+6: " + Arrays.toString(math.quadraticRoots(1, -5, 6)));
System.out.println("Is 17 prime: " + math.isPrime(17));

// Test TextAnalyzer
System.out.println("\n=== Testing TextAnalyzer ===");
TextAnalyzer analyzer = new TextAnalyzer();
System.out.println("Extract words: " + Arrays.toString(analyzer.extractWords("Hello, World! How are you?", true, true)));
System.out.println("Find 'o' positions: " + Arrays.toString(analyzer.findPattern("Hello World", "o", false)));
System.out.println("Replace text: " + analyzer.replaceText("hello hello hello", "hello", "hi", 2));
System.out.println("Summarize: " + analyzer.summarizeText("First sentence. Second sentence. Third sentence.", 2, true));
System.out.println("Compare texts: " + analyzer.compareTexts("Hello", "hello", true, false));
System.out.println("Format text: " + Arrays.toString(analyzer.formatText("This is a test", 5, "LEFT", true)));
System.out.println("Extract emails: " + analyzer.extractEmails("Contact us at info@example.com or support@test.org", "example.com"));

// Test CollectionProcessor
System.out.println("\n=== Testing CollectionProcessor ===");
CollectionProcessor processor = new CollectionProcessor();
ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 5, 10, 15, 20));
System.out.println("Filter 5-15 inclusive: " + processor.filterNumbers(numbers, 5, 15, true));
ArrayList<String> strings = new ArrayList<>(Arrays.asList("banana", "Apple", "cherry"));
System.out.println("Sort ascending, ignore case: " + processor.sortStrings(strings, true, true));
ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(3, 4, 5));
System.out.println("Merge lists: " + processor.mergeLists(list1, list2, true));
ArrayList<String> words = new ArrayList<>(Arrays.asList("cat", "dog", "elephant", "ant"));
System.out.println("Group by length > 3: " + processor.groupByLength(words, 3, "GREATER"));
System.out.println("Common elements: " + processor.findCommonElements(
    new ArrayList<>(Arrays.asList("apple", "banana")), 
    new ArrayList<>(Arrays.asList("banana", "cherry")), true));
System.out.println("Process numbers *2: " + processor.processNumbers(
    new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0)), "MULTIPLY", 2.0));

// Test PersonFactory
System.out.println("\n=== Testing PersonFactory ===");
PersonFactory factory = new PersonFactory();
System.out.println("Basic person: " + factory.createBasicPerson("Alice", 30));
System.out.println("Detailed person: " + factory.createDetailedPerson("Bob", 25, "bob@example.com", "New York"));
System.out.println("From CSV: " + factory.createPersonFromCsv("Charlie,35,charlie@test.com,Boston,true"));
System.out.println("Random person: " + factory.createRandomPerson(new String[]{"Alice", "Bob", "Carol"}, 20, 40));
System.out.println("Validated person: " + factory.validateAndCreatePerson("Dave", 28, "dave@example.com"));
System.out.println("Batch create: " + factory.batchCreatePeople(
    new String[]{"Eve", "Frank"}, new int[]{22, 33}, new String[]{"eve@test.com", "frank@test.com"}));

// Test ConfigManager
System.out.println("\n=== Testing ConfigManager ===");
ConfigManager config = new ConfigManager();
System.out.println("Set setting: " + config.setSetting("timeout", 30, false));
System.out.println("Get setting: " + config.getSetting("timeout", 10));
System.out.println("Get string setting: " + config.getStringSetting("name", "default", true));
System.out.println("Get int setting: " + config.getIntSetting("timeout", 10, 1, 100));
System.out.println("Get boolean setting: " + config.getBooleanSetting("enabled", false));
config.setSetting("app", "MyApp", true);
config.setSetting("version", "1.0", true);
System.out.println("Export JSON: " + config.exportSettings(new String[]{"app", "version"}, "JSON"));
System.out.println("Import count: " + config.importSettings("{\"test\":\"value\"}", "JSON", true));

// Test DatabaseQuery
System.out.println("\n=== Testing DatabaseQuery ===");
DatabaseQuery db = new DatabaseQuery();
System.out.println("SELECT query: " + db.select("users", new String[]{"name", "email"}, "age > ?", new Object[]{18}));
HashMap<String, Object> data = new HashMap<>();
data.put("name", "John");
data.put("age", 25);
System.out.println("INSERT query: " + db.insert("users", data, true));
HashMap<String, Object> updates = new HashMap<>();
updates.put("age", 26);
System.out.println("UPDATE query: " + db.update("users", updates, "name = ?", new Object[]{"John"}));
System.out.println("JOIN query: " + db.join("users", "orders", "LEFT", new String[]{"users.id = orders.user_id"}));
System.out.println("Build query: " + db.buildQuery("SELECT", "products", "name", "price"));
System.out.println("Execute query: " + db.executeQuery("SELECT * FROM users", new Object[]{}, true));
System.out.println("Batch execute: " + Arrays.toString(db.batchExecute(
    new String[]{"INSERT INTO users VALUES (?)", "UPDATE users SET age = ?"}, 
    new Object[][]{{"John"}, {30}}, false)));

System.out.println("\n=== All Parameter and Return Value Tests Complete! ===");
