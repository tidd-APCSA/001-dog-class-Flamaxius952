public class Main {
  public static void main(String[] args) {
    // test your code here by creating a three different dogs from the Dog class. Be sure you give each dog different characteristics. 
    Dog dog1 = new Dog("name1", "breed1", 50.00, "Color1", true);
    Dog dog2 = new Dog("name2", "breed2", 55.00, "Color2", false);
    Dog dog3 = new Dog("name3", "breed3", 60.00, "Color3", true);

    dog1.summary();
    dog2.summary();
    dog3.summary();

    dog1.name();
  }
}