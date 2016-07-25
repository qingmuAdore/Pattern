package pz.pattern.builder;

/**
 * @author pzhang
 * @version v1.0.0
 * @time 2016/7/25 21:57
 */
public class ConcreteBuilder implements Builder {
    private Product product = new Product();

    @Override
    public Builder partA(String a) {
        product.setPartA(a);
        return this;
    }

    @Override
    public Builder partB(String b) {
        product.setPartB(b);
        return this;
    }

    @Override
    public Product result() {
        return product;
    }
}
