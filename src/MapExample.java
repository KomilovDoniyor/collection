import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Car car = new Car();
        //Key Value
        Map<Integer, String> cars = new HashMap<>();
        //cars.put(car, "Tayota");
        cars.put(null, "Tayota");
        cars.put(null, "Tayota");
        cars.put(1, "Ferrari");
        cars.put(2, "Ford");
        cars.put(3, "Honda");
        cars.put(4, null);

        cars.putIfAbsent(4, "Tico");

        int i = cars.hashCode(); //hashCode, Immutable
        Objects.hashCode(cars);
        cars.equals(cars);

        //hashCode
        //equals
        //collision

        cars.forEach((k, v) -> System.out.println(k + " " + v));
        //Entry
        Set<Map.Entry<Integer, String>> entries = cars.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        //get - malumot olish
        String value1 = cars.get(1);
        System.out.println(value1);

        //getOrDefault - malumot olish va default qiymat berish
        String unknownCar = cars.getOrDefault(4, "UnknownCar");
        System.out.println(unknownCar);

        Collection<String> values = cars.values();
        for (String value : values) {
            System.out.println(value);
        }
    }
}
