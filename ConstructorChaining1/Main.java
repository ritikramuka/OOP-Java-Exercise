/**
 * Constructor Chaining Method 1
 *
 * Task 1:
 * Create a class Namaste
 * 
 * Task 2:
 * Create a default constructor for class Namaste
 * 
 * Print following statement in this constructor:
 * System.out.println("The Default constructor says Namaste");
 * 
 * Task 3:
 * Invoke default constructor from main, by creating an object of class Namaste named as n
 * 
 * Task 4:
 * Now, create a parameterized constructor for class Namaste with 1 parameter: x(String)
 *
 * Print following statement in this constructor:
 * System.out.println("Namaste from " + x);
 * 
 * Task 5:
 * Invoke this parameterized constructor from default constructor
 * 
 * Task 6:
 * Now, create a parameterized constructor for class Namaste with 2 parameter: x(String) & y(String)
 *
 * Print following statement in this constructor:
 * System.out.println("Namaste from " + x + " to " + y);
 * 
 * Task 7:
 * Invoke this parameterized constructor from prev parameterized constructor
 * 
 * Observations:
 * this() should be always first line of the constructor
 */

/**
 * Solution
 */
package ConstructorChaining1;

public class Main {

  public static class Namaste {

    // defualt constructor
    Namaste() {
      // calls parameterized constructor 1
      this("AccioJobs");
      System.out.println("The Default constructor says Namaste");
    }

    // parameterized constructor 1
    Namaste(String x) {
      // calls parameterized constructor 2
      this("AccioJobs", "World");
      System.out.println("Namaste from " + x);
    }

    // parameterized constructor 2
    Namaste(String x, String y) {
      System.out.println("Namaste from " + x + " to " + y);
    }
  }

  public static void main(String args[]) {
    Namaste n = new Namaste();
  }
}
