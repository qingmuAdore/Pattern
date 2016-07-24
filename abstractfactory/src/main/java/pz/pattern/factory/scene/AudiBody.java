package pz.pattern.factory.scene;

/**
 * @author pzhang
 * @version v1.0.0
 * @time 2016/7/24 20:51
 */
public class AudiBody implements IBody {
    @Override
    public int size() {
        return 32;
    }

    @Override
    public String material() {
        return "the audi body material";
    }
}
