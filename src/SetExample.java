import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

//Collection - Set - uniqallikni taminlab beradi
public class SetExample {
    public static void main(String[] args) {
        Set<String> cars = new HashSet<>();
        cars.add("Tayota");
        cars.add("Cobalt");
        cars.add("Cobalt");
        cars.add("Cobalt");
        cars.add("Ferrari");

        //Collection methodlari hammasi bir xil ishlaydi
        for (String car : cars) {
            System.out.println("Car: " + car);
        }
        System.out.println("=======================");

        //Ordering
        Set<String> cars2 = new LinkedHashSet<>();
        cars2.add("Tayota");
        cars2.add("Cobalt");
        cars2.add("Cobalt");
        cars2.add("Cobalt");
        cars2.add("Ferrari");
        for (String car : cars2) {
            System.out.println("LCar: " + car);
        }

        System.out.println("=======================");

        //Ordering - biz xoxlagan field boyicha
        Set<String> cars3 = new TreeSet<>();
        cars3.add("Tayota");
        cars3.add("Cobalt");
        cars3.add("Cobalt");
        cars3.add("Cobalt");
        cars3.add("Ferrari");

        for (String car : cars3) {
            System.out.println("TCar: " + car);
        }

    }
}
