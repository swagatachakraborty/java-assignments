package com.league;

public class Football extends Team{
    public Football(String name, int winingGames, int drawGames, int loosingGames){
        super(name, winingGames, drawGames, loosingGames);

    }

    @Override
    public int calculateNetPoint() {
        return drawGames * 0 + winingGames * 1 - loosingGames * 2;
    }
}
