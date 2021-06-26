import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehicle> db = new ArrayList<>();
        try {
            db.add(new Motorbike("UIO", "P732CE", "Martin Smith"));
            db.add(new Car("RTY", "X589OK", "John Simmons"));
            db.add(new Truck("QWE", "T983PA", "Jane Simmons"));
            db.add(new Bus("PAS", "M521EH", "Dora Jakob"));
            db.add(new Moped("DFG", "O822HE", "Jerald Black"));
            db.add(new Tram("GTI", "K842YE", "John Doe"));

            for (Vehicle v : db) {
                System.out.println(v.getVehicleType() + " " + v.getName() + " "
                        + v.getNumber() + " " + v.getOwner() + " "
                        + v.getRequiredAge() + " " + v.getRequiredCategory());
            }
        } catch (VehicleException e) {
            System.out.println(e.getMessage());
        }
        Random rand = new Random();
        for(int i = 0; i < 100; i++) {
            try {
                String number = "";
                number += String.valueOf((char)('A'+ rand.nextInt(26)));
                for(int j = 0; j < 3; j++) {
                    number += (char) ('0' + rand.nextInt(10));
                }
                number += String.valueOf((char)('A'+ rand.nextInt(26))) + String.valueOf((char)('A'+ rand.nextInt(26)));
                Vehicle v = (new Car(String.valueOf(i), number, Integer.toHexString(i + 15000) + Integer.toOctalString(i + 15000)));
                System.out.print("\n" + v.getVehicleType() + " " + v.getName() + " "
                        + v.getNumber() + " " + v.getOwner() + " "
                        + v.getRequiredAge() + " " + v.getRequiredCategory() + " Next: ");
            } catch (VehicleException e) {
                System.out.print(i + " ");
            }

        }
    }
}
