package com.sckeedoo.certification;

import java.util.*;

public class BonusProblem {
    static class Player {
        String name;
        int age;
        int points;
        
     // Constructor
        public Player(String name, int age,
                                   int points)
        {
            this.name = name;
            this.age = age;
            this.points = points;
        }
        
        public String toString()
        {
            return this.name + " " + this.age +
                               " " + this.points;
        }
    }


   static class Sortbyage implements Comparator<Player>
    {
        // Used for sorting in ascending order by
        // age 
        public int compare(Player a, Player b)
        {
            return a.age - b.age;
        }
    }
   
   static class Sortbypoints implements Comparator<Player>
   {
       // Used for sorting in ascending order by
       // points
       public int compare(Player a, Player b)
       {
           return a.points - b.points;
       }
   }
   
   static class Sortbyname implements Comparator<Player>
   {
       // Used for sorting in ascending order by
       // age 
       public int compare(Player a, Player b)
       {

    		   return (a.name.compareTo(b.name));
       }
   
   }
  
   public static void main(String[] args) {
        Player[] players = new Player[5];

        // Adding Duke
        players[0] = new Player("Duke", 17, 200);

        // Adding Steven
        players[1] = new Player("Steven", 14, 150);

        // Adding John
        players[2] = new Player("John", 16, 200);
        // Adding Joe
        players[3] = new Player("Joe", 15, 290);
        // Adding Anna
        players[4] = new Player("Anna", 19, 270);
        /**
         * Sort the array of players in increasing order.
         * Array should be sort in 3 different ways : by name, by age and by points
         */
        
        //Copy array content to list
        List<Player> list = Arrays.asList(players);
        
        //Sorting by age
        System.out.println();
        System.out.println("Sorting by age from array!");
        Arrays.sort(players,  new Sortbyage());
        
        for (Player player:players) {
        	System.out.println(player.toString());
        }
        
        Arrays.sort(players,  new Sortbypoints());
        
        //Sorting by points
        System.out.println();
        System.out.println("Sorting by points from array!");
        for (Player player:players) {
        	System.out.println(player.toString());
        }
        
        
        Arrays.sort(players,  new Sortbyname());
        //Sorting by name
        System.out.println();
        System.out.println("Sorting by name from array!");
        for (Player player:players) {
        	System.out.println(player.toString());
        }
        System.out.println();
        System.out.println("Now, using lambda expression!");
        //Sorting by age
        System.out.println();
        System.out.println("Sorting by age in list!");
        Collections.sort(list, (player1, player2) -> Integer.compare(player1.age, player2.age));
        for (Player player:list) {
        	System.out.println(player.toString());
        }
        System.out.println();
        System.out.println("Sorting by age in array !");
        Arrays.sort(players, Comparator.comparingInt(p->p.age));
        for (Player player:players) {
        	System.out.println(player.toString());
        }
      //Sorting by points
        System.out.println();
        System.out.println("Sorting by points in list!");
        Collections.sort(list, (player1, player2) -> Integer.compare(player1.points, player2.points));
        for (Player player:list) {
        	System.out.println(player.toString());
        }
        System.out.println();
        System.out.println("Sorting by points in array!");
        Arrays.sort(players, Comparator.comparingInt(p->p.points));
        for (Player player:players) {
        	System.out.println(player.toString());
        }
      //Sorting by name
        System.out.println();
        System.out.println("Sorting by name in array!");
        Arrays.sort(players, Comparator.comparing(p->p.name));
        for (Player player:players) {
        	System.out.println(player.toString());
        }
        System.out.println();
        System.out.println("Sorting by name in list!");
        Collections.sort(list, (player1, player2) -> player1.name.compareTo(player2.name));
        for (Player player:list) {
        	System.out.println(player.toString());
        }
    }
}