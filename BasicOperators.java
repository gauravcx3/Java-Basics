public class BasicOperators {
  public static void main(String[] args) {
    //Basic Operators
    int a = 1;      // assignment operator
    int b = 2;
    int c = a + b;  // addition operator
    int d = a - b;  // subtraction operator
    int e = a * b;  // multiplication operator
    int f = a / b;  // division operator
    int g = a % b;  // modulus operator, remainder of division
    int g2 = 8 % 3; // gives remainder 2

    // Increment and Decrement Operators
    // postfix - applies operation after returning value
    int h = 1;
    h++;            // postfix increment operator
    h--;            // postfix decrement operator

    // prefix - applies operation before returning value
    ++h;            // prefix increment operator
    --h;            // prefix decrement operator

    // Compound Assignment Operators
    int i = 1;
    i += 2;         // i = i + 2
    i -= 2;         // i = i - 2
    i *= 2;         // i = i * 2
    i /= 2;         // i = i / 2
    i %= 2;         // i = i % 2
    // more advanced example
    i /= 2 * 3;     // i = i / (2 * 3)

    // Operator Precedence
    // --> Postfix, Prefix, Multiplicative, Additive 
    // --> For equal precedence, left to right
    // --> Parentheses are used to override precedence
    // --> Nested parenthesis evaluated from inside out    
  }
  
}
