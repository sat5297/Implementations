public class FordCar extends Car {
    
    public FordCar(String engine, String brake) {
        super(engine, brake);
    }

    @Override
    public void createCar() {
        System.out.println("FordCar::Car Engine::" + engine + " Brake::" + brake);
    }
}