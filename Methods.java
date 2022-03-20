public class Methods {
  // Method: printHello
  // Parameters: name - String (type of input parameter)
  // Returns: void - does not return a value (type of return value)
  void printHello(String name) {
    System.out.println("Hello" + " " + name);
  }

  // static method - can be called without creating an object
  // all instances of the class share the same static variables
  // static methods can only access static members/
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

  int totalCapacity = 10;
  static int currentCapacity = 0;
  static int items;

  public class publicBus{
    int busNumber;
    String busName;

    publicBus(int busNumber, String busName){
      this.busNumber = busNumber;
      this.busName = busName;
    }
  }

  // changes to members are visible within method and also outside method.
  public void swapBusNumbers(publicBus bus1, publicBus bus2){
    int temp = bus1.busNumber;
    bus1.busNumber = bus2.busNumber;
    bus2.busNumber = temp;
  }

  // parameters are passed by reference
  // changes to the reference will be visible within the method but not outside the method.
  public void swapBusReferences(publicBus bus1, publicBus bus2){
    // changes do not persist outside the method
    publicBus temp = bus1;
    bus1 = bus2;
    bus2 = temp;
  }

  public static void main(String[] args) {
    Methods methods = new Methods();    // create an object of the class
    methods.printHello("Batman");       // call the method

    Methods.printHi();                  // call the static method using the class name

    int sum = Methods.addNumbers(5, 10);
    System.out.println(sum);

    Methods.publicBus bus1 = methods.new publicBus(1, "bus1");
    Methods.publicBus bus2 = methods.new publicBus(2, "bus2");
    System.out.println(String.format("bus1: %d, bus2: %d", bus1.busNumber, bus2.busNumber));
    System.out.println(String.format("bus1: %s, bus2: %s", bus1.busName, bus2.busName));
    
    methods.swapBusNumbers(bus1, bus2);
    System.out.println(String.format("\nbus1: %d, bus2: %d", bus1.busNumber, bus2.busNumber));
    System.out.println(String.format("bus1: %s, bus2: %s", bus1.busName, bus2.busName));
  
    Methods.publicBus bus3 = methods.new publicBus(3, "bus3");
    Methods.publicBus bus4 = methods.new publicBus(4, "bus4");
    System.out.println(String.format("\nbus3: %d, bus4: %d", bus3.busNumber, bus4.busNumber));
    System.out.println(String.format("bus3: %s, bus4: %s", bus3.busName, bus4.busName));
    System.out.println(bus1);
    System.out.println(bus2);

    methods.swapBusReferences(bus3, bus4);
    System.out.println(String.format("\nbus3: %d, bus4: %d", bus3.busNumber, bus4.busNumber));
    System.out.println(String.format("bus3: %s, bus4: %s", bus3.busName, bus4.busName));
    System.out.println(bus1);
    System.out.println(bus2);
  }
}
