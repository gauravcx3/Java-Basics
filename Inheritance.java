public class Inheritance {
  // Class Inheritance
  // --> Use the keyword "extends" to inherit from a class.
  // --> The class that you are inheriting from is called the superclass.
  // --> The class that is inheriting is called the subclass.
  // --> The subclass has the same features as the superclass.
  // --> The subclass may add more features.

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
  }

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

  }

}
