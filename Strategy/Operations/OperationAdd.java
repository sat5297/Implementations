public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int a, int b){
        System.out.println("Operation ADD in java");
        System.out.println(a + b);
        return a + b;
    }
}