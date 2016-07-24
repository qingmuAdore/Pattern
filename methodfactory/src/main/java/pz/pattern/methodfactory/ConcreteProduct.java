package pz.pattern.methodfactory;

/**
 * @author pzhang
 * @version v1.0.0
 * @time 2016/7/24 16:17
 */
public class ConcreteProduct implements Product{
    @Override
    public void method() {
       System.out.println("concrete product");
    }
}
