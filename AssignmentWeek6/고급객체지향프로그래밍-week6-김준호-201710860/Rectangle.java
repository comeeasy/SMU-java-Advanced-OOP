import java.awt.*;

public class Rectangle extends Shape{

    public Rectangle(String type, Point[] points) {super(type, points);}
    
    @Override
    public double calcArea() {
        return Math.abs(points[1].getY() - points[0].getY()) * Math.abs(points[1].getX() - points[0].getX());
    }
}
