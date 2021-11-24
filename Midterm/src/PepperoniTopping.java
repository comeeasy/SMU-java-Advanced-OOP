public class PepperoniTopping extends AbstractTopping{
    private AbstractPizza pizza;

    public PepperoniTopping(AbstractPizza pizza) {
        super(", pepperoni topping");
        this.pizza = pizza;
    }

    @Override
    public String toString() {
        return pizza.toString() + topptingName;
    }

    @Override
    public double weight() {
        return 25 + pizza.weight();
    }
}
