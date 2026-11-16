package functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        Calculators calculator = new Calculators();
        System.out.println(calculator.calculate(5, 6));

        //Functional interface
        Calculator calculate = Integer::sum;

        //Lambda expression
        // () -> nimadir
        List<Integer> nums = List.of(10, 15, 20, 25, 30);
        List<Integer> nums1 = new ArrayList<>();
        for (Integer num : nums) {
            nums1.add(num * 2);
        }
        //System.out.println(nums1);

        List<Integer> list = nums.stream().map((n) -> n * 2).toList();
        //System.out.println(list);

        // nums.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

        //Predicate, Consumer, Supplier, Function, BiFunction, UnaryOperator - functional interface

        //Predicate
        Predicate<Integer> isPositive = n -> n > 0;
        Predicate<Integer> isNegative = n -> n < 0;
        Predicate<Integer> isEven = n -> n % 2 == 0;

        boolean isPos = isPositive.test(10);//true
        boolean isNeg = isNegative.test(11);//false
        boolean isEv = isEven.test(13);//false

        System.out.println(isPos);
        System.out.println(isNeg);
        System.out.println(isEv);

        Double price = 10000.0;
        List<Product> products = new ArrayList<>(List.of(new Product("Telephone", 1500)));
        Predicate<Product> filter = p -> true;
        if (price != null) {
            filter = filter.and(p -> p.price > price);
        }
        products.stream().filter(filter).forEach(System.out::println);

        //Consumer
        Consumer<String> great = name -> System.out.println("Hello " + name);
        Consumer<String> balance = b -> System.out.println("Balance 100000 som");
        // great.accept("Ali");

        Consumer<String> andThen = great.andThen(balance);
        andThen.accept("Ali");

        //Supplier
        String hello = calculation();
        Supplier<String> supplier = () -> hello;

        //nums.forEach(System.out::println);
        //Something logic
        System.out.println(supplier.get());

        //nums.stream().distinct().forEach(System.out::println);
        //Function
        Function<String, Integer> length = String::length;
        Function<Integer, String> text = functionExample();
        String apply = text.apply(100);
        System.out.println(apply);

    }

    private static Function<Integer, String> functionExample() {
        return integer -> {
            integer *= 2;
            return "Result: " + integer;
        };
    }

    private static String example(Integer integer) {
        return"Result: " + integer;
    }

    private static String calculation() {
        return "Hello World";
    }
}
