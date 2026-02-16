public abstract class Bike {
    String engine;
    String brake;

    Bike(String engine, String brake) {
        this.engine = engine;
        this.brake = brake;
    }

    public abstract void createBike();
}