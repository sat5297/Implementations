public class VolvoBike extends Bike {
    
    public VolvoBike(String engine, String brake) {
        super(engine, brake);
    }

    @Override
    public void createBike() {
        System.out.println("Volvo::Bike Engine::" + engine + " Brake::" + brake);
    }
}