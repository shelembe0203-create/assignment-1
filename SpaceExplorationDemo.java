public class SpaceExplorationDemo {
    public static void main(String[] args) {
        Spacecraft sat = new Satellite("Hubble-X", 88.5, 540.0);
        Spacecraft rover = new Rover("Curiosity-II", 92.0, 6);

        Spacecraft[] missionFleet = {sat, rover};

        System.out.println("=== DEMONSTRATING POLYMORPHISM ===");
        for (Spacecraft craft : missionFleet) {
            craft.transmitData();
        }

        System.out.println("\n=== DEMONSTRATING toString() CALLS ===");

        System.out.println("[Explicit Call]:");
        System.out.println(sat.toString());

        System.out.println("\n[Implicit Call]:");
        System.out.println(rover); 
    }
}
