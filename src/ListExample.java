import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ListExample {

    //Collection - List, Set, Map
    public static void main(String[] args) {
        //List - ArrayList, LinkedList,
        List<String> fruits = new ArrayList<>();
        List<String> fruits2 = new ArrayList<>();
        fruits2.add("Lemon");

        fruits.add("Apple");
        fruits.add("Apple");
        fruits.add("Apple");
        fruits.add("Apple");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Strawberry"); //Listimizga malumot qoshish

//        String[] fruitsArray = {"Apple", "Banana", "Strawberry"};
//        int length = fruitsArray.length;

        int size = fruits.size(); //Uzunligi
        fruits.add(0, "Orange");
        fruits.addAll(fruits2);
        //fruits.add(fruits.size(), "Orange");
        fruits.addLast( "Orange");



        //1 - for each
        // fruits.forEach(fruit -> System.out.println("Fruit: " + fruit));
        //2 - enhanced for
//        for (String fruit : fruits) {
//            System.out.println("Fruit: " + fruit);
//            if (fruits.contains("Orange")) {
//                fruits.remove(fruit);
//            }
//        }

        fruits.remove("Orange");
        fruits.remove(1);
        String s = fruits.get(2);
        System.out.println("FruitGet: " + s);

        //simple for
//        for (int i = 0; i < fruits.size(); i++) {
//            System.out.println("Fruit: " + fruits.get(i));
//        }


        //BigO ()
        List<String> foods = new LinkedList<>();
        foods.add("Pizza");
        foods.add("Barbeque Burger");

        //ArrayList bilan methodlari bir xil
        // foods.size();
    }
}