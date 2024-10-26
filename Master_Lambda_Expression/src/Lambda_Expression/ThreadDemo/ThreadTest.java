package Lambda_Expression.ThreadDemo;

public class ThreadTest {
     public static void main(String...args)
     {
         Runnable thread1 = () -> {
           //this is body of thread
             // write stuff here
             for(int i=1;i<=20;i++)
             {
                 System.out.println("Value of i: "+i);
                 try {
                     Thread.sleep(1000);
                 } catch (InterruptedException e) {
                     throw new RuntimeException(e);
                 }
             }
         };
         Thread t = new Thread(thread1);
         t.setName("Rahul");
         System.out.println(t.getName());
         t.start();

         Runnable thread2 = () -> {
             for(int i=1;i<=10;i++)
             {
                 System.out.println(i*2);
                 try {
                     Thread.sleep(2000);
                 } catch (InterruptedException e) {
                     throw new RuntimeException(e);
                 }
             }
         };

         Thread t2 = new Thread(thread2);
         t2.start();
     }
}
