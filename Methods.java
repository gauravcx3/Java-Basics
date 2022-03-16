public class Methods {
  // Method: printHello
  // Parameters: name - String (type of input parameter)
  // Returns: void - does not return a value (type of return value)
  void printHello(String name) {
    System.out.println("Hello" + " " + name);
  }

  // static method - can be called without creating an object
  static void printHi() {
    System.out.println("Hi");
  }

  // Parameters: num1 - int, num2 - int
  // Returns: int - the sum of num1 and num2
  // Local variables lose scope after the method ends (no longer accessible)
  // --> Methods can accept arrays or other objects as parameters
  // --> Methods can return arrays or other objects
  static int addNumbers(int num1, int num2) {
    return num1 + num2;
  }

  public static void main(String[] args) {
    Methods methods = new Methods();    // create an object of the class
    methods.printHello("Batman");       // call the method

    Methods.printHi();                  // call the static method using the class name

    int sum = Methods.addNumbers(5, 10);
    System.out.println(sum);
  }
}
