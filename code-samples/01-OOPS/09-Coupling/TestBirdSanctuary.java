public class TestBirdSanctuary {
  public static void main(String []args) {
    BirdSanctuary birdSanctuary = new BirdSanctuary();

    birdSanctuary.addBird(new Eagle());
    birdSanctuary.addBird(new HummingBird());

    birdSanctuary.flyAll();
  }
}
