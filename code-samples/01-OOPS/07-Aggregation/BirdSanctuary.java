import java.util.*;

public class BirdSanctuary {
  List<Eagle> birds = new ArrayList<Eagle>();

  BirdSanctuary() {
    System.out.println("Adding an eagle...");
    birds.add(new Eagle());
  }

  public void list() {
    System.out.println("Flying all birds...");
    for (Eagle bird : birds) {
      bird.flyUp();
    }
  }
}
