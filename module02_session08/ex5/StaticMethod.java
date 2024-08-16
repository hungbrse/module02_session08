package module02_session08.ex5;

public class StaticMethod {
    public  static  double pi = 3.14;


    public static double calCircleArea(double r) {
        return pi*r*r;
    }
    public static double calRectangleArea(double with, double height) {
        return with * height;
    }
    public static double calTriangleArea(double a, double b, double c) {

        double nuaChuVi = (a+b+c)/2;

        double area = Math.sqrt(nuaChuVi * (nuaChuVi - a) * (nuaChuVi - b) * (nuaChuVi - c));

        return  area;
    }
}
