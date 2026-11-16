package generic;

import java.util.List;

public class ArrayUtils {
    public static String getStaticMethod() {
        return "Hello";
    }

    //Generic Method
    public static <T> T first(T[] array) {
        return array.length == 0 ? null : array[0];
    }

    public static <T> void print(T[] array) {
        for (T t : array) {
            System.out.println(t);
        }
    }
    //Muammo cast
//    public static <T> double sum(List<T> list) {
//        double sum = 0;
//        for (T t : list) {
//            sum += (double) t;
//        }
//        return sum;
//    }

    public static <T extends Number> double sum(List<T> list) {
        double sum = 0;
        for (T t : list) {
            sum += (double) t;
        }
        return sum;
    }

    public static void print(List<? extends Integer> list) {
        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
