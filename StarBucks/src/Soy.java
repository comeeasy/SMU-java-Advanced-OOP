public class Soy extends Beverage{
    private Beverage bev;

    public Soy(Beverage bev) {
        this.bev = bev;
    }

    @Override
    public String getDiscription() {
        return "Soy " + bev.getDiscription();
    }

    @Override
    public double cost() {
        return 1000 + bev.cost();
    }
}
