public class RestaurantDriver {

    public static void main(String[] args) {

        CustomerOrder johnson = new CustomerOrder();
        CustomerLoyalty loyalty = new CustomerLoyalty(0.75);

        Food loadedBurger = new Onion(new Ketchup(new Mustard(new Cheese(new Burger()))));

        Food cheeseBurger = new Cheese(new Burger());

        Food plainBurger = new Burger();

        Food loadedHotdog = new Mustard(new Ketchup(new Onion(new Hotdog())));

        Food plainHotdog = new Hotdog();

        johnson.addFoodItem(loadedBurger);
        johnson.addFoodItem(cheeseBurger);
        johnson.addFoodItem(plainBurger);
        johnson.addFoodItem(loadedHotdog);
        johnson.addFoodItem(plainHotdog);

        double discountTotal = johnson.getTotalCost() - (johnson.getTotalCost() * loyalty.getDiscount());

        System.out.println("Customer's total cost without discount: $" + johnson.getTotalCost());
        System.out.println("With applied discount: $" + discountTotal);

    }
}
