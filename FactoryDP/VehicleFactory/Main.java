public class Main {
    public static void main(String[] args) {
        vehicleFactory factory = new vehicleFactory();
        Vehicle bikeVehicle = factory.getVehicle("Bike");
        Vehicle carVehicle = factory.getVehicle("Car");

        bikeVehicle.details();
        carVehicle.details();

        System.out.println(bikeVehicle.brake + " " + bikeVehicle.engine);
        System.out.println(carVehicle.brake + " " + carVehicle.engine);

        Vehicle truckVehicle = factory.getVehicle("truck");
        truckVehicle.details();
        System.out.println(truckVehicle.brake + " " + truckVehicle.engine);
    }
}