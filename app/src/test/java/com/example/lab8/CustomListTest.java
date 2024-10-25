package com.example.lab8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    /**
     * create a mock list for testing
     * @return a new CustomList instance
     */
    @BeforeEach
    public void setUp() {
        list = new CustomList();
    }

    /**
     * test the addCity method
     * verifies that the list size increases by one when a city is added
     */
    @Test
    public void addCityTest() {
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(), listSize + 1);
    }
}
