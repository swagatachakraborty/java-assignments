package com.league;

// Create a generic class to implement a league table for a sport.
// The class should allow teams to be added to the list, and store
// a list of teams that belong to the league.
//
// Your class should have a method to print out the teams in order,
// with the team at the top of the league printed first.
//
// Only teams of the same type should be added to any particular
// instance of the league class - the program should fail to compile
// if an attempt is made to add an incompatible team.

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class League<T extends Team> {
    private String name;
    private List<T> teams = new ArrayList<T>();

    public League(String name) {
        this.name = name;
    }

    public void addTeams(T team) {
        this.teams.add(team);
        this.sort();
    }

    public void showLeaderBoard() {
        Iterator<T> iterator = this.teams.listIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }
    }

    private void sort() {
//        for (T team: this.teams) {
//            for (int i=1; i<this.teams.size(); i++) {
//                if(team.compare(teams.get(i)) < 0) {
//                    T temp = teams.get(i);
//                    this.teams.com.set(i, team);
//                    this.teams.com.set(i-1, team);
//                }
//            }
//        }

        this.teams.sort(new Comparator<T>() {
            @Override
            public int compare(T team1, T team2) {
                return team2.compare(team1);
            }
        });
    }
}


