package Lambda_Expression;

@FunctionalInterface
public interface MyInter {
    public abstract void sayHello();

    public static void myHello(){
        System.out.println("Static method ");
    }

    public default void myBye(){
        System.out.println("Default Method");
    }

    /* methods -> to implement sayHello() method...
    1. create separate class and implements this interface
    2. create anonymous class for implements this interface

     */
}
