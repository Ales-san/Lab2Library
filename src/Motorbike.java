public class Motorbike extends Vehicle {
    private static final char requiredCategory = 'A';
    private static final int requiredAge = 18;
    private static final String type = "Motorbike";

    public Motorbike(String name, String number, int ownerId) throws VehicleException {
        super(name, number, ownerId);
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
