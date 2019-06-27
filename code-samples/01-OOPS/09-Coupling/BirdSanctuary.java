import java.util.*;

public class BirdSanctuary {
  List<Bird> birds = new ArrayList<Bird>();

  public void addBird(Bird bird) {
    birds.add(bird);
  }

  public void flyAll() {
    for ( Bird bird : birds ) {
      bird.fly();
    }
  }
}
