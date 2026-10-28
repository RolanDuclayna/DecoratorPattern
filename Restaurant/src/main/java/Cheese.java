public class Cheese extends Topping {

    public Cheese(Food food) {
        super(food);
    }

    @Override
    public String getDescription() {
        return food.getDescription() + ", with Cheese";
    }

    @Override
    public Double getCost() {
        return food.getCost() + 0.5;
    }
}
