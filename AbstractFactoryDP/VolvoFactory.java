public class VolvoFactory extends Factory {

    @Override
    public Car createCar() {
        return new VolvoCar("Volvo Car", "Volvo Car");
    }

    @Override
    public Bike createBike() {
        return new VolvoBike("Volvo Bike", "Volvo Bike");
    }
}