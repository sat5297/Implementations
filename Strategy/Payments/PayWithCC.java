public class PayWithCC implements PaymentStrategy {

    @Override
    public void paymentMethod(){
        System.out.println("Paying with Credit Card.");
    }
}