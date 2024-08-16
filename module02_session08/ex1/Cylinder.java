package module02_session08.ex1;

public class Cylinder extends Circle{
    private double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getTheTIch() {
        return 3.14 * this.getRadius() * this.getRadius() * height;
    }

    @Override
    public String toString() {
        return "bán kính "  + this.getRadius() + "chiều cao " +this.getHeight() + "màu  " + this.getColor() + "thể tích " + this.getTheTIch();
    }
}
