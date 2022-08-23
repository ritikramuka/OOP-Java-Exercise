/**
 * Constructor Chaining Method 2
 *
 * Task 1:
 * Create a class Base
 *
 * Task 2:
 * Create a default constructor for class Base
 *
 * Print following statement in this constructor:
 * System.out.println("Calling Default Constructor of Base Class");
 *
 * Task 3:
 * Now, create a parameterized constructor for class Base with 1 parameter: x(int)
 *
 * Print following statement in this constructor:
 * System.out.println("Calling parameterized constructor of Base Class with x equal to " + x);
 *
 * Task 4:
 * Invoke this parameterized constructor from default constructor
 *
 * Task 5:
 * Now, create a new class called Derived class which extends the previous Base class
 *
 * Task 6:
 * Create a default constructor of this derived class
 *
 * Print following statement in this constructor:
 * System.out.println("Calling Default Constructor of Derived Class");
 *
 * Task 7:
 * Try creating obj of this derived class and observe the output
 *
 * Task 8:
 * Now, create a parameterized constructor for class Derived with 1 parameter: x(int)
 *
 * Print following statement in this constructor:
 * System.out.println("Calling parameterized constructor of Derived Class with x equal to " + x);
 *
 * Task 9:
 * Now, Try invoking Base class parameterized constructor directly from derived class parameterized constructor
 *
 * Observations:
 *
 */

/**
 * Solution
 */
package ConstructorChaining2;

public class Main {

  public static class Base {

    Base() {
      this(10);
      System.out.println("Calling Default Constructor of Base Class");
    }

    Base(int x) {
      System.out.println(
        "Calling parameterized constructor of Base Class with x equal to " + x
      );
    }
  }

  public static class Derived extends Base {

    Derived() {
      System.out.println("Calling Default Constructor of Derived Class");
    }

    Derived(int x) {
      super(x);
      System.out.println(
        "Calling Parameterized Constructor of Derived Class with x equal to " +
        x
      );
    }
  }

  public static void main(String args[]) {
    Derived obj1 = new Derived();
    System.out.println();

    Derived obj2 = new Derived(20);
  }
}
