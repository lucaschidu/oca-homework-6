package com.sckeedoo.certification;

import java.util.Iterator;
import java.lang.Math;


public class Main {

    public static void main(String[] args) {


        System.out.println(new Animal("Mickey", 4, 20));
        System.out.println("\r\nThe winner is: \r\n" + getPlayersProblem2().getWinner());

        Players players3 = getPlayersProblem3();
        System.out.println("\r\nFor Players from Problem 3 we have:");
        System.out.println("Points sum: " + players3.getPointsSum() + " Points Average: " + players3.getPointsAvg());

        System.out.println("\r\nPlayers from Problem 4 introduce themselves: ");
        getPlayersProblem4().printPlayers();

        System.out.println("\r\nFor Problem 5 we have new Points");
        Iterator<Players.Player> iterator = getPlayersProblem5().iterator();

        while (iterator.hasNext()) {
            //Increment the player's score by a random number between 10 and 20
            Players.Player player = iterator.next();

            StringBuilder output = new StringBuilder("For player " + player.getName() + ". ");
            output.append("Old score: " + player.getPoints() + ' ');

            int newscore = (int) (player.getPoints() + Math.random() * 10 + 10);
            player.setPoints(newscore);
            output.append("New Score " + newscore);

            System.out.println(output);
        }


        Players pBonus = getBonusProblem();
        System.out.println("\r\nOriginal player list for Bonus problem");
        pBonus.printAll();

        System.out.println("\r\nSorting by NAME:");
        pBonus.sort(SortBy.NAME);
        pBonus.printAll();

        System.out.println("\r\nSorting by AGE:");
        pBonus.sort(SortBy.AGE);
        pBonus.printAll();

        System.out.println("\r\nSorting by POINTS:");
        pBonus.sort(SortBy.POINTS);
        pBonus.printAll();


    }

    public static Players getPlayersProblem2() {
        Players p = new Players();
        p.add("John", 17, 200);
        p.add("Steven", 14, 150);
        p.add("Maria", 16, 250);
        p.add("Anna", 15, 180);
        p.add("Igor", 19, 270);
        return p;
    }

    public static Players getPlayersProblem3() {
        Players p = new Players();
        p.add("Mickey", 17, 200);
        p.add("Steven", 14, 150);
        p.add("John", 16, 250);
        p.add("Joe", 15, 180);
        p.add("Anna", 19, 270);
        return p;
    }

    public static Players getPlayersProblem4() {
        Players p = new Players();
        p.add("Luke", 17, 200);
        p.add("Steven", 14, 150);
        p.add("John", 16, 250);
        p.add("Joe", 15, 180);
        p.add("Anna", 19, 270);
        return p;
    }

    public static Players getPlayersProblem5() {
        Players p = new Players();
        p.add("Diana", 17, 200);
        p.add("Steven", 14, 150);
        p.add("John", 16, 250);
        p.add("Joe", 15, 180);
        p.add("Anna", 19, 270);
        return p;
    }

    public static Players getBonusProblem() {
        Players p = new Players();
        p.add("Duke", 17, 200);
        p.add("Steven", 14, 150);
        p.add("John", 16, 250);
        p.add("Joe", 15, 180);
        p.add("Anna", 19, 270);
        return p;
    }

    /**
     * Sort the array of playerList in increasing order.
     * Array should be sort in 3 different ways : by name, by age and by points */


}