import java.awt.*;

public class Triangle extends Shape{
     public Triangle(String type, Point[] points) {super(type, points);}

    @Override
    public double calcArea() {
         double a = distance(points[0], points[1]);
         double b = distance(points[2], points[1]);
         double c = distance(points[0], points[2]);
         double s = (a + b + c) / 2;

         return Math.sqrt(s * (s-a) * (s-b) * (s-c));
    }

    private double distance(Point p1, Point p2) {
         return Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));
    }
}
