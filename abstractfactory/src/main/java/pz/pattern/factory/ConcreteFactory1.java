package pz.pattern.factory;

/**
 * @author pzhang
 * @version v1.0.0
 * @time 2016/7/24 20:23
 */
public class ConcreteFactory1 implements Factory {

    @Override
    public ProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB1();
    }
}
