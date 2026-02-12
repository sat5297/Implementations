

public class ShapeFactory {
    public Shape getShape(String shapeName) {
        if (shapeName.equalsIgnoreCase("Square")) 
            return new Square();
        else if (shapeName.equalsIgnoreCase("Rectangle")) 
            return new Rectangle();
        return new NULL();
    }
}