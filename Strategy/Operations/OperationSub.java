public class OperationSub implements Strategy {

    @Override
    public int doOperation(int a, int b) {
        System.out.println("Operation SUBTRACT in java");
        System.out.println(a - b);
        return a - b;
    }
}