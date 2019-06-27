public class BirdSanctuary {
  List<Eagle> eagles = new ArrayList<Eagle>();
  List<HummingBird> hummingBirds = new ArrayList<HummingBird>();

  public void flyAll() {
    for(Eagle eagle : eagles) {
      eagle.fly();
    }

    for(HummingBird hummingBird : hummingBirds) {
      hummingBird.fly();
    }
  }
}
