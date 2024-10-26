package references.usingStream;

import java.util.List;
import java.util.stream.Stream;

public class streamMain {
    public static void main(String...args){
        List<Integer> list = List.of(1,5,3,2,5,6,8);

        list.stream().forEach(e -> System.out.print(e));

        System.out.println();

        list.forEach(e -> System.out.print(e));

        System.out.println();

        //using method reference
        list.stream().forEach(System.out::print);

        System.out.println();

        list.stream().forEach(System.out::print);

        System.out.println();

        list.forEach(System.out::print);
    }
}
