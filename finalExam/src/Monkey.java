public class Monkey extends Animal{

    private String favouriteFood;
    public Monkey(String name, int weight, String favouriteFood) {
        super(name, weight);
        this.favouriteFood = favouriteFood;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }
}
