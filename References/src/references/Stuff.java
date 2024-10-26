package references;

import java.time.LocalDate;

//old implementation
public class Stuff {
    public static void doStuff(){
        System.out.println("I'm doStuff method");
        LocalDate lc = LocalDate.now();
        System.out.println(lc);
    }

    public static void threadTask() {
        for(int i = 1; i<=10;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void printNumbers(){
        for(int i = 1;i<=10;i++){
            System.out.println(i);
            try {
                Thread.sleep(2000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
