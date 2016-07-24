package pz.pattern.methodfactory.scene;

/**
 * @author pzhang
 * @version v1.0.0
 * @time 2016/7/24 18:24
 */
public interface ISystem {
    <T extends IRole> T generate(Class<T> cls);
}
