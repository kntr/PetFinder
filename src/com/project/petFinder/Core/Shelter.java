package com.project.petFinder.Core;

import com.project.petFinder.Interfaces.Item;

/**
 * Created by katherinetucto on 6/18/17.
 */
public class Shelter implements Item {
    private String name;
    private String streetAddress;
    private String city;
    private String state;
    private String zipcode;
    private String phone;
    private String number;
    private String description;

    public Shelter() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public Object build(String[] attributes) {
        Shelter shelter = new Shelter();
        shelter.setName(attributes[0]);
        shelter.setStreetAddress(attributes[1]);
        shelter.setCity(attributes[2]);
        shelter.setState(attributes[3]);
        shelter.setZipcode(attributes[4]);
        shelter.setPhone(attributes[5]);
        shelter.setDescription(attributes[6]);
        return shelter;
    }
}
