public abstract class Vehicle {
    String engine;
    String brake;

    public Vehicle(String engine, String brake) {
        this.brake = brake;
        this.engine = engine;
    }

    public abstract void details();
}