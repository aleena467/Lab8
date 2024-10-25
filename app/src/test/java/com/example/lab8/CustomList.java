package com.example.lab8;

import java.util.ArrayList;

public class CustomList {
    private ArrayList<City> cities;

    public CustomList() {
        this.cities = new ArrayList<>();
    }

    /**
     * This adds a city object to the list
     * @param city the city to add
     */
    public void addCity(City city) {
        cities.add(city);
    }

    /**
     * This checks if a city exists in the list
     * @param city the city to check
     * @return true if the city is in the list, false otherwise
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    /**
     * This removes a city from the list
     * @param city the city to remove
     */
    public void deleteCity(City city) {
        cities.remove(city);
    }


}
