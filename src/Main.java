import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehicle> db = new ArrayList<>();
        db.add(new Motorbike("UIO", "P732CE", "Martin Smith"));
        db.add(new Car("RTY", "X589OK", "John Simmons"));
        db.add(new Truck("QWE", "T983PA", "Jane Simmons"));
        db.add(new Bus("PAS", "M521EH", "Dora Jakob"));
        db.add(new Moped("DFG", "O822HE", "Jerald Black"));
        for (Vehicle v : db) {
            System.out.println(v.getVehicleType() + " " + v.getName() + " "
                    + v.getNumber() + " " + v.getOwner() + " "
                    + v.getRequiredAge() + " " + v.getRequiredCategory());
        }
    }
}
