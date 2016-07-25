package pz.pattern.builder.custom;

/**
 * @author pzhang
 * @version v1.0.0
 * @time 2016/7/25 23:24
 *
 * Director
 */
public class Waiter {
    private IStarbuckBuilder builder;

    public void setBuilder(IStarbuckBuilder builder) {
        this.builder = builder;
    }

    public Starbuck getstarbucksDrink() {
        return builder.getStarbucks();
    }

    public void constructStarbucks() {
        builder.createStarbucks();
        builder.buildDrink();
        builder.buildSize();
    }
}