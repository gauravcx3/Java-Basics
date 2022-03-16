public class CommandLineArgs {
  public static void main(String[] args) {
    // args is an array of Strings, each String is a command line argument.
    if (args.length == 0) {
      System.out.println("No arguments were passed");
    } else {
      // --> (to run) - java CommandLineArgs Hello How Are You - (3 arguments)
      // for-each loop, iterates over each element in the array.
      for (String arg : args) {
        System.out.println(arg);
      }
    }
  }
}
