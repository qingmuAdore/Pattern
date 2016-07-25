package pz.pattern.builder;

/**
 * @author pzhang
 * @version v1.0.0
 * @time 2016/7/25 21:57
 */
public class Director {
    private Builder builder;

    public Director setBuilder(Builder builder) {
        this.builder = builder;
        return this;
    }

    public Product construct() {
        return builder.result();
    }

}
