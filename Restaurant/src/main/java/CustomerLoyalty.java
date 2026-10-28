public class CustomerLoyalty {
    private double loyaltyNumber;

    public CustomerLoyalty(double loyaltyNumber) {
        this.loyaltyNumber = loyaltyNumber;
    }

    public double getDiscount() {
        return (50.0 * loyaltyNumber) / 100;
    }
}
