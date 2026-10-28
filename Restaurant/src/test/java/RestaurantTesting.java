import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RestaurantTesting {

    Food cheeseburger = new Cheese(new Burger());
    Food hotdog = new Ketchup(new Mustard(new Hotdog()));

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

}
