public class Main {
    public static void main(String[] argv) {
        Beverage b1 = new HouseBlend();
        Beverage b2 = new DarkRoast();
        Beverage b3 = new Espresso();
        Beverage b4 = new Decaf();

        System.out.println(b1.getDiscription());
        System.out.println(b2.getDiscription());
        System.out.println(b3.getDiscription());
        System.out.println(b4.getDiscription());
        System.out.println("");

        System.out.println(new Whip(new Soy(new Milk(b1))).getDiscription());
        System.out.println(new Whip(new Soy(new Milk(b1))).cost());

    }
}
