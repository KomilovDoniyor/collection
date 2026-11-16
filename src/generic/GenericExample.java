package generic;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {
    public static void main(String[] args) {
        //Java 5
        //Class
        List list = new ArrayList<>();
        list.add("Ali");
        list.add("Vali");
        list.add(1); //Integer

//        for (int i = 0; i < list.size(); i++) {
//            String name = (String) list.get(i);
//            System.out.println(name);
//        }

//        List<String> list = new ArrayList<>();
//        list.add("a");
//        list.add("b");
//        list.add(1);
//        list.forEach(System.out::println);
        Box<String> box = new Box<>();
        box.setValue("Ali");
        box.setValue("Vali");

        Pair<String, Integer> pair = new Pair<>("Ali", 1);
        Pair<Integer, String> pair1 = new Pair<>(2, "Vali");

        //Interface
        StudentRepository studentRepository = new StudentRepository();
        studentRepository.findById(1);

        //Generic Method
        String names[] = {"Ali", "Vali"};
        Integer[] numbers = {1, 2, 3};

        String firstString = ArrayUtils.first(names);
        Integer firstNumber = ArrayUtils.first(numbers);
        System.out.println(firstString);
        System.out.println(firstNumber);

        ArrayUtils.print(names);

        //Bound Type

        //Upper bound
        List<String> namesList = new ArrayList<>();
        namesList.add("Ali");
        namesList.add("Vali");

        List<Integer> numbersList = new ArrayList<>();
        numbersList.add(1);
        numbersList.add(2);

        //double sum = ArrayUtils.sum(namesList);
        double sumNumber = ArrayUtils.sum(numbersList);

        //Wildcard super
        List<Integer> integerList = new ArrayList<>();
        List<Short> shortList = new ArrayList<>();
        List<Double> doubleList = new ArrayList<>();
        List<Object> objectList = new ArrayList<>();
        List<Boolean> booleanList = new ArrayList<>();

        ArrayUtils.print(integerList);
        //ArrayUtils.print(shortList);
        //ArrayUtils.print(doubleList);
        //ArrayUtils.print(objectList);
        //ArrayUtils.print(booleanList);


    }
}
