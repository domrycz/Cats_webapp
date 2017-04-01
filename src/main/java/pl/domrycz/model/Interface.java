package pl.domrycz.model;

import java.util.Scanner;

public class Interface {
    static Scanner input = new Scanner(System.in);
    static Cat cat = new Cat();
    static String getUserInput() {
        return input.nextLine();
    }
    public static void main(String[] args) {
        System.out.print("Enter cat's keeper: ");
        cat.setKeeper(getUserInput());
        System.out.print("Enter cat's name: ");
        cat.setName(getUserInput());

    }

}
