package com.sckeedoo.certification;

import java.util.ArrayList;
import java.util.Iterator;

enum SortBy {
    NAME,
    AGE,
    POINTS
}

public class Players implements Iterable {
    private ArrayList<Player> playerList;
    private SortBy sortBy;

    public Players() {
        this.playerList = new ArrayList<Player>();
        sortBy = SortBy.POINTS;
    }

    public void sort(SortBy sortBy) {
        //Insertion sort algorithm
        this.sortBy = sortBy;
        int in, out;

        for (out = 1; out < playerList.size(); out++) {
            Player temp = playerList.get(out);
            in = out;

            while (in > 0 && playerList.get(in - 1).compareTo(temp) >= 0) {
                playerList.set(in, playerList.get(in - 1));
                --in;
            }
            playerList.set(in, temp);
        }
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

    public void printAll() {
        for (Player player : playerList)
            System.out.println(player);
    }


    @Override
    public Iterator iterator() {
        return playerList.iterator();
    }

    class Player implements Comparable<Player> {
        private String name;
        private int age;
        private int points;

        public Player(String name, int age, int points) {
            this.name = name;
            this.age = age;
            this.points = points;
        }

        public String getName() {
            return name;
        }

        public int getPoints() {
            return points;
        }

        public void setPoints(int points) {
            this.points = points;
        }

        @Override
        public int compareTo(Player o) {
            switch (sortBy) {
                case POINTS:
                    return points - o.points;
                case AGE:
                    return age - o.age;
                case NAME:
                    return new String(name).compareTo(o.name);
            }
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
