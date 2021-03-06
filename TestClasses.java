// Classes start with capital letters and are the same as the file name.
public class TestClasses {
  // --> Classes can contain fields(variables) and methods.
  // --> Fields are variables that belong to a class.
  String[] fruits;
  String[] colors;
  String favouriteFruit;

  // --> Constructors are special methods that are called when an object is
  // created.
  // --> Constructors are used to initialize the state of an object.
  // --> Constructors have the same name as the class and no return type.
  // --> Code in a constructor is run automatically when an object is created.
  // --> Empty constructors are created by default. (Unless we specify our own constructor).
  // --> Constructor that is empty is called the default constructor.
  // --> We can have multiple constructors. However, each must have an unique paramenter list.
  // --> Unique parameter lists are used to differentiate between constructors. (Overloading)
  // --> Unique parameter list - Different number of parameters/Different parameter types. (Different Signatures).
  // --> We can choose to make a constructor private. (Only accessible within the class).
  TestClasses() {
    fruits = new String[] { "Apple", "Banana", "Orange", "Watermelon" };
    colors = new String[] { "Red", "Yellow", "Orange", "Green" };
    favouriteFruit = "Watermelon";
  }

  // --> Methods are functions that belong to a class.
  // --> Methods are able to view and manipulate the state (fields and other
  // methods) within the same class.
  void showFruitColors() {
    for (int i = 0; i < fruits.length; i++) {
      System.out.println(fruits[i] + " is " + colors[i]);
    }
  }

  void showFavouriteFruit() {
    System.out.println("My favourite fruit is " + favouriteFruit);
  }

  // Using Classes
  public static void main(String[] args) {
    // Create a variable that can hold a reference to a Classes object.
    TestClasses myClass;
    // We have to use the (new) keyword to create an object.
    // We are creating a new instance of the Classes class.
    myClass = new TestClasses();

    // The reference to a new instance of Classes is stored in anotherInstance.
    TestClasses anotherInstance = new TestClasses();

    // Call the showFruitColors method of myClass instance.
    myClass.showFruitColors();
    myClass.showFavouriteFruit();
    // Accessing the leastFavouriteFruit field of myClass instance.
    myClass.favouriteFruit = "Apple";
    System.out.println("My favourite fruit is " + myClass.favouriteFruit);

    anotherInstance.showFavouriteFruit();
    // Variable anotherInstance is a reference to an instance of Classes.
    // Variable anoherInstance now has its reference changed to point to the same object instance as myClass.
    anotherInstance = myClass;
    anotherInstance.showFavouriteFruit();

    // Array of Classes
    // classArray is an array of references to instances of Classes. (3 references)
    TestClasses[] classArray = new TestClasses[3];

    // We still have to use the (new) keyword to create each of the individual instances.
    classArray[0] = new TestClasses();  
    classArray[1] = new TestClasses();  
    
    // We can access the fields of each instance in the array.
    classArray[0].favouriteFruit = "GreenApple";
    classArray[1].favouriteFruit = "GreenBanana";
    
    // We can can use a method to create a new instance of the Classes class.
    classArray[2] = TestClasses.createInstance("GreenLemon");

    // We can access the fields of each instance in the array.
    for (int i = 0; i < classArray.length; i++) {
      classArray[i].showFavouriteFruit();
    }

    // Using a for-each loop to access the fields of each instance in the array.
    for(TestClasses item:classArray)
    {
      item.showFavouriteFruit();
    }
    
    // Creating a new instance of the ClassMore outer class.
    Classes cmore = new Classes();

    // Creating a new instance of the ClassMore inner class (PublicBus).
    Classes.PublicBus publicBus = cmore.new PublicBus();

    publicBus.passengers = 30;
    publicBus.removePassengers(20);
    publicBus.checkPassengers();

    Classes.PrivateBus privateBus = cmore.new PrivateBus();

    // privateBus.passengers = 20;      // Error: The field ClassInterface.PrivateBus.passengers is not visible.
    privateBus.addPassengers(20);       // Works as method is not private.
    // privateBus.removePassengers(10); // Error: The method removePassengers(int) from the type ClassInterface.PrivateBus is not visible.
    privateBus.checkPassengers();

    // fare = 40, charge = 30d, discount = 20
    Classes.FareCalculator fareCalculator6 = cmore.new FareCalculator(40, 30d, 20);
    System.out.println(fareCalculator6.discount); // 20
    
    // Error: The constructor ClassMore.FareCalculator(int, boolean) is not visible
    // ClassMore.FareCalculator fareCalculator7 = new ClassMore.FareCalculator(50, true);
  }

  // This method creates a new instance of Classes and returns it.
  static TestClasses createInstance(String favFruit) {
    // Create a new instance of Classes.
    TestClasses newInstance = new TestClasses();
    // Set the favouriteFruit field of the new instance to favFruit.
    newInstance.favouriteFruit = favFruit;
    // Return the new instance.
    return newInstance;
  }
}
