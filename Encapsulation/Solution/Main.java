package Encapsulation.Solution;

public class Main {
  public static void main(String[] args) {
    RWOnly obj = new RWOnly();

    // As Private variable
    // obj.name = "Ritik";
    // System.out.println(obj.name);

    obj.setName("Ritik");
    System.out.println(obj.getName());
  }
}
