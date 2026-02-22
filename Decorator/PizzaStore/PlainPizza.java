public class PlainPizza extends Pizza {

    public PlainPizza() {
        description = "Plain";
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