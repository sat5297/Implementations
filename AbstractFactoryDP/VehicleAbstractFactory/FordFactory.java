public class FordFactory extends Factory {

    @Override
    public Car createCar() {
        return new FordCar("Ford Car", "Ford Car");
    }

    @Override
    public Bike createBike() {
        return new FordBike("Ford Bike", "Ford Bike");
    }
}