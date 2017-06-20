package com.project.petFinder.Core;

/**
 * Created by katherinetucto on 6/18/17.
 */
public class Driver {
    private static PetFinder finder = new PetFinder();

    public static void main(String[] args) {
        System.out.println("Welcome to Driver!");
        finder.init(args[0], args[1]);

        Boolean done = false;
        while (!done) {
            if (finder.hasData())
                done = executePetFinder();
            else {
                done = true;
                System.out.println("No data found!");
            }
        }

    }

    private static Boolean executePetFinder() {
        IOReader reader = new IOReader();
        System.out.println("Do you wish to search for Pets or Shelters?");
        String input = reader.readInput();
        System.out.println("Value:" + input);
        if (input.equalsIgnoreCase("X")) return true;
        if (input.trim().equalsIgnoreCase("PETS"))
            System.out.println("ok");
        return false;
    }


}
