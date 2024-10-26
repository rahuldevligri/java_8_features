package references;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //1. creating object of WorkInter child class
        WorkInter child = new WorkInterImpl();
        child.doTask();


        //2. using anonymous class
        WorkInter anonymous = new WorkInter() {
            @Override
            public void doTask() {
                System.out.println("It's anonymous class");
            }
        };
        anonymous.doTask();

        //3. using lambda expression
        WorkInter lambda = () -> System.out.println("It's lambda expression");
        lambda.doTask();


        //4. using Static Method References
        //use old implementation without creating new implementation
        //we have refer the static method doStuff() of Stuff class
        //ClassName::MethodName;
        WorkInter methodReferences = Stuff::doStuff;
        methodReferences.doTask();

        //Create Thread using Static Method References
        Runnable runnable = Stuff::threadTask;
        Thread th = new Thread(runnable);
        th.start();

        //create object of Stuff class
        Stuff stuff = new Stuff();
        //create thread using Instance Method Reference
        //Object::MethodName
        Runnable rn = stuff::printNumbers;
        Thread thread1 = new Thread(rn);
        thread1.start();
    }
}