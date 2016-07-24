package pz.pattern.factory;

/**
 * @author pzhang
 * @version v1.0.0
 * @time 2016/7/24 20:24
 */
public class Client {
    public static void main(String[] args){
        Factory factory1 = new ConcreteFactory1();
        factory1.createProductA().diffMethodA();
        factory1.createProductB().diffMethodB();

        Factory factory2 = new ConcreteFactory2();
        factory2.createProductA().diffMethodA();
        factory2.createProductB().diffMethodB();
    }
}
