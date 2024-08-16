package module02_session08.thucHanh2;

public class Motorcycle extends  Vehicle{
    public Motorcycle(String color, String brand) {
        super(color, brand);
    }

    public Motorcycle() {
    }

    @Override
    public String toString() {
        return "MotorcycleBrand" + this.getBrand() + ", MotorcycleColor" + this.getColor();
    }
}
