public class Main {
    public static void main(String[] args) {
        Pizza pizza = new PaneerCondiment(new JalapenoCondiment(new CheeseBurstPizza()));
        System.out.println(pizza.getDescription() + " Pizza");
        System.out.println(pizza.cost());


        pizza = new PepperoniCondiment(new CheeseCondiment(new VeggieDelightPizza()));
        System.out.println(pizza.getDescription() + " Pizza");
        System.out.println(pizza.cost());

        pizza = new PaneerCondiment(new CheeseCondiment(new VeggieDelightPizza()));
        System.out.println(pizza.getDescription() + " Pizza");
        System.out.println(pizza.cost());

        pizza = new PepperoniCondiment(new CheeseCondiment(new VeggieDelightPizza()));
        System.out.println(pizza.getDescription() + " Pizza");
        System.out.println(pizza.cost());

        pizza = new PaneerCondiment(new PepperoniCondiment(new VeggieDelightPizza()));
        System.out.println(pizza.getDescription() + " Pizza");
        System.out.println(pizza.cost());

        pizza = new PaneerCondiment(new CheeseCondiment(new PepperoniCondiment(new JalapenoCondiment(new CheeseBurstPizza()))));
        System.out.println(pizza.getDescription() + " Pizza");
        System.out.println(pizza.cost());
    }
}