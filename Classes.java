public class Classes {
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

  // Initialization Blocks
  // --> Code that is run when an object is created. (Before the constructor is called).
  // --> Cannot receive parameters.
  // --> Place code within curly braces outside of any method or constructor.
  // --> A class can have multiple initialization blocks. (Executed from top to bottom).
  // --> All initialization blocks are executed before any other code.

  public class PublicBus{
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

  public class PrivateBus{
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
  }
    public class FareCalculator{
      int fare;
      double charge;
      int discount;
      int specialDiscount1;
      int specialDiscount2;
      int specialDiscount3;
      int specialDiscount4;

      // Initialization Block - runs when an object is created.
      {
        specialDiscount1 = 10;
        specialDiscount2 = 20;
        specialDiscount3 = 30;
        specialDiscount4 = 40;
      }

      public FareCalculator(){
        fare = 10;
        charge = 0.5;
        discount = 0;
      }

      public FareCalculator(int fare){
        this.fare = fare;
        this.charge = 1.5;
      }

      // Chaining Constructors. (Must be the first line of code in the constructor.)
      public FareCalculator(int fare, double charge){
        this(fare);                    // Call the other constructor that takes in a fare.
        this.charge = charge;
      }

      public FareCalculator(double charge){
        // If charge is greater than 20, set fare to 30, otherwise set fare to 40.
        this(charge > 20 ? 30 : 40);   // Call the other constructor that takes in a fare.
        this.charge = charge;
      }

      private FareCalculator(int discount, boolean isDiscounted){
        this.discount = isDiscounted == true ? discount : 0;
      }

      public FareCalculator(int fare, double charge, int discount){
        this(discount, true);          // Call the other constructor that takes in a discount and a boolean.
        this.fare = fare;
        this.charge = charge;
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

      Classes cmore = new Classes();

      FareCalculator fareCalculator = cmore.new FareCalculator();           // fare = 10
      fareCalculator.addFare(10);                                           // this.fare = 10 + 10 = 20

      FareCalculator fareCalculator2 = cmore.new FareCalculator(30);        // fare = 30
      fareCalculator2.addFare(10);                                          // this.fare = 30 + 10 = 40

      // FareCalculator2 is null. (object is not created yet)
      FareCalculator fareCalculator3 = null; 
      System.out.println(fareCalculator3);

      FareCalculator fareCalculator4 = cmore.new FareCalculator(30, 10.0d); // fare = 30, charge = 10.0d
      fareCalculator4.addFare(10);                                          // this.fare = 30 + 10 = 40
      System.out.println(fareCalculator4.charge);

      FareCalculator fareCalculator5 = cmore.new FareCalculator(20.0d);     // fare = 40, charge = 20.0d
      fareCalculator5.addFare(10);                                          // this.fare = 40 + 10 = 50
      System.out.println(fareCalculator5.charge);
    }
  
  // Interfaces
  // --> Model data type behavior (without implementation)
  // --> Create contracts between data types (how they should interact)
}

