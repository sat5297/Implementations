public class FordBike extends Bike {
    
    public FordBike(String engine, String brake) {
        super(engine, brake);
    }

    @Override
    public void createBike() {
        System.out.println("FordBike::Bike Engine::" + engine + " Brake::" + brake);
    }
}