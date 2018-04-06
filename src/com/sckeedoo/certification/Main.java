package com.sckeedoo.certification;

public class Main {

    public static void main(String[] args) {


        System.out.println(new Animal("Mickey", 4, 20));
        System.out.println("\r\nThe winner is: \r\n" + getPlayersProblem2().getWinner());

        Players players3 = getPlayersProblem3();
        System.out.println("\r\nFor Players from Problem 3 we have:");
        System.out.println("Points sum: " + players3.getPointsSum() + " Points Average: " + players3.getPointsAvg());

        System.out.println("\r\nPlayers from Problem 4 introduce themselves: ");
        getPlayersProblem4().printPlayers();


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

    /**
     * Increment the player's score by a random number between 10 and 20
     */
}