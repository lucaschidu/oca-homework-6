package com.sckeedoo.certification;

public class Problem4 {

    static class Player {
        String name;
        int age;
        int points;

        public Player(String name, int age, int points){
            this.name = name;
            this.age = age;
            this.points = points;
        }

        public String sayHello(){
            return "Hello  " + this.name;
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
         * Make all the players say hello and their name
         */

        for(Player player: players) {
            System.out.println(player.sayHello());
        }
    }
}
