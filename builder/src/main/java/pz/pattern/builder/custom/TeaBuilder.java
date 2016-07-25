package pz.pattern.builder.custom;

/**
 * @author pzhang
 * @version v1.0.0
 * @time 2016/7/25 23:23
 */
public class TeaBuilder extends IStarbuckBuilder {
    public void buildSize() {
        starbucks.setSize("large");
        System.out.println("build large size");
    }

    public void buildDrink() {
        starbucks.setDrink("tea");
        System.out.println("build tea");
    }
}
