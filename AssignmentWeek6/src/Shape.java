import java.awt.*;

public abstract class Shape {
    private String type;
    protected Point[] points;

    public Shape(String type, Point[] points) {
        this.type = type;
        this.points = points;
    }
    public abstract double calcArea();

    @Override
    public String toString() {
        String point_toString = "";
        for(Point p: points) {
            point_toString += p.toString() + '\n';
        }
        return type + "\n" + point_toString + "area: " + Double.toString(calcArea()) + "\n";
    }
}
