public class Mustard extends Topping{
    public Mustard(Food food) {
        super(food);
    }

    @Override
    public String getDescription() {
        return food.getDescription() + ", with Mustard";
    }

    @Override
    public Double getCost() {
        return food.getCost() + 0.35;
    }
}
