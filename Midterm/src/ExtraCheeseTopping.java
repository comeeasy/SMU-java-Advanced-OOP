public class ExtraCheeseTopping extends AbstractTopping{
    private AbstractPizza pizza;

    public ExtraCheeseTopping(AbstractPizza pizza) {
        super(", extra cheese topping");
        this.pizza = pizza;
    }

    @Override
    public String toString() {
        return pizza.toString() + topptingName;
    }

    @Override
    public double weight() {
        return 40 + pizza.weight();
    }
}
