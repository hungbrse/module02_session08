package module02_session08.thucHanh2;

public class Car extends  Vehicle{
    public Car(String color, String brand) {
        super(color, brand);
    }

    public Car() {
    }

    @Override
    public String toString() {
        return "Car  brand: " + this.getBrand() + "color " + this.getColor();
    }

}
