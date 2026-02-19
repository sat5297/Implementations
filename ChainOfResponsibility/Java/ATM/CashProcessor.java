public class CashProcessor {

    CashProcessor nextCashProcessor;

    int NOTES_2K = 2;
    int NOTES_500 = 8;
    int NOTES_200 = 2;

    public CashProcessor(CashProcessor cashProcessor) {
        this.nextCashProcessor = cashProcessor;
    }

    public int dispenseCash(int amount) {
        if (nextCashProcessor != null) {
            nextCashProcessor.dispenseCash(amount);
        }
        return 0;
    }

    public void display() {
        System.out.println("Display Bank Status");
        System.out.println(NOTES_2K);
        System.out.println(NOTES_500);
        System.out.println(NOTES_200);
        System.out.println("");
    }

    public int totalAvailableCash() {
        return NOTES_2K * 2000 + NOTES_500 * 500 + NOTES_200 * 200;
    }
}