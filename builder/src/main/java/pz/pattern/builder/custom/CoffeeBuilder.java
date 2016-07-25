package pz.pattern.builder.custom;

/**
 * @author pzhang
 * @version v1.0.0
 * @time 2016/7/25 23:24
 */
public class CoffeeBuilder extends IStarbuckBuilder {
    public void buildSize() {
        starbucks.setSize("medium");
        System.out.println("build medium size");
    }

    public void buildDrink() {
        starbucks.setDrink("coffee");
        System.out.println("build coffee");
    }
}
