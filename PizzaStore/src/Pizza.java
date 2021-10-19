import java.util.ArrayList;

public abstract class Pizza {
    private String name = "";
    private String dough = "";
    private String sauce = "";
    private ArrayList<String> topping = null;

    public abstract void prepare();
    public abstract void bake();
}
