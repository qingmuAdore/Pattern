package pz.pattern.builder.custom;

/**
 * @author pzhang
 * @version v1.0.0
 * @time 2016/7/25 23:25
 */
public class Customer {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        IStarbuckBuilder coffeeBuilder = new CoffeeBuilder();

        //Alternatively you can use tea builder to build a tea
        //StarbucksBuilder teaBuilder = new TeaBuilder();

        waiter.setBuilder(coffeeBuilder);
        waiter.constructStarbucks();

        //get the drink built
        Starbuck drink = waiter.getstarbucksDrink();

    }
}
