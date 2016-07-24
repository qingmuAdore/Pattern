package pz.pattern.factory.scene;

/**
 * @author pzhang
 * @version v1.0.0
 * @time 2016/7/24 20:57
 */
public class BenzBody implements IBody{
    @Override
    public int size() {
        return 40;
    }

    @Override
    public String material() {
        return "the benz body material";
    }
}
