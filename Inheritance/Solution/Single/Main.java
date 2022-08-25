package Inheritance.Solution.Single;

public class Main {

  public static class child {

    public static void displayHello() {
      System.out.println("Hello");
    }
  }

  public static class parent extends child {

    public static void displayWorld() {
      System.out.println("World");
    }
  }

  public static void main(String[] args) {
    parent obj = new parent();
    parent.displayHello();
    parent.displayWorld();
  }
}
