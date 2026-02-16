public class factoryGenerator {
    public Factory getFactory(String name) {
        if ("Volvo".equals(name)) {
            return new VolvoFactory();
        }
        return new FordFactory();
    }
}