public class Main {
    public static void main(String[] args) {
        factoryGenerator generator = new factoryGenerator();

        Factory volvoFactory = generator.getFactory("Volvo");
        Bike volvoBike = volvoFactory.createBike();
        Car volvoCar = volvoFactory.createCar();

        System.out.println(volvoBike.brake + " " + volvoBike.engine);
        System.out.println(volvoCar.brake + " " + volvoCar.engine);
        volvoBike.createBike();
        volvoCar.createCar();

        Factory fordFactory = generator.getFactory("Ford");
        Bike fordBike = fordFactory.createBike();
        Car fordCar = fordFactory.createCar();

        System.out.println(fordBike.brake + " " + fordBike.engine);
        System.out.println(fordCar.brake + " " + fordCar.engine);
        fordBike.createBike();
        fordCar.createCar();
    }
}