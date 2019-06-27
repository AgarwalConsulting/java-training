class Wing {
  public void flap() {
    System.out.println("flap flap");
  }
}

class Bird {
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

class Eagle extends Bird {
  public String name = "eagle";
  public int lifespan = 15;
}

class TestBird {
  public static void main(String []args) {
    Eagle eagle = new Eagle();

    eagle.flyUp();
  }
}
