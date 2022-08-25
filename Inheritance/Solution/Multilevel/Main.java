package Inheritance.Solution.Multilevel;

class Main {

  public static class one {

    public void displayHello() {
      System.out.println("Hello");
    }
  }

  public static class two extends one {

    public void displayHi() {
      System.out.println("Hi");
    }
  }

  public static class three extends two {

    public void displayBye() {
      System.out.println("Bye");
    }
  }

  public static void main(String[] args) {
    three obj = new three();
    obj.displayHello();
    obj.displayHi();
    obj.displayBye();
  }
}
