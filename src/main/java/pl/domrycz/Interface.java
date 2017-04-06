package pl.domrycz;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import pl.domrycz.model.Cat;

/**
 * TERAZ ZADANIE 4 - WYRAŻENIA REGULARNE. DATY NIE ZMIENIAĆ ALE RESZTĘ OGARNĄĆ!
 */


public class Interface {
    static Scanner input = new Scanner(System.in);

    static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    static String getUserInput() {
        return input.nextLine();
    }
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.print("Enter cat's keeper: ");
        cat.setKeeper(getUserInput());
        System.out.print("Enter cat's name: ");
        cat.setName(getUserInput());
        do {
            System.out.print("Enter cat's birth date (yyyy-mm-dd): ");
            try {
                cat.setDate(sdf.parse(getUserInput()));
            } catch (ParseException pe) {
                System.out.println("Wrong date format!");
            }
        } while (cat.getDate() == null);
        do {
            try {
                System.out.print("Enter cat's weight: ");
                cat.setWeight(Float.parseFloat(getUserInput()));
            } catch (NullPointerException npe) {
                System.out.println("You have to enter cat's weight!");
            } catch (NumberFormatException nfe) {
                System.out.println("Enter weight in format digit.digit!");
            }
        } while (cat.getWeight() == null);
    }

}
