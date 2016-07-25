package pz.pattern.builder;

/**
 * @author pzhang
 * @version v1.0.0
 * @time 2016/7/25 21:56
 */
public class Product {
    private String partA;
    private String partB;

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public String getPartA() {
        return partA;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public String getPartB() {
        return partB;
    }

    @Override
    public String toString() {
        return "A:" + partA + " B:" + partB;
    }
}
