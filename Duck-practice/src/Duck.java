public class Duck {
    protected FlyBehavior flyBehavior = null;
    protected QuackBehavior quackBehavior = null;

    private String name = "";

    public Duck(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println(name);
        performFly();
        performQuack();
    }

    public void swim() {System.out.println("swim");}
    public void performFly() {flyBehavior.fly();}
    public void performQuack() {quackBehavior.quack();}
    public void setFlyBehavior(FlyBehavior fb) {flyBehavior = fb;}
    public void setQuackBehavior(QuackBehavior qb) {quackBehavior = qb;}

    public static void main(String[] argv) {
        Duck d1 = new MallardDuck();
        Duck d2 = new RedHatDuck();
        Duck d3 = new RubberDuck();

        d1.display();
        d2.display();
        d3.display();
    }
}
