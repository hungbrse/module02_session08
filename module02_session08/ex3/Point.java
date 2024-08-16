package module02_session08.ex3;

public class Point {
    private  float x;
    private  float y;

    public Point(float y, float x) {
        this.y = y;
        this.x = x;
    }

    public Point() {
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float[] getXY() {
        float[] xy = {x, y};
        return xy;
    }

    @Override
    public String toString() {
        return "Point [x=" + this.x + ", y=" + this.y + "]";
    }
}
