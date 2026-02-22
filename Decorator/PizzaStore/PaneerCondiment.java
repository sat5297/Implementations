public class PaneerCondiment extends CondimentDecorator {

    public PaneerCondiment(Pizza pizza) {
        this.pizza = pizza;
    }
    
    @Override
    public String getDescription() {
        return pizza.getDescription() + " Paneer";
    }

    @Override
    public double cost() {
        return pizza.cost() + 0.35;
    }
}