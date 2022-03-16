public class Strings {
  public static void main(String[] args) {
    // Strings are immutable - cannot be changed
    // name holds the reference to the String object - not the String itself.
    String name = "Batman";
    // Strings support concatenation using the + operator.
    String greeting = "Hello" + " " + name;
    System.out.println(greeting);

    // Checking for String equality
    String greeting2 = "Hello Batman";
    System.out.println(greeting == greeting2);      // false - they refer to different object references
    System.out.println(greeting.equals(greeting2)); // true - checks if the string values are equal
  
    String greeting3 = greeting2.intern();          // intern() method returns the same object reference
    System.out.println(greeting3 == greeting2);     // true - they refer to the same object reference
  
    // String Class Methods
    // Length
    int strLength = greeting.length();              // returns the length of the string
    
    // Create a new string(s) from existing
    String str1 = greeting.concat("!");             // concatenates the string
    String str2 = greeting.replace("Batman", "Superman"); // replaces the string
    String str3 = greeting.toUpperCase();           // converts the string to uppercase
    String str4 = greeting.toLowerCase();           // converts the string to lowercase
    String str5 = greeting.trim();                  // removes leading and trailing whitespace
    String str6 = greeting.split(" ")[0];           // splits the string by the given delimiter and returns the first element
    
    // Extract substring
    String str7 = greeting.substring(0, 5);         // returns the substring from the given start index to the given end index(exclusive)
    String str8 = greeting.substring(5);            // returns the substring from the given start index to the end of the string
    char ch1 = greeting.charAt(0);                  // returns the character at the given index

    // Test substring                               
    Boolean str9 = greeting.contains("Batman");     // returns true if the substring is contained in the string
    Boolean str10 = greeting.endsWith("Batman");    // returns true if the substring is at the end of the string
    Boolean str11 = greeting.startsWith("Hello");   // returns true if the substring is at the start of the string
    int findFirst = greeting.indexOf("Hello");      // returns the index of the first occurrence of the substring/character
    int findLast = greeting.lastIndexOf("Batman");  // returns the index of the last occurrence of the substring/character
  
    // comparison
    Boolean str12 = greeting.equals(greeting2);     // returns true if the string values are equal
    Boolean str13 = greeting.equalsIgnoreCase(greeting2); // returns true if the string values are equal ignoring case
    Boolean str14 = greeting.isEmpty();             // returns true if the string is empty
    int str15 = greeting.compareTo(str2);           // returns 0 if equal, -1 if lexographically less than, 1 if greater than.
    int str16 = greeting.compareToIgnoreCase(str2); // returns 0 if equal, -1 if lexographically less than, 1 if greater than (ignoring case).
  
    // Formatting
    String str17 = String.format("%s %s", "Hello", "Batman"); // returns a formatted string

    // String for non-string values
    String str18 = String.valueOf(4 * 4);           // returns the string representation of the given value
    String str19 = String.valueOf(true);            // returns the string representation of the given boolean
    String str20 = String.valueOf('A');             // returns the string representation of the given character
    System.out.println(str18 + " " + str19 + " " + str20);
  
    // String Builder
    // --> Can 
    StringBuilder sb = new StringBuilder(10);       // creates a new string builder with the given capacity (optional)
    sb.append("Hello");                             // appends the given string to the string builder
    int sbLength = sb.length();                     // returns the length of the string builder
    sb.append(4 * 4);                               // appends the given value to the string builder
    sb.insert(sbLength, "Batman");                  // inserts the given string at the given index
    String message = sb.toString();                 // returns the string representation of the string builder
    System.out.println(message);
  
    //String Builder Methods
    // --> append()       - appends the given string to the string builder
    // --> insert()       - inserts the given string at the given index
    // --> delete()       - deletes the given substring from the string builder
    // --> reverse()      - reverses the string builder
    // --> replace()      - replaces the given substring with the given string
    // --> capacity()     - returns the capacity of the string builder
    // --> length()       - returns the length of the string builder
    // --> setLength()    - sets the length of the string builder
    // --> charAt()       - returns the character at the given index
    // --> indexOf()      - returns the index of the given substring
    // --> lastIndexOf()  - returns the index of the last occurrence of the given substring
    // --> substring()    - returns the substring from the given start index to the given end index
    // --> trim()         - removes leading and trailing whitespace
    // --> deleteCharAt() - deletes the character at the given index
    // --> toString()     - returns the string representation of the string builder

    // String Formatting
    // --> %s - String
    // --> %d - Integer
    // --> %f - Float
    // --> %c - Character
    // --> %b - Boolean
    String str21 = String.format("%d plus %d is %d.", 1, 2, 1 + 2);
    System.out.println(str21);

    // String Format specifiers
    // --> %.2f - rounds to 2 decimal places
    String str22 = String.format("%.1f plus %.2f is %.3f.", 1.111, 2.222, 1.111 + 2.222);
    System.out.println(str22);

    // --> %[argument index][flags][width][precision] conversion

    //Common Format Conversions
    // --> d      - Decimal             - Integral (type)       - 32 (input)      - 32 (result)
    // --> x or X - Hex                 - Integral (type)       - 32 (input)      - 20 (result)
    // --> f      - Decimal             - Floating Point (type) - 123.0 (input)   - 123.000000 (result)
    // --> e or E - Scientific Notation - Floating Point (type) - 123.0 (input)   - 1.230000e+02 (result)
    // --> s      - String              - General (type)        - "Hello" (input) - Hello (result)
  
    // Format Flags
    // --> #      - Include radix
    String str23 = String.format("%x", 32);
    String str24 = String.format("%#x", 32);
    System.out.println(str23 + " <--> " + str24);
    // Width and Format Flags
    // (_d) number of characters to display (number before the d)
    String str25 = String.format("A:%4d B:%4d", 1, 1000);
    String str26 = String.format("A:%4d B:%4d", 1000, 1);
    System.out.println(str25);
    System.out.println(str26);
    // (0) padding (pad with zeros before the d)
    String str27 = String.format("C:%04d D:%04d", 1, 1000);
    String str28 = String.format("C:%04d D:%04d", 1000, 1);
    System.out.println(str27);
    System.out.println(str28);
    // (-) flag (left justify) / (+) flag (right justify)
    String str29 = String.format("E:%-4d F:%-4d", 1, 1000);
    String str30 = String.format("E:%-4d F:%-4d", 1000, 1);
    System.out.println(str29);
    System.out.println(str30);
    // (,) flag (grouping)
    String str31 = String.format("%,d", 123456789);
    String str32 = String.format("%,.4f", 123456789.0d);
    System.out.println(str31);
    System.out.println(str32);
    // _(space), + and ( flags
    // _(space) flag adds a space before positive numbers
    // + flag adds a plus or minus sign before numbers
    // ( flag adds parentheses around negative numbers
    int pos = 123, neg = -123;
    String str33 = String.format("% d", pos); // _(space) flag (adds a space)
    String str34 = String.format("% d", neg); // _(space) flag (shows minus sign)
    System.out.println(str33);
    System.out.println(str34);
    String str35 = String.format("%+d", pos); // + flag (adds a plus sign)
    String str36 = String.format("%+d", neg); // + flag (shows minus sign)
    System.out.println(str35);
    System.out.println(str36);
    String str37 = String.format("%(d", pos); // ( flag (no change for positive numbers)
    String str38 = String.format("%(d", neg); // ( flag (adds parenthesis for negative numbers)
    System.out.println(str37);
    System.out.println(str38);
    String str39 = String.format("% (d", pos); // adds a space if no parenthesis
    System.out.println(str39);
  }
}