public class LoopsArrays {
  public static void main(String[] args) {
    int someValue = 4;
    int factorial = 1;
    // While Loop
    // --> condition is checked before loop is executed
    while (someValue > 1) {
      factorial = factorial * someValue;
      someValue = someValue - 1;
    }
    System.out.println("Factorial of 4 is " + factorial);

    int anotherValue = 4;
    // Do-While Loop
    // --> condition is checked after loop is executed
    // --> loop is executed at least once
    do {
      System.out.println("Value is " + anotherValue);
      anotherValue = anotherValue - 1;
    } while (anotherValue > 1); // exits loop when condition is false

    // For Loop
    // --> condition is checked before loop is executed
    // for (initialization; condition; increment) { loop body }
    for (int i = 0; i < 5; i++) {
      System.out.println("Value of i is " + i);
    }

    // For-Each Loop
    // --> used to iterate over arrays/collections
    // --> type must be same as type of array/collection
    // for (type variable : collection) { loop body }
    int[] intVals = {1, 2, 3, 4, 5};
    for (int number : intVals) {
      System.out.println("Value of number is " + number);
    }

    // Arrays
    // type[] arrayName = new type[size];
    // --> array index starts at 0.
    float[] arrayFloats = {1.1f, 2.2f, 3.3f};
    double[] arrayDouble = new double[arrayFloats.length];
    arrayDouble[0] = 1.1d;
    arrayDouble[1] = 2.2d;

    // Example of iterating over an array
    int[] intArray = {1, 2, 3};
    for (int i = 0; i < intArray.length; i++) {
      switch (intArray[i]) {
        case 1:
          System.out.println("Value is 1");
          break;
        case 2:
          System.out.println("Value is 2");
          break;
        default:
          System.out.println("Value is not 1 or 2");
      }
    }

    for (int i = 0; i < 10; i++) {
      if (i == 2) {
        continue; // skips the rest of the loop
      }
      if (i == 5) {
        break;    // exits the loop
      }
      System.out.println("Value of i is " + i);
    }
  }
}
