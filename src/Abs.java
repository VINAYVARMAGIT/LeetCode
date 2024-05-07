interface A{

    void run();
    void fight();

        }
 class B implements A{


     @Override
     public void run() {
         System.out.println("running");
     }

     @Override
     public void fight() {
         System.out.println("fighting");

     }
 }

public class Abs {
    public static void main(String[] args) {


        A obj = new B();
        obj.fight();
        obj.run();

    }
}
