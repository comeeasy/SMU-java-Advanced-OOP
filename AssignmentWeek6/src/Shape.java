import java.awt.*;

public abstract class Shape {
    private String type;

    public Shape(String type, Point[] points) {this.type = type;}
    public abstract double calcArea();

    @Override
    public String toString() {
        return type;
    }
}
