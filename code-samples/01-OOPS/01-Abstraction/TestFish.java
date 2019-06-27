// Code from: https://raygun.com/blog/oop-concepts-java/

public class TestFish {
  public static void main(String[] args) {
    Animal myFish = new Fish();

    myFish.label();
    myFish.move();
    myFish.eat();
  }
}
