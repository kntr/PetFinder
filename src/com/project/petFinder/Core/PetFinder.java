package com.project.petFinder.Core;

import com.project.petFinder.Interfaces.Item;

import java.util.ArrayList;

/**
 * Created by katherinetucto on 6/18/17.
 */
public class PetFinder {
    private ArrayList<Item> pets = new ArrayList<Item>();
    private ArrayList<Item> shelters = new ArrayList<Item>();
    private Boolean init = false;

    public PetFinder() {
    }

    public void init(String petFile, String shelterFile){
        System.out.println("Initializing data...");
        System.out.println(petFile);
        System.out.println(shelterFile);

        buildPets(petFile);
        buildShelters(shelterFile);
        //TODO: load data
        init = !pets.isEmpty() && !shelters.isEmpty();
    }

    private void buildPets(String petFile) {
        DataReader reader = new DataReader();
        pets = reader.builData(petFile);
        System.out.println("Total pets: " + pets.size());
    }

    private void buildShelters(String shelterFile) {
        DataReader reader = new DataReader();
        shelters = reader.builData(shelterFile);
        System.out.println("Total shelters: " + shelters.size());
    }

    public Boolean hasData() {
        return init;
    }
}
