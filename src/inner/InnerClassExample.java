package inner;

public class InnerClassExample {
    public static void main(String[] args) {

        //Member Inner class
        Car car = new Car();
        Car.Engine engine = car.new Engine();
        engine.start();

        //Nested Static class
        Car.NestedStatic nestedStatic = new Car.NestedStatic();
        nestedStatic.printModel();

        //Local class
        Car carLocal = new Car();
        carLocal.printPrice();

        //Anonymous class
        Greeting greeting = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello Java!!!");
            }
        };
        greeting.sayHello();
    }
}
