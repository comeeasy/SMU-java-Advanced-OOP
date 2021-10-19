public class RubberDuck extends Duck{
    public RubberDuck() {
        super("RubberDuck");
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new MuteQuack());
    }
}
