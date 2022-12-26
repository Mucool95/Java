abstract class A{
    void run(){System.out.println("abcd");};
    void show(){System.out.println("sadkj");}
}

class B extends A{
  }

public class Jkl {
    public static void main(String[] args) {
        B obj = new B();
    obj.show();
        obj.run();
    }
}
