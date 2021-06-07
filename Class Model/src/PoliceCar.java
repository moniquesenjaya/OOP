public class PoliceCar extends Vehicle implements LandVehicle,IsEmergency {

    int numWheels;

    public PoliceCar(int numWheels, String name, int maxPassengers, int maxSpeed) {
        this.numWheels = numWheels;
        this.name = name;
        this.maxPassengers = maxPassengers;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void soundSiren() {
        System.out.println("NINUNINUNINU!!!!");
    }

    @Override
    public void drive() {
        System.out.println("VRUM VRUM!!!");
    }

    public void lockCar(){
        System.out.println("Car Locked!");
    }

}
