import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RestaurantTesting {

    Food cheeseburger = new Cheese(new Burger());

    @Test
    public void testBurgerCost() {
        assertEquals(4.5, cheeseburger.getCost());
    }

}
