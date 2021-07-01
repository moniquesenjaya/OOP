public class Lion extends Animal{

    private int lbOfMeat;

    public Lion(String name, int weight, int lbOfMeat) {
        super(name, weight);
        this.lbOfMeat = lbOfMeat;
    }

    public int getLbOfMeat() {
        return lbOfMeat;
    }

    public void setLbOfMeat(int lbOfMeat) {
        this.lbOfMeat = lbOfMeat;
    }
}
