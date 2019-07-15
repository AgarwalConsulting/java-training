import java.util.*;

public class Bird {
  public String reproduction = "egg";
  public String outerCovering = "feather";
  private List<Wing> wings;

  Bird() {
    this.wings = Arrays.asList(new Wing(), new Wing());
  }

  public void flyUp() {
    for (Wing wing : wings) {
      wing.flap();
    }
    System.out.println("Flying up...");
  }
  public void flyDown() {
    for (Wing wing : wings) {
      wing.flap();
    }
    System.out.println("Flying down...");
  }
}
