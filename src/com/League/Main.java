package com.League;

public class Main {
    public static void main(String[] args) {
        Cricket indXiC = new Cricket("IND XI C", 1, 2, 3);
        Cricket ausXiC = new Cricket("AUS XI C", 2, 2, 0);
        Cricket rsaXiC = new Cricket("RSA XI C", 1, 1, 1);

        League<Cricket> cricketTeamLeague = new League<>("league1");
        cricketTeamLeague.addTeams(indXiC);
        cricketTeamLeague.addTeams(ausXiC);
        cricketTeamLeague.addTeams(rsaXiC);
        cricketTeamLeague.showLeaderBoard();

        System.out.println("***************************");
        Football indXiF = new Football("IND XI F", 1, 2, 3);
        Football ausXiF = new Football("AUS XI F", 2, 2, 0);
        Football rsaXiF = new Football("RSA XI F", 1, 1, 1);

        League<Football> footballTeamLeague = new League<>("league2");
        footballTeamLeague.addTeams(indXiF);
        footballTeamLeague.addTeams(ausXiF);
        footballTeamLeague.addTeams(rsaXiF);
        footballTeamLeague.showLeaderBoard();
    }
}
