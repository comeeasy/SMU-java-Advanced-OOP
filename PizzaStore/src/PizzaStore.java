import javax.annotation.processing.SupportedSourceVersion;

public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        return pizza;
    }

    public void preparePizza(Pizza pizza) {
        System.out.println("prepare pizza");
    }

    public abstract Pizza createPizza(String type);
}
