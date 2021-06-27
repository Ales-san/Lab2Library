public abstract class Vehicle {
    protected String name;
    protected String number;
    protected int ownerId;
    protected static final String letterList = "ETYOPAHKXCBM";

    protected Vehicle(String name, String number, int id) throws VehicleException {
        if(!checkNumber(number)) {
            throw new VehicleException("Wrong format of the number");
        }
        this.name = name;
        this.number = number;
        this.ownerId = id;
    }

    public static boolean checkNumber(String number) {
        if(number.length() != 6 &&
                letterList.lastIndexOf(number.charAt(0)) == -1 ||
                letterList.lastIndexOf(number.charAt(4)) == -1 ||
                letterList.lastIndexOf(number.charAt(5)) == -1 ||
                number.charAt(1) < '0' || number.charAt(1) > '9' ||
                number.charAt(2) < '0' || number.charAt(2) > '9' ||
                number.charAt(3) < '0' || number.charAt(3) > '9') {
            return false;
        }
        return true;
    }
    
    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public abstract char getRequiredCategory();

    public abstract int getRequiredAge();

    public abstract String getVehicleType();
}
