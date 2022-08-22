/**
 * Polymorphism
 *
 * Task 1:
 * create a class Product
 *
 * Task 2:
 * create object of Product in Main function called p
 *
 * Task 3:
 * create a method of following defination
 * public int product(int x, int y) {}
 *
 * call this method from Main using Product class object p
 *
 * Task 4:
 * create a Overloaded method product of following defination
 * public int product(int x, int y, int z) {}
 *
 * call this method also from Main using Product class object p
 *
 * Task 5:
 * create a Overloaded method product of following defination
 * public double product(double x, double y) {}
 *
 * call this method also from Main using Product class object p
 *
 * Observations:
 * This class contains 3 classes with same name, but it complie & run successfully
 *
 */

/**
 * Solution
 */

package Polymorphism;

public class Main {

  public static class Product {

    public int product(int x, int y) {
      return (x * y);
    }

    public int product(int x, int y, int z) {
      return (x * y * z);
    }

    public double product(double x, double y) {
      return (x * y);
    }
  }

  // Driver code
  public static void main(String args[]) {
    Product p = new Product();
    System.out.println(p.product(2, 5));
    System.out.println(p.product(2, 3, 5));
    System.out.println(p.product(1.1, 2.5));
  }
}
