public class CheeseCondiment extends CondimentDecorator {

    public CheeseCondiment(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " Cheese";
    }

    @Override
    public double cost() {
        return pizza.cost() + 0.40;
    }
}