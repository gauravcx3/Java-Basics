public class ClassInterface {
  // Classes
  // --> Contain state (multiple pieces of data that work together)
  // --> Contain code to manipulate the state (data and code operating on it)
  // --> Allow creation of custom data types

  // Encapsulation and Access Modifiers
  // --> The implemention details of a class are generally hidden - this is called encapsulation.
  // --> Access level modifiers are used to control the visibility of classes and their members.
  
  // Basic Access Modifiers (for classes and members)
  //      -Modifier              -Visibility                     -Usable on Classes             -Usable on Members
  // -->  -No access modifier    -Only within its own package.   -Y                             -Y
  //                              (a.k.a. package private)
  // -->  -public                -Everywhere                     -Y                             -Y
  // -->  -private               -Only within its own class.     -N*                            -Y
  //                                                             (-Top-level classes cannot
  //                                                               be private.
  //                                                              -Private is available to 
  //                                                               nested classes.)

  // Accessors and Mutators
  // --> Fields (variables) of a class are set to private to prevent direct access to them - e.g. private int age;
  // --> Accessor retrieves field value (getter) - e.g. getFieldValue().
  // --> Mutator modifies field value (setter) - e.g. setFieldValue(value).

  // Special References
  // this - Implicit reference to current object. Allows an object to pass itself as a parameter. (class variable).
  // null - Represents an uncreated object.

  static public class PublicBus{
    public int passengers;

    // Constructor - special method that is called when an object is created.
    public PublicBus(){
      passengers = 0;
    }

    void addPassengers(int amount){
      passengers = passengers + amount;
    }

    void removePassengers(int amount){
      passengers = passengers - amount;
    }

    void checkPassengers(){
      System.out.println("There are " + passengers + " passengers on the bus.");
    }
  }

  static public class PrivateBus{
    // Cannot be accessed outside of the class.
    private int passengers;

    // Constructor - A special method that is called when an object is created.
    public PrivateBus(){
      passengers = 0;
    }

    // Can be accessed outside of the class.
    public void addPassengers(int amount){
      passengers = passengers + amount;
    }

    // Cannot be accessed outside of the class.
    private void removePassengers(int amount){
      passengers = passengers - amount;
    }

    void checkPassengers(){
      System.out.println("There are " + passengers + " passengers on the bus.");
    }

    static public class FareCalculator{
      int fare;

      public FareCalculator(){
        fare = 10;
      }

      public void addFare(int amount){
        int fare = 90;
        int fareAmount1 = fare + amount;      // fareAmount1 = 90 + amount;
        // this.fare is the fare variable of the FareCalculator class.
        int fareAmount2 = this.fare + amount; // fareAmount2 = 10 + amount;
        System.out.println("The fare inside addFare is " + fare + " - " + fareAmount1);
        System.out.println("The fare inside FareCalculator (this.fare) is " + this.fare + " - " + fareAmount2);
      }
    }

    public static void main(String[] args){
      FareCalculator fareCalculator = new FareCalculator();
      fareCalculator.addFare(10);

      FareCalculator fareCalculator2 = null; // FareCalculator2 is null. (object is not created yet)
      System.out.println(fareCalculator2);
    }
  }

  // Interfaces
  // --> Model data type behavior (without implementation)
  // --> Create contracts between data types (how they should interact)
}

