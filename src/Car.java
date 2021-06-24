public class Car extends Vehicle {
    private static final char requiredCategory = 'B';
    private static final int requiredAge = 18;
    private static final String type = "Car";

    public Car(String name, String number, String owner) {
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
