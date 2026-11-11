package stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        //Collection
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        Stream<String> streamCollection = fruits.stream();

        //Array
        String[] alphabet = {"A", "B", "C", "D"};
        Stream<String> streamArray = Arrays.stream(alphabet);

        //Stream
        Stream<Integer> stream = Stream.of(1, 2, 3, 4);

        //Range
        IntStream intStream = IntStream.rangeClosed(1, 50);
        IntStream range = IntStream.range(1, 50);

        //Intermediate and Terminal operation

        //Intermediate

        //filter
        List<Integer> nums = List.of(10, 15, 20, 25, 30);
        nums.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

        //map
        List<String> names = List.of("ali", "vali", "gani");
        names.stream()
                .filter(n -> n.startsWith("v"))
                .map(String::toUpperCase)
                .forEach(System.out::println);

        //flatmap
        List<List<String>> nested = List.of(List.of("a", "b", "c"), List.of("d", "e", "f"));
        nested.stream()
                .flatMap(Collection::stream)
                .toList()
                .forEach(System.out::println);

        //sorted distinct
        List<Integer> numbers = List.of(4, 5, 10, 11, 5, 12, 15, 4);
        numbers.stream()
                .distinct()
                .sorted()
                .forEach(System.out::println);

        //Terminal

        //grouping
        List<Employee> employees = List.of(
                new Employee("Ali", "IT", 2000),
                new Employee("Vali", "HR", 1500),
                new Employee("Gani", "IT", 1000)
        );
        employees.stream()
                .collect(Collectors.groupingBy(Employee::position))
                .entrySet()
                .forEach(System.out::println);

        //reduce
        List<Integer> integers = List.of(3, 5, 7, 9, 21);
        Integer sum = integers.stream()
                .reduce(0, Integer::sum);
        System.out.println(sum);

        //findFirst
        List<String> programmes = List.of("Java", "Python", "C#", "C++");
        programmes.stream()
                .filter(s -> s.length() <= 3)
                .findFirst()
                .ifPresent(System.out::println);


        //Utils class
        //Collections Collectors

        //Sort
        List<Integer> list = new ArrayList<>(List.of(12, 45, 67, 23, 9, 88, 34, 5));
        Collections.sort(list);
        list.forEach(System.out::println);

        //Reverse
        Collections.reverse(list);
        list.forEach(System.out::println);

        //Shuffle
        Collections.shuffle(list);
        list.forEach(System.out::println);

        //Max
        System.out.println(Collections.max(list));

        //Min
        System.out.println(Collections.min(list));

    }
}
