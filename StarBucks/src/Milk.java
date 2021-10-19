public class Milk extends Condiments{
    private Beverage b = null;

    public Milk(Beverage b) {
        this.b = b;
    }

    @Override
    public String getDiscription() {
        return "Milk " + b.getDiscription();
    }

    @Override
    public double cost() {
        return 500 + b.cost();
    }
}
