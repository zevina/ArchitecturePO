package ModelElements;

import Stuff.Point3D;
import java.util.ArrayList;
import java.util.List;

public class PoligonalModel {
    public List<Poligon> Poligons;
    public List<Texture> Textures;

    public PoligonalModel(List<Texture> textures) {
//      1. Poligons
        this.Poligons = new ArrayList<>();
        this.Poligons.add(new Poligon(new Point3D()));

//      2. Textures
        this.Textures = textures;
    }
}
