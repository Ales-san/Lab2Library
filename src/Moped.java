public class Moped extends Vehicle{
    private static final char requiredCategory = 'M';
    private static final int requiredAge = 16;
    private static final String type = "Moped";

    public Moped(String name, String number, int ownerId) throws VehicleException {
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
