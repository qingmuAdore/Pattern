package pz.pattern.builder.custom;

/**
 * @author pzhang
 * @version v1.0.0
 * @time 2016/7/25 23:22
 */
public abstract class IStarbuckBuilder {
    protected Starbuck starbucks;

    public Starbuck getStarbucks() {
        return starbucks;
    }

    public void createStarbucks() {
        starbucks = new Starbuck();
        System.out.println("a drink is created");
    }

    public abstract void buildSize();
    public abstract void buildDrink();

}
