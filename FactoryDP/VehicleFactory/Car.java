public class Car extends Vehicle {

    public Car() {
        super("Car Engine", "4X4 brakes");
    }

    @Override
    public void details(){
        System.out.println("Car : " + engine + " Brake : " + brake);
    }
}