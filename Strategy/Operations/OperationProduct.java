public class OperationProduct implements Strategy {

    @Override
    public int doOperation(int a, int b) {
        System.out.println("Operation PRODUCT in java");
        System.out.println(a * b);
        return a * b;
    }
}