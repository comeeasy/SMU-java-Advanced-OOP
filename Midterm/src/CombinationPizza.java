public class CombinationPizza extends AbstractPizza{

    @Override
    public String toString() {
        return super.toString() + "CombinationPizza";
    }

    @Override
    public double weight() {
        return 300;
    }
}
