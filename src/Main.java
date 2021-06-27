import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehicle> db = new ArrayList<>();
        try {
            db.add(new Motorbike("UIO", "P732CE", 123));
            db.add(new Car("RTY", "X589OK", 124));
            db.add(new Truck("QWE", "T983PA", 125));
            db.add(new Bus("PAS", "M521EH", 126));
            db.add(new Moped("DFG", "O822HE", 127));
            db.add(new Tram("GTI", "K842YE", 128));

            for (Vehicle v : db) {
                System.out.println(v.getVehicleType() + " " + v.getName() + " "
                        + v.getNumber() + " " + v.getOwnerId() + " "
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
                Vehicle v = (new Tram(String.valueOf(i), number, i + 15000));
                System.out.print("\n" + v.getVehicleType() + " " + v.getName() + " "
                        + v.getNumber() + " " + v.getOwnerId() + " "
                        + v.getRequiredAge() + " " + v.getRequiredCategory() + " Next: ");
            } catch (VehicleException e) {
                System.out.print(i + " ");
            }

        }
    }
}
