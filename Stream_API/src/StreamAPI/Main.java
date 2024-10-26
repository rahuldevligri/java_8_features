package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //Q1. Create a list and filter all even numbers from list?

        // create immutable list using List.of() method
        List<Integer> al1 = List.of(1,2,3,4,5,6,7,8,9,10);

        // create immutable list using asList() method of Arrays class
        List<Integer> al2 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        //create mutable list using new keyword
        List<Integer> al3 = new ArrayList<>();
        al3.addAll(al2);
        //       or
        List<Integer> al4 = new ArrayList<>(al2);

        //without stream
        List<Integer> evenList =new ArrayList<>();

        for(int e : al1){
            if(e%2==0){
                evenList.add(e);
            }
        }
        System.out.println("List: "+al1);
        System.out.println("EvenList: "+evenList);

        //using Stream
        // Stream operations
        // 1. Getting the stream from al1 List
        // 2. Filtering out only even elements
        // 3. Collecting the required elements to List
        Stream<Integer> stream = al1.stream();
        List<Integer>newEven = stream.filter(i -> i%2==0).toList();
        //List<Integer>newEven = stream.filter(i -> i%2==0).collect(Collectors.toList());
        System.out.println(newEven);

        List<Integer> newEvenList = al1.stream().filter(i -> i%2==0).collect(Collectors.toList());
        //List<Integer> newEvenList = al1.stream().filter(i -> i%2==0).toList();
        System.out.println(newEvenList);

        List<Integer> greaterThen5 = al1.stream().filter(i -> i>=5).toList();
        System.out.println(greaterThen5);

        //How to create Stream interface Object...

        //1. Blank Stream
        Stream<Object> stream1 = Stream.empty();

        //2. array, object
        String[] name = {"A","B","C"};
        Stream<String> stream2 = Stream.of(name);
        stream2.forEach(e -> System.out.println(e));

        //3. builder pattern
        Stream<Object> stream3 = Stream.builder().build();

        //4. using Arrays
        IntStream stream4 = Arrays.stream(new int[]{1, 2, 3, 4, 5});
        stream4.forEach(e -> System.out.println(e));

        //5. List, Set...Collections
        List<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        Stream<Integer> stream5 = al.stream();
        stream5.forEach(e -> System.out.println(e));

    }
}