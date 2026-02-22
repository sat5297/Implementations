public class CheeseBurstPizza extends Pizza {

    public CheeseBurstPizza() {
        description = "CheeseBurst";
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