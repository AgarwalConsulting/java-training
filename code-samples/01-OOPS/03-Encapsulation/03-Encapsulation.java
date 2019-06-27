// Code from: https://raygun.com/blog/oop-concepts-java/

class Animal {
  private String name;
  private double averageWeight;
  private int numberOfLegs;

  // Getter methods
  public String getName() {
    return name;
  }
  public double getAverageWeight() {
    return averageWeight;
  }
  public int getNumberOfLegs() {
    return numberOfLegs;
  }

  // Setter methods
  public void setName(String name) {
    this.name = name;
  }
  public void setAverageWeight(double averageWeight) {
    this.averageWeight = averageWeight;
  }
  public void setNumberOfLegs(int numberOfLegs) {
    this.numberOfLegs = numberOfLegs;
  }
}

public class TestAnimal {
  public static void main(String[] args) {
    Animal myAnimal = new Animal();

    myAnimal.setName("Eagle");
    myAnimal.setAverageWeight(1.5);
    myAnimal.setNumberOfLegs(2);

    System.out.println("Name: " + myAnimal.getName());
    System.out.println("Average weight: " + myAnimal.getAverageWeight() + "kg");
    System.out.println("Number of legs: " + myAnimal.getNumberOfLegs());
  }
}
