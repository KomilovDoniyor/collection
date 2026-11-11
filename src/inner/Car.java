package inner;

public class Car {
    private String model = "Tayota";
    private static int year = 2021;

    //Member
    class Engine {
        public void start() {
            System.out.println(model + " Engine is starting...");
        }
    }

    //Static
    public static class NestedStatic {
        public void printModel() {
            System.out.println("Model: " + year);
        }
    }

    //Local
    public void printPrice() {
        String currency = "USD";

        class Price {
            public void format(double amount) {
                System.out.println("Summa: " + amount + " " + currency);
            }
        }
        Price price = new Price();
        price.format(10000);
    }


}
