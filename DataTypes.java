public class DataTypes{
  public static void main(String[] args){
    int a;
    a = 1;
    int b = 2;
    int c = a + b;

    // Once value is set for the first time cannot be changed later.
    final int fixed;
    fixed = 3;
    
    // Primitive data types

    // Interger Types
    byte myByte = 12;               // 8 bits, -128 to 127
    short myShort = 1234;           // 16 bits, -32,768 to 32,767
    int myInt = 123456789;          // 32 bits, -2,147,483,648 to 2,147,483,647
    long myLong = 123456789012345L; // 64 bits, -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

    // Floating Point Types
    float myFloat = 12.34f;         // 32 bits, 4 bytes, -3.4028235E38 to 3.4028235E38
    double myDouble = 12.34;        // 64 bits, 8 bytes, -1.7976931348623157E308 to 1.7976931348623157E308
    double myDouble2 = 12.34d;      // may add d to indicate double

    // Character Types
    char myChar = 'a';              // 16 bits, 2 bytes, 0 to 65,535
    char myChar2 = '\u0061';        // Unicode character for 'a'

    // Boolean Types
    boolean myBoolean = true;       // 8 bits, 1 byte, true or false

    // Type Conversion
    // Implicit type conversion - automatically done by compiler
    int a2 = 1;
    double b2 = a2;

    // Widening conversions are performed automatically for Implicit type conversion
    // -->Mixed integer sizes - compiler will choose the largest integer in equation
    // -->Mixed float sizes - compiler will choose the largest size (double)
    // -->Mixed integer and float sizes - compiler will choose the largest floating point in equation

    // Explicit type conversion - explicitly done with cast operator
    double c2 = 1.0;
    int d2 = (int) c2; // (int) is the cast operator

    // Can perform widening or narrowing conversions or Explicit type conversion
    // -->Narrowing conversions - Significant bits may be lost
    // -->Floating point to integer - Fractal portion is discarded
    // -->Integer to floating point - Precision may be lost

    // Primitive wrapper classes
    // --> Can hold primitive data values
    // --> Provides methods
    
    // Each primitive type has a corresponding wrapper class
    // Corresponding to Integer Types
    Byte myByte2 = 12;
    Short myShort2 = 1234;
    Integer myInt2 = 123456789;
    Long myLong2 = 123456789012345L;
    
    // Corresponding to Floating Point Types
    Float myFloat2 = 12.34f;
    Double myDouble3 = 12.34;

    // Corresponding to Character Types
    Character myChar3 = 'a';

    // Corresponding to Boolean Types
    Boolean myBoolean2 = true;

    // Methods allow us to do common operations such as - 
    // --> Converting to/from other types
    // --> Extracting values from strings
    // --> Finding min/max values
    // --> Many others

    // Example of converting from a string to an integer
    String myString = "123";
    int myInt3 = Integer.parseInt(myString); 
    System.out.println(myInt3);
  }
}