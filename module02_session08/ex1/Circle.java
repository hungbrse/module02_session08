package module02_session08.ex1;

public class Circle {
    private double radius;
    private  String color;

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getAre() {
        return 3.14 * radius * radius;
    }
    @Override
    public String toString() {
        return "bán kính " + this.radius + " màu sắc " + this.color +"diện tích " +  getAre();
    }
}
