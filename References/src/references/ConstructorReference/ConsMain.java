package references.ConstructorReference;

public class ConsMain {
    public static void main(String...args){
        System.out.println("Learning Constructor Reference");

        //using lambda expression
        //Provider provider = () -> {return new Student();};

        //using constructor reference
        Provider provider = Student::new;

        Student student = provider.getStudent();
        student.display();
    }
}
