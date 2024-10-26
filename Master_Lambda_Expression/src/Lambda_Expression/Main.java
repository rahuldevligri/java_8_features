package Lambda_Expression;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        MyInter myInter = new MyInterImpl();
        myInter.sayHello();

        //create anonymous class
        MyInter myInter1 = new MyInter() {
            @Override
            public void sayHello() {
                System.out.println("i am in Anonymous class");
            }
        };
        myInter1.sayHello();

        //lambda expression
        MyInter myInter2 = () -> System.out.println("Hello i am lambda expression");
        myInter2.sayHello();
        myInter2.myBye();
        MyInter.myHello();

        // add 2 numbers using lambda expression
        AddInter addInter = (a,b) -> a+b;
        System.out.println(addInter.add(5,6));

        //Get length of string using lambda expression
        LengthInter lengthInter = str -> str.length();
        int length = lengthInter.getLength("String");
        System.out.println(length);
    }
}