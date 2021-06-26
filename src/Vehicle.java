public abstract class Vehicle {
    protected String name;
    protected String number;
    protected String owner;
    protected String letterList = "ETYOPAHKXCBM";

    protected Vehicle(String name, String number, String owner) throws VehicleException {
        if(number.length() != 6 &&
                letterList.lastIndexOf(number.charAt(0)) == -1 ||
                letterList.lastIndexOf(number.charAt(4)) == -1 ||
                letterList.lastIndexOf(number.charAt(5)) == -1 ||
                number.charAt(1) < '0' || number.charAt(1) > '9' ||
                number.charAt(2) < '0' || number.charAt(2) > '9' ||
                number.charAt(3) < '0' || number.charAt(3) > '9') {
            throw new VehicleException("Wrong format of the number");
        }
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
