package Inheritance.Solution.Hierarchical;

public class Main {

  public static class A {

    public void print_A() {
      System.out.println("Class A");
    }
  }

  public static class B extends A {

    public void print_B() {
      System.out.println("Class B");
    }
  }

  public static class C extends A {

    public void print_C() {
      System.out.println("Class C");
    }
  }

  public static class D extends A {

    public void print_D() {
      System.out.println("Class D");
    }
  }

  public static void main(String[] args) {
    B obj_B = new B();
    obj_B.print_A();
    obj_B.print_B();

    C obj_C = new C();
    obj_C.print_A();
    obj_C.print_C();

    D obj_D = new D();
    obj_D.print_A();
    obj_D.print_D();
  }
}
