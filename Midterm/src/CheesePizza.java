public class CheesePizza extends AbstractPizza{
    @Override
    public String toString() {
        return super.toString() + "CheesePizza";
    }

    @Override
    public double weight() {
        return 280;
    }
}
