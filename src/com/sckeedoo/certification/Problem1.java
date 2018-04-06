package com.sckeedoo.certification;

public class Problem1 {

    static class Animal {
        String name;
        int numberOfLegs;
        double weight;

        public Animal(String name, int numberOfLegs, double weight){
            this.name = name;
            this.numberOfLegs = numberOfLegs;
            this.weight = weight;
        }

        public String toString(){
            return "name = " + this.name + ", numberOfLegs = " + this.numberOfLegs + ", weight = " + this.weight;
        }
    }

    /**
     * Create an Animal object. Give it a state (name, numberOfLegs, weight)
     * print the object in this format : ex Animal = {name='Mickey', age=110, numberOfLegs=2}
     *
     */
    public static void main(String[] args) {
        Animal[] animal = new Animal[1];
        animal[0] = new Animal("Mickey", 4, 3.4);
        System.out.println(animal[0].toString());
    }
}
