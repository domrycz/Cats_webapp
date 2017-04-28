package pl.domrycz;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import pl.domrycz.model.Cat;

/**
 * TERAZ ROZDZIAŁ 6 !!
 */


public class Interface {
    private static Scanner input = new Scanner(System.in);
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    private static CatDAO catDAO = new CatDAO();

    public static String getUserInput() {
        return input.nextLine();
    }

    public static void main(String[] args) {
        String menuInput;
        System.out.println("Welcome to cat's database!");
        do {
            System.out.println("\nChoose one of the following options: ");
            System.out.println("[1] Add another cat to database.");
            System.out.println("[2] Show list of cats.");
            System.out.println("[x] Exit.\n");
            do {
                System.out.print("Your choice: ");
                menuInput = getUserInput();
            } while (!menuInput.equals("1") && !menuInput.equals("2") && !menuInput.equals("x"));

            if(menuInput.equals("1"))
                menuAddCat();

            if(menuInput.equals("2"))
                menuShowCats();

        } while (!menuInput.equals("x"));
    }

    public static void menuAddCat() {
        Cat cat = new Cat();

        System.out.print("Enter cat's keeper: ");
        cat.setKeeper(getUserInput());
        System.out.print("Enter cat's name: ");
        cat.setName(getUserInput());

        String inputLoaded;
        Boolean isRight;

        Pattern datePattern = Pattern.compile("[1-2][0-9]{3}-[0-1][0-9]-[0-3][0-9]");
        do {
            System.out.print("Enter cat's birth date (yyyy-mm-dd): ");
            inputLoaded = getUserInput();
            Matcher matcher = datePattern.matcher(inputLoaded);
            isRight = matcher.matches();
            if(isRight) {
                try {
                    cat.setDate(sdf.parse(inputLoaded));
                } catch (ParseException pe) { }
            } else
                System.out.println("Wrong date format!");
        } while (cat.getDate() == null || !isRight);

        Pattern weightPattern = Pattern.compile("[0-9]{1,2}(\\.[0-9])?");
        do {
            System.out.print("Enter cat's weight (digit.digit): ");
            inputLoaded = getUserInput();
            Matcher matcher = weightPattern.matcher(inputLoaded);
            isRight = matcher.matches();
            if(isRight)
                cat.setWeight(Float.parseFloat(inputLoaded));
        } while(cat.getWeight() == null || !isRight);

        System.out.println("Cat's data saved!\n");
        catDAO.addCat(cat);
    }
    public static void menuShowCats() {
        Cat cat;
        System.out.println("Choose one of the following cats: \n");
        for(int i = 0; i < catDAO.getCatsList().size(); i++) {
            cat = catDAO.getCatsList().get(i);
            System.out.println(i + ": " + cat.getName());
        }

        Integer showCatsInput;
        do {
            System.out.print("Enter your choice: ");
            try {
                showCatsInput = Integer.valueOf(getUserInput());
                catDAO.getCatsList().get(showCatsInput);
            } catch (IndexOutOfBoundsException | NumberFormatException nfe) {
                System.out.println("You have to use a index of existing cat!");
                showCatsInput = -1;
                /** it was set to -1 to be able to properly use do-while loop**/
            }
        } while(showCatsInput == -1);

        Cat chosenCat = catDAO.getCatsList().get(showCatsInput);
        System.out.println();
        chosenCat.introduce();
    }

}
