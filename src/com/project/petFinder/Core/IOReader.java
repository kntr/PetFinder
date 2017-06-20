package com.project.petFinder.Core;

import java.util.Scanner;

/**
 * Created by katherinetucto on 6/18/17.
 */
public class IOReader {
    private Scanner reader;
    public IOReader() {
        reader = new Scanner(System.in);
    }

    public String readInput() {
        String input = reader.nextLine();
        return input;
    }
}
