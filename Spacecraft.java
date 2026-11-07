public abstract class Spacecraft {
    private String name;
    private double fuelLevel;

    public Spacecraft() {
        this.name = "Default Craft";
        this.fuelLevel = 100.0;
    }

    public Spacecraft(String name, double fuelLevel) {
        this.name = name;
        this.fuelLevel = fuelLevel;
    }

    public String getName() {
        return name;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public abstract void transmitData();

    @Override
    public String toString() {
        return "Spacecraft Name: " + name + ", Fuel Level: " + fuelLevel + "%";
    }
}
