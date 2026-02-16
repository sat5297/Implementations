public class VolvoCar extends Car {
    
    public VolvoCar(String engine, String brake) {
        super(engine, brake);
    }

    @Override
    public void createCar() {
        System.out.println("Volvo::Car Engine::" + engine + " Brake::" + brake);
    }
}