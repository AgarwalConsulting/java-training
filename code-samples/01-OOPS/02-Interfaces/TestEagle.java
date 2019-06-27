// Code from: https://raygun.com/blog/oop-concepts-java/

public class TestEagle {
  public static void main(String[] args) {
    Eagle myEagle = new Eagle();

    myEagle.eat();
    myEagle.sound();
    myEagle.fly();

    System.out.println("Number of legs: " + Bird.numberOfLegs);
    System.out.println("Outer covering: " + Bird.outerCovering);
  }
}
