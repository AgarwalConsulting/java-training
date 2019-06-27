// Code from: https://raygun.com/blog/oop-concepts-java/

public class TestEagle {
  public static void main(String[] args) {
    Eagle myEagle = new Eagle();

    System.out.println("Name: " + myEagle.name); 			System.out.println("Reproduction: " + myEagle.reproduction);
    System.out.println("Outer covering: " + myEagle.outerCovering);
    System.out.println("Lifespan: " + myEagle.lifespan);
    myEagle.flyUp();
    myEagle.flyDown();
  }
}
