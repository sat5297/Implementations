public class CashProcessor500 extends CashProcessor {
    public CashProcessor500(CashProcessor nextCashProcessor) {
        super(nextCashProcessor);
    }

    @Override
    public int dispenseCash(int amount) {
        int notes_500 = 0;
        int notes_needed = amount / 500;
        System.out.println("Notes 500");
        System.out.println(NOTES_500);
        System.out.println("Amount");
        System.out.println(amount);
        System.out.println("Notes needed");
        System.out.println(notes_needed);
        if (notes_needed <= NOTES_500) {
            System.out.println("In if of 500");
            notes_500 = notes_needed;
            amount = amount - 500 * notes_needed;
            NOTES_500 -= notes_needed;
        } else {
            notes_500 = NOTES_500;
            NOTES_500 = 0;
            amount = amount - notes_500 * 500;
        }
        System.out.println("Notes 500");
        System.out.println(notes_500);
        if (amount == 0) {
            return notes_500;
        }
        int nextNotes = 0;
        if (nextCashProcessor != null) {
            nextNotes = nextCashProcessor.dispenseCash(amount);
        }
        return notes_500 + nextNotes;
    }
}