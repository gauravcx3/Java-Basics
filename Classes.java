// Classes start with capital letters and are the same as the file name.
public class Classes {
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
  Classes() {
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
    Classes myClass;
    // We have to use the (new) keyword to create an object.
    // We are creating a new instance of the Classes class.
    myClass = new Classes();

    // The reference to a new instance of Classes is stored in anotherInstance.
    Classes anotherInstance = new Classes();

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
    Classes[] classArray = new Classes[3];

    // We still have to use the (new) keyword to create each of the individual instances.
    classArray[0] = new Classes();  
    classArray[1] = new Classes();  
    
    // We can access the fields of each instance in the array.
    classArray[0].favouriteFruit = "GreenApple";
    classArray[1].favouriteFruit = "GreenBanana";
    
    // We can can use a method to create a new instance of the Classes class.
    classArray[2] = Classes.createInstance("GreenLemon");

    // We can access the fields of each instance in the array.
    for (int i = 0; i < classArray.length; i++) {
      classArray[i].showFavouriteFruit();
    }

    // Using a for-each loop to access the fields of each instance in the array.
    for(Classes item:classArray)
    {
      item.showFavouriteFruit();
    }
  }

  // This method creates a new instance of Classes and returns it.
  static Classes createInstance(String favFruit) {
    // Create a new instance of Classes.
    Classes newInstance = new Classes();
    // Set the favouriteFruit field of the new instance to favFruit.
    newInstance.favouriteFruit = favFruit;
    // Return the new instance.
    return newInstance;
  }
}
