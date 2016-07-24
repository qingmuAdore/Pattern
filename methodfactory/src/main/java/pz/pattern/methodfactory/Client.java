package pz.pattern.methodfactory;

/**
 * @author pzhang
 * @version v1.0.0
 * @time 2016/7/24 16:30
 */
public class Client {
    public static void  main(String[] args){
        Factory factory = new ConcreteFactory();
        Product product = factory.createProduct(ConcreteProduct.class);
        product.method();
    }
}
