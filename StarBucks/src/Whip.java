public class Whip extends Beverage{
    private Beverage b;

    public Whip(Beverage b) {
        this.b = b;
    }

    @Override
    public String getDiscription() {
        return "Whip " + b.getDiscription();
    }

    @Override
    public double cost() {
        return 100 + b.cost();
    }
}

