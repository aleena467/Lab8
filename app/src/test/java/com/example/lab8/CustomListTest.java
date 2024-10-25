package com.example.lab8;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    /**
     * Create a mock list for testing
     * @return a new CustomList instance
     */
    @BeforeEach
    public void setUp() {
        list = new CustomList();
    }

    /**
     * Test the addCity method
     * Verifies that the list size increases by one when a city is added
     */
    @Test
    public void addCityTest() {
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(), listSize + 1);
    }

    /**
     * Test the hasCity method
     * Verifies if a city is in the list
     */
    @Test
    public void hasCityTest() {
        City city = new City("Estevan", "SK");
        assertFalse(list.hasCity(city));  // The list doesn't have the city yet
        list.addCity(city);
        assertTrue(list.hasCity(city));   // Now the city should be in the list
    }

    /**
     * Test the deleteCity method
     * Verifies if a city can be removed from the list
     */
    @Test
    public void deleteCityTest() {
        City city = new City("Estevan", "SK");
        list.addCity(city);
        assertTrue(list.hasCity(city));    // Verify the city was added
        list.deleteCity(city);             // Attempt to delete the city
        assertFalse(list.hasCity(city));   // Verify the city was removed
    }

    /**
     * Test the countCities method (failing test)
     * Verifies the number of cities in the list
     */
    @Test
    public void countCitiesTest() {
        assertEquals(0, list.getCount());  // Initially, the list is empty
        list.addCity(new City("Estevan", "SK"));
        assertEquals(1, list.getCount());  // After adding one city
        list.addCity(new City("Regina", "SK"));
        assertEquals(2, list.getCount());  // After adding another city
    }
}
