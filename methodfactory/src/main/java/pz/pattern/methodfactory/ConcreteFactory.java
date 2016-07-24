package pz.pattern.methodfactory;

/**
 * @author pzhang
 * @version v1.0.0
 * @time 2016/7/24 16:19
 */
public class ConcreteFactory implements Factory {
    @Override
    public <T extends Product> T createProduct(Class<T> cls) {
        Product product = null;
        try {
            product = (T) Class.forName(cls.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) product;
    }
}
