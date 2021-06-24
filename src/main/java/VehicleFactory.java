public class VehicleFactory {

    public Vehicle getVehicleType(String name) {
        if (name.equalsIgnoreCase("bus")) {
            return new Bus();
        } else if (name.equalsIgnoreCase("car")) {
            return new Car();
        } else {
            throw new RuntimeException("un-supported vehicle type");
        }
    }
}
