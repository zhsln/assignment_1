package models;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        setX(x);
        setY(y);
    }

    // setters
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    // getters
    public double getX() { return x; }
    public double getY() {
        return y;
    }

    // distanceTo() calculates distance between two points.
    public double distanceTo(Point dest) {
        return Math.sqrt(Math.pow((dest.x - this.x), 2) + Math.pow((dest.y - this.y), 2));
    }

    /* toSpring() outputs the values of the point coordinate according to Soviet rules,
    that is, with the sign ";" between x and y.*/
    @Override
    public String toString() {
        return "(" + x + " ; " + y + ")";
    }
}
