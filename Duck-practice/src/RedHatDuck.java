public class RedHatDuck extends Duck{
    public RedHatDuck() {
        super("RedHatDuck");
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Squack());
    }
}
