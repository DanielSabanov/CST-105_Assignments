//Made by Daniel Sabanov
package nflteammanager;

import java.util.*;

public class NflTeamManager {

    public ArrayList<NFLPlayer> playerList;
    public ArrayList<NFLPlayer> ownedPlayers;
    public ArrayList<NFLPlayer> notOwnedPlayers;

    public NflTeamManager() {
        playerList = new ArrayList();
        ownedPlayers = new ArrayList();
        notOwnedPlayers = new ArrayList();
    }
    

    @Override
    public String toString() {
        //returns a documentation of all the players created.
        return playerList.toString();
    }

    public void createPlayers() {
        //Defensive players are created
        //(height, interceptions, tackles, speed, age, weight, first name, last name, position, current team)
        DefensivePlayer defPlayer1 = new DefensivePlayer(180, 23, 11, 11, 26, 85, "Dave", "Jones", "DB", "Packers");
        DefensivePlayer defPlayer2 = new DefensivePlayer(190, 28, 83, 13, 32, 83, "Steve", " Miles", "FS", "49ers");
        DefensivePlayer defPlayer3 = new DefensivePlayer(178, 40, 54, 13, 29, 77, "Steve", "Josh", "DB", "My team");
        DefensivePlayer defPlayer4 = new DefensivePlayer(198, 32, 42, 10, 27, 77, "James", "Jameson", "LB", "My team");
        DefensivePlayer defPlayer5 = new DefensivePlayer(185, 10, 12, 12, 31, 77, "Atrhur", "Rayan", "OLB", "My team");
        DefensivePlayer defPlayer6 = new DefensivePlayer(191, 98, 100, 12, 37, 75, "Theodore", "Rogers", "LB", "Patriots");
        
        //Offensive players are created
        // height, passDistance, runDistance, speed, age, weight, 
        // first name, last name, position, current Team
        OffensivePlayer offPlayer1 = new OffensivePlayer(180, 220, 322, 13, 27, 77, "Rayan", "Dan", "WR", "My Team");
        OffensivePlayer offPlayer2 = new OffensivePlayer(189, 190, 30, 14, 31, 82, "Dan", "Dapper", "RB", "My Team");
        OffensivePlayer offPlayer3 = new OffensivePlayer(197, 123, 126, 12, 27, 81, "Bobby", "Draper", "QB", "My Team");
        OffensivePlayer offPlayer4 = new OffensivePlayer(187, 1000, 1000, 15, 38, 71, "James", "Holden", "QB", "Stealers");
        OffensivePlayer offPlayer5 = new OffensivePlayer(192, 356, 546, 11, 32, 78, "Alex", "Thomas", "FB", "Raiders");
        OffensivePlayer offPlayer6 = new OffensivePlayer(191, 1234, 566, 12, 29, 72, "Steve", "Michaels", "TE", "Sea Hawks");
        
        //Not owned players are added to their list
        notOwnedPlayers.add(offPlayer4);
        notOwnedPlayers.add(offPlayer5);
        notOwnedPlayers.add(offPlayer6);
        notOwnedPlayers.add(defPlayer1);
        notOwnedPlayers.add(defPlayer2);
        notOwnedPlayers.add(defPlayer6);
        
        //Owned players are added to their list
        ownedPlayers.add(defPlayer3);
        ownedPlayers.add(defPlayer4);
        ownedPlayers.add(defPlayer5);
        ownedPlayers.add(offPlayer1);
        ownedPlayers.add(offPlayer2);
        ownedPlayers.add(offPlayer3);
        
        //All players are added to the list
        playerList.add(defPlayer1);
        playerList.add(defPlayer2);
        playerList.add(defPlayer3);
        playerList.add(defPlayer4);
        playerList.add(defPlayer5);
        playerList.add(defPlayer6);
        playerList.add(offPlayer1);
        playerList.add(offPlayer2);
        playerList.add(offPlayer3);
        playerList.add(offPlayer4);
        playerList.add(offPlayer5);
        playerList.add(offPlayer6);
    }
}