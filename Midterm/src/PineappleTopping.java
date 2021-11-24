public class PineappleTopping extends AbstractTopping{
    private AbstractPizza pizza;

    public PineappleTopping(AbstractPizza pizza) {
        super(", pineapple topping");
        this.pizza = pizza;
    }

    @Override
    public String toString() {
        return pizza.toString() + topptingName;
    }

    @Override
    public double weight() {
        return 45 + pizza.weight();
    }
}
