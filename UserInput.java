import java.util.Scanner;

public class UserInput {
  public static void main(String[] args) {
    // Scanner
    // --> used to read input from user
    // --> type must be same as type of variable
    // --> use System.in to read input from keyboard
    // --> use nextInt() to read integer input
    // --> use nextDouble() to read double input
    // --> use nextLine() to read line of input
    // --> use nextBoolean() to read boolean input
    // --> use next() to read any type of input
    // --> Input is read from console after user enters the input and presses enter.
    // --> use close() to close scanner
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = input.nextInt();
    System.out.println("You entered " + number);

    input.nextLine(); // clear the buffer - to read the next line.

    System.out.print("Enter a string: ");
    String name = input.nextLine();
    System.out.println("You entered " + name);
    input.close();
  }
}
