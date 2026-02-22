public class Main {
    public static void main(String[] args) {
        Beverage beverage = new HouseBlend();
        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());

        beverage = new Soy(beverage);
        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());

        beverage = new Milk(beverage);
        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());

        beverage = new Mocha(new Mocha(new Milk(new Soy(new HouseBlend()))));
        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());

        beverage = new Mocha(new Mocha(new Milk(new Soy(new Espresso()))));
        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());

        beverage = new Mocha(new Milk(new Milk(new Whip(new Decaf()))));
        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());

        beverage = new Mocha(new Whip(new Milk(new Soy(new DarkRoast()))));
        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());
    }
}