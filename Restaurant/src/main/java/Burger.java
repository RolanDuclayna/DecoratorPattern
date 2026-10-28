public class Burger implements Food{

    @Override
    public String getDescription() {
        return "Burger";
    }

    @Override
    public Double getCost() {
        return 4.00;
    }
}
