public class Truck extends Vehicle {
    private static final char requiredCategory = 'C';
    private static final int requiredAge = 18;
    private static final String type = "Truck";

    public Truck(String name, String number, String owner) throws VehicleException {
        super(name, number, owner);
    }

    @Override
    public char getRequiredCategory() {
        return requiredCategory;
    }

    @Override
    public int getRequiredAge() {
        return requiredAge;
    }

    @Override
    public String getVehicleType() {
        return type;
    }
}
