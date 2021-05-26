public class Hovercraft extends Vehicle implements LandVehicle,SeaVessel {

    public int numWheels, displacement;

    public Hovercraft(int numWheels, int displacement, String name, int maxPassengers, int maxSpeed) {
        this.numWheels = numWheels;
        this.displacement = displacement;
        this.name = name;
        this.maxPassengers = maxPassengers;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void drive() {
        System.out.println("Driving...");
    }

    @Override
    public void launch() {
        System.out.println("Launching...");
    }

    public void enterLand(){
        System.out.println("Entering land...");
    }

    public void enterSea(){
        System.out.println("Entering sea...");
    }
}
