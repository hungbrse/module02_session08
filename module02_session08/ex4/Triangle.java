package module02_session08.ex4;

public class Triangle extends Shape {
    private double side1 =1.0;
    private double side2 =1.0;
    private double side3 =1.0;

    public Triangle() {
    }

    public Triangle(String color, double side1, double side3, double side2) {
        super(color);
        this.side1 = side1;
        this.side3 = side3;
        this.side2 = side2;
    }

    public double getArea() {
        double nuaChuVi = (side1 + side2 + side3) / 2.0;

        double area = Math.sqrt(nuaChuVi * (nuaChuVi - side1) * (nuaChuVi - side2) * (nuaChuVi - side3));

        return area;
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "Triangle [side1=" + side1 + ", side2=" + side2 + ", side3=" + side3 + ", color=" + getColor() + "]";
    }
}
