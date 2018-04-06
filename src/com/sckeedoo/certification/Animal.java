package com.sckeedoo.certification;

/**
 * Create an Animal object. Give it a state (name, numberOfLegs, weight)
 * print the object in this format : ex Animal = {name='Mickey', age=110, numberOfLegs=2}
 */

public class Animal {
    //No getters or setters (INTENTIONALLY)
    private String name;
    private int numberOfLegs;
    private double weight;

    public Animal(String name, int numberOfLegs, double weight) {
        this.name = name;
        this.numberOfLegs = numberOfLegs;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal = {" +
                "name='" + name + '\'' +
                ", numberOfLegs=" + numberOfLegs +
                ", weight=" + weight + "kg }";
    }
}




