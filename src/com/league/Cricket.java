package com.league;

public class Cricket extends Team{
    public Cricket(String name, int winingGames, int drawGames, int loosingGames) {
        super(name, winingGames, drawGames, loosingGames);
    }

    @Override
    public int calculateNetPoint() {
        return drawGames * 1 + winingGames * 2 - loosingGames * 0;
    }
}
