import java.awt.*;

public class Trapezoid extends Shape{
    public Trapezoid(String type, Point[] points) {super(type, points);}

    @Override
    public double calcArea() {
        double sum_sides = Math.abs(points[3].getX() - points[0].getX()) + Math.abs(points[1].getX() - points[2].getX());
        double height = Math.abs(points[3].getY() - points[1].getY());
        return sum_sides * height / 2;
    }
}
