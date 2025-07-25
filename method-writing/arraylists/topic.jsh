// ArrayList Exercises - Complete the methods below
// Save this file and load it in jshell with: /open topic.jsh
import java.util.ArrayList;
import java.util.Collections;

// Exercise 1: ArrayList Basics
// Create and return a new ArrayList of Strings
public ArrayList<String> createStringList() {
    return new ArrayList<>();
}

// Return size of ArrayList (handle null)
public int getListSize(ArrayList<String> list) {
    if (list == null) return 0;
    return list.size();
}

// Exercise 2: Adding Elements
// Add item to the end of the list
public void addToEnd(ArrayList<String> list, String item) {
    list.add(item);
    
}

// Add item to the beginning of the list
public void addToBeginning(ArrayList<String> list, String item) {
    list.add(0, item);
    
}

// Add item at specific position
public void addAtPosition(ArrayList<String> list, int index, String item) {
    list.add(index, item);
    
}

// Exercise 3: Accessing Elements
// Return first item (null if empty)
public String getFirstItem(ArrayList<String> list) {
    if (list == null || list.isEmpty()) return null;
    return list.get(0); 
}

// Return last item (null if empty)
public String getLastItem(ArrayList<String> list) {
    if (list == null || list.isEmpty()) return null;
    return list.get(list.size(0) - 1); 
}

// Return item at specific index (null if out of bounds)
public String getItemAt(ArrayList<String> list, int index) {
    if (index >= 0 && index < list.size()) {
    String item = list.get(index);
    }
    return list.get(index);
}

// Exercise 4: Searching and Contains
// Return true if list contains the item
public boolean containsItem(ArrayList<String> list, String item) {
    return list.contains(item);
    
}

// Return index of first occurrence (-1 if not found)
public int findPosition(ArrayList<String> list, String item) {
    if (list == null) return -1;
    list.indexOf(item);
}

// Count how many times item appears in list
public int countOccurrences(ArrayList<String> list, String item) {
    if (list == null) return 0;
    int count = 0;
    for (String s : list) {
        if (s != null && s.equals(item)) {
            count++;
        }
    } 
    return count;
}

// Exercise 5: Removing Elements
// Remove and return first item (null if empty)
public String removeFirstItem(ArrayList<String> list) {
    if (list == null || list.isEmpty()) return null;
    return list.remove(0);
    
}

// Remove and return last item (null if empty)
public String removeLastItem(ArrayList<String> list) {
    if (list == null || list.isEmpty()) return null;
    return list.remove(list.size() - 1);
    
}

// Remove item at specific index (null if out of bounds)
public String removeAtPosition(ArrayList<String> list, int index) {
    if (list == null || list.isEmpty() || index < 0 || index >= list.size()) return null;
    return list.remove(index);
    
}

// Remove all occurrences of an item
public void removeAllOccurrences(ArrayList<String> list, String item) {
    if (list == null) return;
    list.removeIf(s -> s != null && s.equals(item));
    
}

// Exercise 6: List Operations
// Remove all items from list
public void clearList(ArrayList<String> list) {
    list.clear(); 
}

// Create a copy of the list
public ArrayList<String> copyList(ArrayList<String> original) {
    ArrayList<String> copy = new ArrayList<>(original);
    return copy;
    
}

// Combine two lists into one new list
public ArrayList<String> mergeLists(ArrayList<String> list1, ArrayList<String> list2) {
    ArrayList<String> merged = new ArrayList<>();
    if (list1 != null) merged.addAll(list1);
    if (list2 != null) merged.addAll(list2);
    return merged;
}
    


// Exercise 7: List Analysis
// Find and return the longest string in the list
public String findLongestString(ArrayList<String> list) {
    if (list.isEmpty()) return null;
    
    String longest = list.get(0);
    for (String item : list) {
        if (item.length() > longest.length()) {
            longest = item;
        }
    }
    return longest;
}

// Sort the list alphabetically (modifies the original list)
public void sortList(ArrayList<String> list) {
    if (list == null) return; // Optional: handle null lists safely
    Collections.sort(list);
    
}

// Convert ArrayList to String array
public String[] convertToArray(ArrayList<String> list) {
    return list.toArray(new String[0]);
    
}

// Test your methods here - uncomment and modify as needed

System.out.println("Testing ArrayList Basics:");
ArrayList<String> list = createStringList();
System.out.println("Empty list size: " + getListSize(list));        // Should print 0

System.out.println("\nTesting Adding Elements:");
addToEnd(list, "Apple");
addToEnd(list, "Banana");
addToBeginning(list, "Cherry");
System.out.println("List size after adding: " + getListSize(list)); // Should print 3
System.out.println("List contents: " + list);                       // Should show [Cherry, Apple, Banana]

System.out.println("\nTesting Accessing Elements:");
System.out.println("First item: " + getFirstItem(list));            // Should print "Cherry"
System.out.println("Last item: " + getLastItem(list));              // Should print "Banana"
System.out.println("Item at index 1: " + getItemAt(list, 1));       // Should print "Apple"

System.out.println("\nTesting Searching:");
System.out.println("Contains 'Apple': " + containsItem(list, "Apple"));     // Should print true
System.out.println("Contains 'Orange': " + containsItem(list, "Orange"));   // Should print false
System.out.println("Position of 'Banana': " + findPosition(list, "Banana")); // Should print 2

addToEnd(list, "Apple");  // Add duplicate
System.out.println("Count of 'Apple': " + countOccurrences(list, "Apple")); // Should print 2

System.out.println("\nTesting Removing Elements:");
String removed = removeFirstItem(list);
System.out.println("Removed first: " + removed);                    // Should print "Cherry"
System.out.println("List after removal: " + list);

System.out.println("\nTesting List Operations:");
ArrayList<String> copy = copyList(list);
System.out.println("Original: " + list);
System.out.println("Copy: " + copy);

ArrayList<String> list2 = createStringList();
addToEnd(list2, "Orange");
addToEnd(list2, "Grape");
ArrayList<String> merged = mergeLists(list, list2);
System.out.println("Merged list: " + merged);

System.out.println("\nTesting List Analysis:");
System.out.println("Longest string: " + findLongestString(merged));
sortList(merged);
System.out.println("Sorted list: " + merged);

String[] array = convertToArray(merged);
System.out.print("Converted to array: [");
for (int i = 0; i < array.length; i++) {
    System.out.print(array[i]);
    if (i < array.length - 1) System.out.print(", ");
}
System.out.println("]");

