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

        System.out.println("Cat's data saved!");
        catDAO.addCat(cat);
    }


}
