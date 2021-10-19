public class MallardDuck extends Duck{
    public MallardDuck() {
        super("Mallard");
        setQuackBehavior(new Quack());
        setFlyBehavior(new FlyWithWings());
    }
}
