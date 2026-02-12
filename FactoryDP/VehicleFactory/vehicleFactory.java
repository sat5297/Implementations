public class vehicleFactory {
    public Vehicle getVehicle(String vehicle) {
        if (vehicle.equalsIgnoreCase("Bike"))
            return new Bike();
        
        else if (vehicle.equalsIgnoreCase("Car"))
            return new Car();
        
        return new Null();
    }
}