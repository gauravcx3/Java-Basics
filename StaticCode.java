public class StaticCode {
  // Static Members
  // --> Field - a variable that is shared by all objects/instances of a class.
  // --> Method - a function/action that is shared by all objects/instances of a class.
  // --> Static Methods can only access static members.

  static int staticNumber = 10;
  int instanceNumber = 0;

  static void printStaticNumber() {
    System.out.println(staticNumber);
    // System.out.println(instanceNumber); // Error: Cannot make a static reference to the non-static field.
  }
}
