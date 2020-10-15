public class Dog {

  //Declare variables
  private String name;
  private String breed;
  private double weight;
  private String color;
  private boolean houseTrained;

  public Dog(String cName, String cBreed, double cWeight, String cColor, boolean cHouseTrained)
  {
    name = cName;
    breed = cBreed;
    weight = cWeight;
    color = cColor;
    houseTrained = cHouseTrained;
  }

  public String summary()
  {
    System.out.print(name + " is a " + breed + " with a weight of " + weight + " and a " + color + " colored fur coat. ");
    if (houseTrained)
    {
      System.out.println("It is house trained.");
    }
    else
    {
      System.out.println("It is not house trained");
    }
    return "filler_statement";
  }

  public String name()
  {
    System.out.println(name + " 🐶");
    return name + " 🐶";
  }

}