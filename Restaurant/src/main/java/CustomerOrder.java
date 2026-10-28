import java.util.ArrayList;
import java.util.List;

public class CustomerOrder {

    private List<Food> foodItems;

    public CustomerOrder() {
        this.foodItems = new ArrayList<>();
    }

    public void addFoodItem(Food foodItem) {
        foodItems.add(foodItem);
    }

    public double getTotalCost() {
        double total = 0.0;
        for (Food food : foodItems) {
            total += food.getCost();
        }
        return total;
    }
}
