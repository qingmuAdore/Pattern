package pz.pattern.methodfactory.scene;

/**
 * @author pzhang
 * @version v1.0.0
 * @time 2016/7/24 18:23
 */
public class System implements ISystem {
    @Override
    public <T extends IRole> T generate(Class<T> cls) {
        T role = null;
        try {
            role = (T) Class.forName(cls.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return role;
    }
}
