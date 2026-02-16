public class PayWithUPI implements PaymentStrategy {

    @Override
    public void paymentMethod(){
        System.out.println("Paying with UPI.");
    }
}