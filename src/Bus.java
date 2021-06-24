public class Bus extends Vehicle{
    private static final char requiredCategory = 'D';
    private static final int requiredAge = 21;
    private static final String type = "Bus";

    public Bus(String name, String number, String owner) throws VehicleException {
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
