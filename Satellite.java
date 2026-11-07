public class Satellite extends Spacecraft {
    private double orbitAltitude;

    public Satellite() {
        super();
        this.orbitAltitude = 500.0;
    }

    public Satellite(String name, double fuelLevel, double orbitAltitude) {
        super(name, fuelLevel);
        this.orbitAltitude = orbitAltitude;
    }

    public double getOrbitAltitude() {
        return orbitAltitude;
    }

    public void setOrbitAltitude(double orbitAltitude) {
        this.orbitAltitude = orbitAltitude;
    }

    @Override
    public void transmitData() {
        System.out.println(getName() + " [Satellite] is transmitting telemetry data from orbit altitude of " + orbitAltitude + " km.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Orbit Altitude: " + orbitAltitude + " km (Type: Satellite)";
    }
}
