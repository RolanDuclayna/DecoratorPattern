public class Onion extends Topping{
    public Onion(Food food) {
        super(food);
    }

    @Override
    public String getDescription() {
        return food.getDescription() + ", with Mustard";
    }

    @Override
    public Double getCost() {
        return food.getCost() + 0.70;
    }
}
