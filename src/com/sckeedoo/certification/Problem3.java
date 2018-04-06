package com.sckeedoo.certification;

import java.util.Arrays;
import java.util.List;

public class Problem3 {

    static class Player {
        String name;
        int age;
        int points;
        int sum;
        int len;

        public Player(String name, int age, int points){
            this.name = name;
            this.age = age;
            this.points = points;
            this.sum += points;
            this.len++;
        }

        public int displaySum(){
            return this.sum;
        }
        
        public double displayAvg(){
            return sum / len;
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
         * Print the sum and the average points of all players.
         */
        s
    }
}
