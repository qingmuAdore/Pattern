package pz.pattern.factory.scene;

/**
 * @author pzhang
 * @version v1.0.0
 * @time 2016/7/24 20:47
 */
public class Audi extends Car {
    @Override
    public IBody body() {
        return new AudiBody();
    }

    @Override
    public IEngine engine() {
        return new AudiEngine();
    }

    @Override
    public ILogo logo() {
        return new AudiLogo();
    }


}
