public class Mocha extends Beverage{
    private Beverage b;

    public Mocha(Beverage b) {
        this.b = b;
    }

    @Override
    public String getDiscription() {
        return "Mocha " + b.getDiscription();
    }

    @Override
    public double cost() {
        return 300 + b.cost();
    }
}
