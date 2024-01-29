package ModelElements;

import java.util.List;

public class Scene {
    public int id;
    public List<PoligonalModel> Models;
    public List<Flash> Flashes;
    public List<Camera> Cameras;

    public Scene(int id, List<PoligonalModel> models, List<Flash> flashes, List<Camera> cameras) throws Exception {
//      1. id
        this.id = id;

//      2. Models
        if(models.size() > 0) {
            this.Models = models;
        }
        else {
            throw  new Exception("There must be at least one model");
        }

//      3. Flashes
        this.Flashes=flashes;

//      4. Cameras
        if(cameras.size() > 0) {
            this.Cameras = cameras;
        }
        else {
            throw  new Exception("There must be at least one camera");
        }
    }


    public <T> T method1(T flash){
        return flash;
    }

    public <T1, T2> T1 method2(T1 flash, T2 camera){
        return flash;
    }
}
