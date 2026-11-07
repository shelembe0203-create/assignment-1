public class Rover extends Spacecraft {
    private int wheelsCount;

    public Rover() {
        super();
        this.wheelsCount = 6;
    }

    public Rover(String name, double fuelLevel, int wheelsCount) {
        super(name, fuelLevel);
        this.wheelsCount = wheelsCount;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    @Override
    public void transmitData() {
        System.out.println(getName() + " [Rover] is sending surface soil analysis using its " + wheelsCount + "-wheel drive relay system.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Wheels Count: " + wheelsCount + " (Type: Rover)";
    }
}
