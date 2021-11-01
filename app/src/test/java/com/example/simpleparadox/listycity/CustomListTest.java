package com.example.simpleparadox.listycity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;

    @BeforeEach
    public void createList() {
        list = new CustomList(null, new ArrayList<>());
    }

    @Test
    public void addCityTest() {
        int listSize = list.getCount();
        list.addCity(new City("Edmonton", "Alberta"));
        assertEquals(listSize + 1, list.getCount());
    }

    @Test
    public void hasCityTest() {
        assertEquals(false, list.hasCity(new City("Qingdao", "Shandong")));
    }

    @Test
    public void deleteCityTest() {
        if (list.hasCity(new City("Edmonton", "Alberta")) == false) {
            list.addCity(new City("Edmonton", "Alberta"));
        }
        list.delete(new City("Edmonton", "Alberta"));
        assertFalse(list.hasCity(new City("Edmonton", "Alberta")));
    }
}
