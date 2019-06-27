// Code from: https://raygun.com/blog/oop-concepts-java/

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

class TestEagle {
	public static void main(String[] args) {
		Eagle myEagle = new Eagle();

		System.out.println("Name: " + myEagle.name); 			System.out.println("Reproduction: " + myEagle.reproduction);
		System.out.println("Outer covering: " + myEagle.outerCovering);
		System.out.println("Lifespan: " + myEagle.lifespan);
		myEagle.flyUp();
		myEagle.flyDown();
	}
}
