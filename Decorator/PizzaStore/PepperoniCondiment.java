public class PepperoniCondiment extends CondimentDecorator {

    public PepperoniCondiment(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " Pepperoni";
    }

    @Override
    public double cost() {
        return pizza.cost() + 0.30;
    }
}