package pz.pattern.factory.scene;

/**
 * @author pzhang
 * @version v1.0.0
 * @time 2016/7/24 20:49
 */
public class Exhibition {
    public static void main(String[] args) {
        Car audi = new Audi();
        System.out.println(audi.describe());

        Car benz = new Benz();
        System.out.println(benz.describe());
    }
}
