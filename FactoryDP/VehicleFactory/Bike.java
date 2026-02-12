public class Bike extends Vehicle {

    public Bike() {
        super("Bike Engine", "Disk brakes");
    }

    @Override
    public void details(){
        System.out.println("Car : " + engine + " Brake : " + brake);
    }
}