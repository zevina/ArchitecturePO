package ModelElements;

import Stuff.Point3D;

import java.util.ArrayList;
import java.util.List;

public class Poligon {
    public List<Point3D> points;


    public Poligon(List<Point3D> points) {
        this.points = points;
    }

    public Poligon(Point3D point) {
        this.points = new ArrayList<>();
        this.points.add(point);
    }
}