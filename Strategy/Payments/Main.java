public class Main {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext(new PayWithCC());
        paymentContext.makePayment();

        paymentContext.setPaymentContext(new PayWithDC());
        paymentContext.makePayment();

        paymentContext.setPaymentContext(new PayWithUPI());
        paymentContext.makePayment();
    }
}