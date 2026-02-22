public class VeggieDelightPizza extends Pizza {

    public VeggieDelightPizza() {
        description = "VeggieDelight";
    }
    
    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double cost() {
        return 10;
    }
}