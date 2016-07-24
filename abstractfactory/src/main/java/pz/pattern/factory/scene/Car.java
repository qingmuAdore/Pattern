package pz.pattern.factory.scene;

/**
 * @author pzhang
 * @version v1.0.0
 * @time 2016/7/24 20:28
 */
public abstract class Car {
    public abstract IBody body();

    public abstract IEngine engine();

    public abstract ILogo logo();

    public String describe() {
        return "Body:[size:" + body().size() + " material:" + body().material() + "] engine:" + engine().speed() +
                " logo:" + logo().mark();
    }
}

