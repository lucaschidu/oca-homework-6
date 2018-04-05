package com.sckeedoo.certification;

public class Problem1 {

    static class Animal {
        String name;
        int numberOfLegs;
        double weight;
        int age;
        
        //method will print info about our object
        public void info(){
            System.out.println("Here is an example of printing info within Animal class");
            System.out.println("Animal = {name='"+name+"', age="+age+", numberOfLegs="+numberOfLegs"}");
        }
    }

    /**
     * Create an Animal object. Give it a state (name, numberOfLegs, weight)
     * print the object in this format : ex Animal = {name='Mickey', age=110, numberOfLegs=2}
     *
     */
    public static void main(String[] args) {
        
        //create ne object of Animal type
        Animal animal = new Animal();
        
        //Filling properties
        animal.name = 'Spanky';
        animal.age = 30;
        animal.numberOfLegs = 4;
        
        //Calling method info
        animal.info();
        
        //Print info from main class
        System.out.println("Here is an example of printing info from main class, using dot");
        System.out.println("Animal = {name='"+animal.name+"', age="+animal.age+", numberOfLegs="+animal.numberOfLegs"}");
        
    }
}
