public abstract class Topping implements Food {

    protected Food food;

    @Override
    public abstract String getDescription();
    @Override
    public abstract Double getCost();

}
