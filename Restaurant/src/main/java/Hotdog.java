public class Hotdog implements Food{
    @Override
    public String getDescription() {
        return "Hotdog";
    }

    @Override
    public Double getCost() {
        return 3.5;
    }
}
