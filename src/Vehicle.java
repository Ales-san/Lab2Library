public abstract class Vehicle {
    protected String name;
    protected String number;
    protected String owner;

    protected Vehicle(String name, String number, String owner) {
        this.name = name;
        this.number = number;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public String getOwner() {
        return owner;
    }

    public abstract char getRequiredCategory();

    public abstract int getRequiredAge();

    public abstract String getVehicleType();
}
