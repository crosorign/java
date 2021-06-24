public class VehicleClass {

    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();
        System.out.println(vehicleFactory.getVehicleType("bus").getVehicleName());
        System.out.println(vehicleFactory.getVehicleType("car").getVehicleName());
    }
}
