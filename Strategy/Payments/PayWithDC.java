public class PayWithDC implements PaymentStrategy {

    @Override
    public void paymentMethod(){
        System.out.println("Paying with Debit Card.");
    }
}