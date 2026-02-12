public class Null extends Vehicle {

    public Null() {
        super("Null", "Null");
    }

    @Override
    public void details(){
        System.out.println("Car : " + engine + " Brake : " + brake);
    }
}