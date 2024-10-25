package com.example.lab8;

import java.util.ArrayList;

public class CustomList {
    private ArrayList<City> cities;

    public CustomList() {
        this.cities = new ArrayList<>();
    }

    /**
     * this gets size of the list
     * @return the size of the list
     */
    public int getCount() {
        return cities.size();
    }

    /**
     * this adds a city object to the list
     * @param city the city to add
     */
    public void addCity(City city) {

    }
}
