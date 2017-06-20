package com.project.petFinder.Core;

import com.project.petFinder.Interfaces.Item;

/**
 * Created by katherinetucto on 6/18/17.
 */
public class Pet implements Item {
    private String type;
    private String breed;
    private String name;
    private String size;
    private String age;
    private String gender;
    private String city;
    private String shelter;
    private Boolean booleanValue;

    public Pet() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
        System.out.println("Type:" + this.type);
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
        System.out.println("Breed:" + this.breed);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Name:" + this.name);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
        System.out.println("Size:" + this.size);
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
        System.out.println("Age:" + this.age);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
        System.out.println("Gender:" + this.gender);
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
        System.out.println("City:" + this.city);
    }

    public String getShelter() {
        return shelter;
    }

    public void setShelter(String shelter) {
        this.shelter = shelter;
        System.out.println("Shelter:" + this.shelter);
    }

    public Boolean getBooleanValue() {
        return booleanValue;
    }

    public void setBooleanValue(Boolean booleanValue) {
        this.booleanValue = booleanValue;
        System.out.println("Boolean:" + this.booleanValue);
    }

    @Override
    public Object build(String[] attributes) {
        Pet pet = new Pet();
        pet.setType(attributes[0]);
        pet.setBreed(attributes[1]);
        pet.setName(attributes[2]);
        pet.setSize(attributes[3]);
        pet.setAge(attributes[4]);
        pet.setGender(attributes[5]);
        pet.setBooleanValue(new Boolean(attributes[6]));
        pet.setCity(attributes[7]);
        pet.setShelter(attributes[8]);
        return pet;
    }
}
