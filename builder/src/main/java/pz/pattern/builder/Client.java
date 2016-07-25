package pz.pattern.builder;

public class Client {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder().partA("part A").partB("part B");
        Director director = new Director().setBuilder(builder);
        Product product = director.construct();
        System.out.println(product.toString());
    }
}
