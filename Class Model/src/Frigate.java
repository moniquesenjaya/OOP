public class Frigate extends Vehicle implements SeaVessel{

    public int displacement;

    public Frigate(int displacement, String name, int maxPassengers, int maxSpeed) {
        this.displacement = displacement;
        this.name = name;
        this.maxPassengers = maxPassengers;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void launch() {
        System.out.println("Launching...");
    }

    public void fireGun(){
        System.out.println("Fire!");
    }
}
