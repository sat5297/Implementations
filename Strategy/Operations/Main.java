public class Main {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println(context.performOperation(10, 20));
        
        context.setStrategy(new OperationProduct());
        System.out.println(context.performOperation(10, 20));

        context.setStrategy(new OperationSub());
        System.out.println(context.performOperation(10, 20));
    }
}