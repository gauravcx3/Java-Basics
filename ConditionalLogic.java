public class ConditionalLogic {
  public static void main(String[] args) {
    int a = 10;
    int b = 20;
    // Relational Operators
    boolean j;      // boolean variable
    j = a > b;      // greater than
    j = a < b;      // less than
    j = a >= b;     // greater than or equal to
    j = a <= b;     // less than or equal to
    j = a == b;     // equal to
    j = a != b;     // not equal to
    
    // Conditional Assignment
    // result = (condition) ? true-value : false-value;
    // result = (condition) ? true-statement : false-statement;
    int val1 = 1;
    int val2 = 2;
    int result = (val1 > val2) ? val1 : val2; // result = val2, since val1 is not greater than val2
    int result2 = (val1 > val2) ? val1 - 1 : val2 + 1; // result2 = val2 + 1, since val1 is not greater than val2

    // if-else Statements (Chained)
    // --> Evaluated in order from top to bottom
    // --> First if-statement to test true is executed
    // --> If all if-statements are false, then else-statement is executed
    // --> If else-statement is not present, then no statement is executed
    int c = 30;
    int d = 40;
    int e = 50;
    int f = 60;
    int g = 70;
    if (d > g){
      System.out.println("d is greater than g");
    }
    else if (d > f){
      System.out.println("d is greater than f");
    }
    else if (d > e){
      System.out.println("d is greater than e");
    }
    else if (d > c){
      System.out.println("d is greater than c");
    }
    else{
      System.out.println("d is not greater than any of the other values");
    }

    // Logical Operators
    if ((a > b) && (c > d)){      // && - and operator - both must be true
      System.out.println("a is greater than b AND c is greater than d");
    }
    if ((a > b) || (c > d)){      // || - or operator - at least one must be true
      System.out.println("a is greater than b OR c is greater than d");
    }
    if (!(a > b)){                // ! - not operator - opposite of boolean value
      System.out.println("a is not greater than b");
    }
    if ((a > b) ^ (c > d)){       // ^ - exclusive or operator - only one must be true
      System.out.println("a is greater than b XOR c is greater than d");
    }

    // Bitwise Operators
    // & - bitwise AND operator - both bits must be true
    // | - bitwise OR operator - at least one bit must be true
    // ^ - bitwise XOR operator - only one bit must be true
    // ~ - bitwise NOT operator - inverts all bits
    // << - bitwise left shift operator - shifts bits to the left
    // >> - bitwise right shift operator - shifts bits to the right
    // >>> - bitwise zero fill right shift operator - shifts bits to the right and fills with zeros
    // <<< - bitwise zero fill left shift operator - shifts bits to the left and fills with zeros
 
    // Switch Statements
    // --> Tests a value against a set of matching values
    // --> If value matches, then statement is executed
    // --> End each case with a break statement. Otherwise, the next case is executed regardless of the value.
    // --> If none of the values match, then default statement is executed
    // --> Only Primitive types supported are byte, short, int, long and char.
    switch(a){
      case 10:
        System.out.println("a is 10");
        break;
      case 20:
        System.out.println("a is 20");
        break;
      case 33:
        System.out.println("a is 30");
        break;
      default:
        System.out.println("a is not 10, 20 or 30.");
    }
  }
}
