package module02_session08.thucHanh2;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("red","toyota");
        Car car2 = new Car("black","samsung");

        System.out.println(car1.toString());
        System.out.println(car2.toString());
        car1.setBrand("Set con cac ");
        System.out.println(car1.toString());



    }
}
