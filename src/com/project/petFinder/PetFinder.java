package com.project.petFinder;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Map;

/**
 * Created by katherinetucto on 6/18/17.
 */
public class PetFinder {
    private ArrayList<Pet> pets = new ArrayList<Pet>();
    private ArrayList<Shelter> shelters = new ArrayList<Shelter>();
    private Boolean init = false;

    public PetFinder() {
    }

    public void init(String petFile, String shelterFile){
        System.out.println("Initializing data...");
        System.out.println(petFile);
        System.out.println(shelterFile);

        //TODO: load data
        init = !pets.isEmpty() && !shelters.isEmpty();
    }

    public Boolean hasData() {
        return init;
    }
}
