public class Snake extends Animal {

    private int length;
    public Snake(String name, int weight, int length) {
        super(name, weight);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
