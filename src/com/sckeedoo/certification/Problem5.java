package com.sckeedoo.certification;

import java.util.Random;

public class Problem5 {

    static class Player {
        String name;
        int age;
        int points;

        public Player(String name, int age, int points){
            this.name = name;
            this.age = age;
            this.points = points;
        }

        public void setRandom(){
            Random random = new Random();
            this.points += random.nextInt(10) + 10;
        }

    }


    public static void main(String[] args) {
        Player[] players = new Player[5];

        // Adding John
        players[0] = new Player("John",17,200);

        // Adding Steven
        players[1] = new Player("Steven",14,150);

        // Adding Maria
        players[2] = new Player("Maria",16,250);

        // Adding Anna
        players[3] = new Player("Anna",15,180);

        // Adding Igor
        players[4] = new Player("Igor",19,270);

        /**
         * Increment the player's score by a random number between 10 and 20
         */
        for(Player player: players) {
            player.setRandom();
        }
    }
}
