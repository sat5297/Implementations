public abstract class Car {
    String engine;
    String brake;

    Car(String engine, String brake) {
        this.engine = engine;
        this.brake = brake;
    }

    public abstract void createCar();
}