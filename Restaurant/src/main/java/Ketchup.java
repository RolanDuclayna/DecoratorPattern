public class Ketchup extends Topping {

    public Ketchup(Food food) {
        super(food);
    }

    @Override
    public String getDescription() {
        return food.getDescription() + ", with Ketchup";
    }

    @Override
    public Double getCost() {
        return food.getCost() + 0.25;
    }
}
