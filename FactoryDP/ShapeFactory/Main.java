public class Main {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        factory.getShape("Square").draw();
        factory.getShape("Rectangle").draw();
        factory.getShape("Circle").draw();
        factory.getShape("Rectangle").draw();
        factory.getShape("Triangle").draw();
        factory.getShape("Square").draw();
    }
}