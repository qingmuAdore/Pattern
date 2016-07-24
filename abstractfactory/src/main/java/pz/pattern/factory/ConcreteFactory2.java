package pz.pattern.factory;

/**
 * @author pzhang
 * @version v1.0.0
 * @time 2016/7/24 20:24
 */
public class ConcreteFactory2 implements Factory {
    @Override
    public ProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB2();
    }
}
