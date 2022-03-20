public class TestStatic {
  
  public static void main(String[] args) {
    StaticCode instance1 = new StaticCode();
    StaticCode instance2 = new StaticCode();
    System.out.println(instance1.staticNumber + ", " + instance2.staticNumber);

    instance1.instanceNumber = 200;
    instance2.instanceNumber = 300;

    instance1.staticNumber = 30;
    // staticNumber is shared by all instances of StaticCode
    System.out.println(instance1.staticNumber + ", " + instance2.staticNumber);
    System.out.println(instance1.instanceNumber + ", " + instance2.instanceNumber);

    // Correct way to change staticNumber. (No need to create an instance.)
    StaticCode.staticNumber = 40; 
    System.out.println(StaticCode.staticNumber);
  }

}
