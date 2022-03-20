public class StaticCode {
  // Static Members
  // --> Field - a variable that is shared by all objects/instances of a class.
  // --> Method - a function/action that is shared by all objects/instances of a class.
  // --> Static Methods can only access static members.

  static int staticNumber = 10;
  int instanceNumber = 0;

  static int staticInt1;
  static int staticInt2;
  static int staticInt3;

  // Static Initialization Block - runs before any other code in the class. (No need to create an instance.)
  static {
    staticInt1 = 1;
    staticInt2 = 2;
    staticInt3 = 3;
  }
  
  static void printStaticNumber() {
    System.out.println(staticNumber);
    // System.out.println(instanceNumber); // Error: Cannot make a static reference to the non-static field.
  }
}
