public class JalapenoCondiment extends CondimentDecorator {

    public JalapenoCondiment(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " Jalapeno";
    }

    @Override
    public double cost() {
        return pizza.cost() + 0.39;
    }
}