package module02_session08.thucHanh2;

public class Vehicle {
    private String brand;
    private String color;

    public Vehicle(String color, String brand) {
        this.color = color;
        this.brand = brand;
    }

    public Vehicle() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return  "Brand: " +  brand + ", Color: " + color;
    }
}
