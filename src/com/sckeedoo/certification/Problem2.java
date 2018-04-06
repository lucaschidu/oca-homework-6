package com.sckeedoo.certification;

public class Problem2 {

    static class Player {
        String name;
        int age;
        int points;

        public Player(String name, int age, int points){
            this.name = name;
            this.age = age;
            this.points = points;
        }

        public String toString(){
            return "name = " + this.name + ", age = " + this.age;
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
         * Print the winner's name and age. More points the better.
         */
        int point = 0;
        int win = 0;
        for (int index = 0; index< players.length; index++){
            if (players[index].points > point) {
                point = players[index].points;
                win = index;
            }
        }

        System.out.println(players[win].toString());

    }
}
