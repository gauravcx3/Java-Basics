public class Inheritance {
  // Class Inheritance
  // --> Use the keyword "extends" to inherit from a class.
  // --> The class that you are inheriting from is called the superclass.
  // --> The class that is inheriting is called the subclass.
  // --> The subclass has the same features as the superclass.
  // --> The subclass may add more features.

  // Every class extends java object class automatically.
  public class Station{
    int stationID;
    int stationCapacity;

    public Station(int stationID, int stationCapacity){
      this.stationID = stationID;
      this.stationCapacity = stationCapacity;
    }

    public void showStation(){
      System.out.println("Station ID: " + stationID);
      System.out.println("Station Capacity: " + stationCapacity);
    }

    public void check(){
      System.out.println("Checking station...");
    }
  }

  // TaxiStand is a subclass of Station
  public class TaxiStand extends Station{
    int taxiStandCapacity;

    public TaxiStand(int stationID, int stationCapacity, int taxiStandCapacity){
      super(stationID, stationCapacity);
      this.taxiStandCapacity = taxiStandCapacity;
    }

    public void showTaxiStand(){
      System.out.println("Taxi Stand/Station ID: " + stationID);
      System.out.println("Taxi Stand Capacity: " + taxiStandCapacity);
    }

    // Method Overriding - Indicates that a method is overriding a method in a superclass.
    // --> Subclass method has the same name as the superclass method.
    // --> Subclass method will be used instead of the superclass method.
    @Override
    public void check(){
      System.out.println("Checking taxi stand...");
    }
  }

  public static void main(String[] args) {
    Inheritance inheritance = new Inheritance();
    TaxiStand myTaxiStand = inheritance.new TaxiStand(1, 100, 20);
    myTaxiStand.showStation();     // we can access the superclass methods
    myTaxiStand.showTaxiStand();

    Station myStation = inheritance.new TaxiStand(2, 200, 30);
    myStation.showStation();
    // myStation.showTaxiStand(); --> we cannot access the subclass methods or variables

    Station[] records = new Station[2];
    // records[0] = new Inheritance().new Station(1, 100);
    // --> we can add the superclass object to an array of superclass objects
    // --> we can also add the subclass object to an array of superclass objects
    records[0] = inheritance.new Station(1, 100);
    records[1] = inheritance.new TaxiStand(2, 2000, 300);
    // records[1].showTaxiStand(); // we cannot access the subclass methods or variables

    myTaxiStand.check();
    System.out.println(". . .");

    // We declared an array of type Object.
    Object[] myObj = new Object[2];
    // myObj[0] points to an intance of Station class.
    myObj[0] = inheritance.new Station(1, 100);
    // myObj[1] points to an intance of TaxiStand class.
    myObj[1] = inheritance.new TaxiStand(2, 2000, 300);

    // myObj[1].check();           // we cannot access the subclass methods or variables
    // We can cast the object to the subclass type.
    ((TaxiStand)myObj[1]).check();
    ((Station)myObj[0]).check();

    // Checking the type of the object.
    if (myObj[1] instanceof TaxiStand){
      System.out.println("myObj[1] is a an instance of TaxiStand");
    }
    TaxiStand myTaxiStand2 = (TaxiStand)myObj[1];
    myTaxiStand2.check();

    // Object Class Methods
    // --> clone() - Creates a new object that is a copy of the object. 
    //     (Duplicate of the current object instance).
    // --> hashCode() - Returns a hash code value for the current instance/object.
    // --> getClass() - Returns the class of the current instance/object.
    // --> toString() - Returns a string representation of the current instance/object.
    // --> equals() - Compares the current instance/object with the specified object/instance.
  }

}
