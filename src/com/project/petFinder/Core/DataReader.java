package com.project.petFinder.Core;

import com.project.petFinder.Core.Pet;
import com.project.petFinder.Interfaces.Item;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by katherinetucto on 6/18/17.
 */
public class DataReader {
    private Boolean isPet = false;
    public DataReader() {
    }

    public ArrayList<Item> builData(String sourceFile) {
        Scanner in = null;
        ArrayList<Item> list = new ArrayList<Item>();
        isPet = sourceFile.toUpperCase().contains("PET");
        try {
            in = new Scanner(new FileReader(sourceFile));
            while(in.hasNextLine()) {
                StringBuilder sb = new StringBuilder();
                sb.append(in.nextLine());
                String line = sb.toString();
                System.out.println("line: " + line);
                if (!line.isEmpty() && !line.startsWith("#")){
                    Item item;
                    if (isPet)
                        item = (Item)(new Pet().build(line.split(",|;")));
                    else
                        item = (Item)(new Shelter().build(line.split(",|;")));

                    list.add(item);
                }
            }
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return list;
   }

}
