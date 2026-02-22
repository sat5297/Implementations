public class PanPizza extends Pizza {

    public PanPizza() {
        description = "Pan";
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