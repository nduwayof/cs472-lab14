package edu.mum.cs.cs472.labs.model;

import java.util.*;

/**
 * The type Beer expert.
 * @author nduwayofabrice
 * @version 1.0
 */
public class BeerExpert {
	/**
	 * Gets brands.
	 *
	 * @param color the color
	 *
	 * @return the brands
	 */
	public List getBrands(String color) {
        List<String> brands = new ArrayList<>();
        String[] array;
        if (color.equals("amber")) {
            array = new String[]{"Jack Amber", "Red Moose"};
            brands.addAll(Arrays.asList(array));
        } else {
            array = new String[]{"Jail Pale Ale", "Gout Stout"};
            brands.addAll(Arrays.asList(array));
        }
        return (brands);
    }
}