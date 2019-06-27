class Bird {
  public String reproduction = "egg";
  public String outerCovering = "feather";

  public void flyUp() {
    System.out.println("Flying up...");
  }
  public void flyDown() {
    System.out.println("Flying down...");
  }
}

class Eagle extends Bird {
  public String name = "eagle";
  public int lifespan = 15;
}

class BirdSanctuary {
  Eagle eagle = new Eagle();

  public void list() {
    eagle.flyUp();
  }
}

class TestBirdSanctuary {
  public static void main(String []args) {
    BirdSanctuary birdSanctuary = new BirdSanctuary();

    birdSanctuary.list();
  }
}
