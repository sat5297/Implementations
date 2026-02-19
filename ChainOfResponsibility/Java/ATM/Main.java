public class Main {
    public static void main(String[] args) {
        CashProcessor cashProcessor = new CashProcessor2K(new CashProcessor500(new CashProcessor200(null)));
        System.out.println("Starts exec");
        if (cashProcessor.totalAvailableCash() >= 5000)
            System.out.println(cashProcessor.dispenseCash(5000));
        cashProcessor.display();
        if (cashProcessor.totalAvailableCash() >= 8000)
            System.out.println(cashProcessor.dispenseCash(8000));
        cashProcessor.display();
    }
}