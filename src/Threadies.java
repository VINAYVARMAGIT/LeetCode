
class Varm extends Thread{

    public void run(){

        for(int i=1; i<=10; i++)
        {
            System.out.println("hi");
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
class Vary extends Thread{

    public void run(){

        for(int i=1; i<=10; i++)
        {
            System.out.println("how");
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}





public class Threadies {
    public static void main(String[] args) {
          Varm n = new Varm();
          Vary m = new Vary();

          m.setPriority(2);

          n.start();
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        m.start();
    }
}
