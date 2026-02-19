public class CashProcessor2K extends CashProcessor {
    public CashProcessor2K(CashProcessor nextCashProcessor) {
        super(nextCashProcessor);
    }

    @Override
    public int dispenseCash(int amount) {
        int notes_2K = 0;
        int notes_needed = amount / 2000;
        System.out.println("Notes 2000");
        System.out.println(NOTES_2K);
        System.out.println("Amount");
        System.out.println(amount);
        System.out.println("Notes needed");
        System.out.println(notes_needed);
        if (notes_needed <= NOTES_2K) {
            notes_2K = notes_needed;
            amount = amount - notes_2K * 2000;
            NOTES_2K -= notes_2K;
        } else {
            notes_2K = NOTES_2K;
            NOTES_2K = 0;
            amount = amount - notes_2K * 2000;
        }
        System.out.println("Notes 2000");
        System.out.println(notes_2K);
        if (amount == 0) {
            return notes_2K;
        }
        int nextNotes = 0;
        if (nextCashProcessor != null) {
            nextNotes = nextCashProcessor.dispenseCash(amount);
        }
        return notes_2K + nextNotes;
    }
}