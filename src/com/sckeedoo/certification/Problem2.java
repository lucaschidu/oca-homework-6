package com.sckeedoo.certification;

public class Problem2 {

    static class Player {
        String name;
        int age;
        int points;
    }


    public static void main(String[] args) {
        Player[] players = new Player[5];
        int maxPoints = 0;
        int numberOfWinners = 0;
        //create a Player object, we will use it to save results
        //Player winner = new Player();
        
        
        // Adding John
        players[0] = new Player();
        players[0].name = "John";
        players[0].age = 17;
        //players[0].points = 200;
        players[0].points = 290;

        // Adding Steven
        players[1] = new Player();
        players[1].name = "Steven";
        players[1].age = 14;
        players[1].points = 150;

        // Adding Maria
        players[2] = new Player();
        players[2].name = "Maria";
        players[2].age = 16;
        players[2].points = 270;

        // Adding Anna
        players[3] = new Player();
        players[3].name = "Anna";
        players[3].age = 15;
        players[3].points = 180;

        // Adding Igor
        players[4] = new Player();
        players[4].name = "Igor";
        players[4].age = 19;
        players[4].points = 290;

        /**
         * Print the winner's name and age. More points the better.
         */
         //going through array using foreach to find the best result
         //there can be more than 1, so we are looking for this condition too
        for (Player player:players)
        {
            if (player.points > maxPoints){
            maxPoints = player.points;
            numberOfWinners = 1;
            }
            else if (player.points == maxPoints){
             numberOfWinners++;
            }
        }
        
        //create new array to populate with winner(s), array lenght is equal to numberOfWinners
        Player[] winners = new Player[numberOfWinners];
        
        //reset numberOfWinners, don't need it anymore for previous purpose
        numberOfWinners = 0;
        
        //going through array "player" to extarct winners and populate array "winners"
        for (Player player:players)
        {
            if (player.points == maxPoints){
            winners[numberOfWinners] = new Player();
            winners[numberOfWinners] = player;
            numberOfWinners++;
            }
        }
        
        //Printing results
        for (Player winner:winners)
        {
            System.out.println("The winner is "+winner.name+", " + winner.age + " years old, having "+ winner.points+" points.");
        }
    }
}
