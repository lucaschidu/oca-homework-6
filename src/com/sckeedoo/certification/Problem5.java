package com.sckeedoo.certification;

import java.util.Random;

public class Problem5 {

    static class Player {
        String name;
        int age;
        int points;
        int pointsIncrementedBy;
        
        //method to print points
        public void printPoints(){
        	String textToPrint = name + " has " + points + " points."; 
            if (pointsIncrementedBy != 0) {
            	textToPrint +=" Points incremented by " + pointsIncrementedBy+".";
            }
            System.out.println(textToPrint);
        }
    }


    public static void main(String[] args) {
        Player[] players = new Player[5];

        Random random = new Random();
        
        // Adding Diana
        players[0] = new Player();
        players[0].name = "Diana";
        players[0].age = 17;
        players[0].points = 200;

        // Adding Steven
        players[1] = new Player();
        players[1].name = "Steven";
        players[1].age = 14;
        players[1].points = 150;

        // Adding John
        players[2] = new Player();
        players[2].name = "John";
        players[2].age = 16;
        players[2].points = 250;

        // Adding Joe
        players[3] = new Player();
        players[3].name = "Joe";
        players[3].age = 15;
        players[3].points = 180;

        // Adding Anna
        players[4] = new Player();
        players[4].name = "Anna";
        players[4].age = 19;
        players[4].points = 270;

        /**
         * Increment the player's score by a random number between 10 and 20
         */
        //Printing values before
        System.out.println("Printing values before increment!");
        for(Player player: players) {
            player.printPoints();
        }
        
        for(Player player: players) {
        	player.pointsIncrementedBy = random.nextInt(10)+10;
        	player.points += player.pointsIncrementedBy;
        }
        
        System.out.println("Printing values after increment!");
        for(Player player: players) {
            player.printPoints();
        }
    }
}