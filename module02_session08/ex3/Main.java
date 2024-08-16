package module02_session08.ex3;

public class Main {
    public static void main(String[] args) {

        Point p = new Point(100,200);


        System.out.println(p);

        MovablePoint  mp = new MovablePoint(50,50,30,40);


        mp.move();
        System.out.println(p);
        System.out.println(mp);
    }
}
