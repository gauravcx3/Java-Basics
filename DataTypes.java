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
  }
}