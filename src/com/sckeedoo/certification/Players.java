package com.sckeedoo.certification;

import java.util.ArrayList;
import java.util.Iterator;

public class Players {
    ArrayList<Player> playerList;

    public Players() {
        this.playerList = new ArrayList<Player>();
    }

    public void add(String name, int age, int points) {
        playerList.add(new Player(name, age, points));
    }

    public Player getWinner() {
        Iterator<Player> iterator = playerList.iterator();
        Player max = iterator.next();

        while (iterator.hasNext()) {
            Player temp = iterator.next();
            if (max.compareTo(temp) < 0) max = temp;
        }
        return max;
    }

    public int getPointsSum() {
        int sum = 0;
        for (Player player : playerList)
            sum += player.points;
        return sum;
    }

    public double getPointsAvg() {
        return getPointsSum() / playerList.size();
    }

    public void printPlayers() {
        for (Player p : playerList)
            System.out.println("Hello, my name is " + p.name);
    }

    private class Player implements Comparable<Player> {
        private String name;
        private int age;
        private int points;

        public Player(String name, int age, int points) {
            this.name = name;
            this.age = age;
            this.points = points;
        }

        @Override
        public int compareTo(Player o) {
            return points - o.points;
        }

        @Override
        public String toString() {
            return "Player = {" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", points=" + points +
                    '}';
        }
    }


}
