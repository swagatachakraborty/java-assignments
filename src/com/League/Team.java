package com.League;

public abstract class Team<T extends  Team> {
    protected String name;
    protected int winingGames;
    protected int drawGames;
    protected int loosingGames;


    public Team(String name, int winingGames, int drawGames, int loosingGames) {
        this.name = name;
        this.winingGames = winingGames;
        this.drawGames = drawGames;
        this.loosingGames = loosingGames;
    }

    public String getName() {
        return name;
    }

    public int compare(Team otherTeam) {
        return this.calculateNetPoint() - otherTeam.calculateNetPoint();
    };

    public abstract int calculateNetPoint();
}
