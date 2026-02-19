public class CashProcessor200 extends CashProcessor {
    public CashProcessor200(CashProcessor nextCashProcessor) {
        super(nextCashProcessor);
    }

    @Override
    public int dispenseCash(int amount) {
        int notes_200 = 0;
        int notes_needed = amount / 200;
        System.out.println("Notes 200");
        System.out.println(NOTES_200);
        System.out.println("Amount");
        System.out.println(amount);
        System.out.println("Notes needed");
        System.out.println(notes_needed);
        if (notes_needed <= NOTES_200) {
            notes_200 = notes_needed;
            amount = amount - 200 * notes_needed;
            NOTES_200 -= notes_needed;
        } else {
            notes_200 = NOTES_200;
            NOTES_200 = 0;
            amount = amount - notes_200 * 200;
        }
        System.out.println("Notes 200");
        System.out.println(notes_200);
        if (amount == 0) {
            return notes_200;
        }
        int nextNotes = 0;
        if (nextCashProcessor != null) {
            nextNotes = nextCashProcessor.dispenseCash(amount);
        }
        if (amount != 0) {
            System.out.println("Can not process the amount. Returning");
            return 0;
        }
        return notes_200 + nextNotes;
    }
}