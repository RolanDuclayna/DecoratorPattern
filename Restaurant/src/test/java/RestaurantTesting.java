import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RestaurantTesting {

    Food cheeseburger = new Cheese(new Burger());
    Food hotdog = new Ketchup(new Mustard(new Hotdog()));
    CustomerLoyalty loyalty = new CustomerLoyalty(0.75);

    @Test
    public void testBurgerCost() {
        assertEquals(4.5, cheeseburger.getCost());
    }

    @Test
    public void testHotdog() {
        String expectedDescription = "Hotdog, with Mustard, with Ketchup";
        double expectedCost = 4.1;
        assertEquals(expectedDescription, hotdog.getDescription());
        assertEquals(expectedCost, hotdog.getCost());
    }

    @Test
    public void testDiscount() {
        assertEquals(37.5, loyalty.getDiscount());
    }

    @Test
    public void testTotalCost() {
        CustomerOrder customer = new CustomerOrder(50);
        customer.addFoodItem(cheeseburger);
        customer.addFoodItem(hotdog);
        assertEquals(8.6, customer.getTotalCost());
    }



}
