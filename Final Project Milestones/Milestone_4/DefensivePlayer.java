// Made by Daniel Sabanov
package nflteammanager;

public class DefensivePlayer extends NFLPlayer {
    
    int playersTuckled;
    int playerInterceptions;
    
     public DefensivePlayer(){
        playerHeight = 175;
        playerInterceptions = (int)(Math.random() * 100 + Math.random() * 10);
        playersTuckled = (int)(Math.random() * 100 + Math.random() * 10);
        playerSpeed = (int)(Math.random() * 5 + 6);
        playerAge = (int)(Math.random() * 10 + Math.random() * 10 + 20 );
        playerWeight = (int)(Math.random() * 100 + Math.random() * 10 + 120);
        playerFirstName = "Dark";
        playerLastName = "Horse";
        playerPosition = "DB";
        playerCurrentTeam  = "Minnesota Vikings";
    }
     
     
     public DefensivePlayer(int height, int interceptions, int tuckled, int speed, 
            int age, int weight, String firstName, String lastName, String position,
            String currentTeam){
        playerHeight = height;
        playersTuckled = tuckled;
        playerInterceptions = interceptions;
        playerSpeed = speed;
        playerAge = age;
        playerWeight = weight;
        playerFirstName = firstName;
        playerLastName = lastName;
        playerPosition = position;
        playerCurrentTeam = currentTeam;
    
    }
     
      @Override
    public String toString(){
        return "Player's height is " + Integer.toString(playerHeight) + "\n"
                + "Player made " + Integer.toString(playersTuckled) + " tuckles" + "\n"
                + "Player made " + Integer.toString(playerInterceptions) + " interceptions" + "\n"
                + "Player's speed is " + Integer.toString(playerSpeed) + "\n"
                + "Player's age is " + Integer.toString(playerAge) + "\n"
                + "Player's weight is " + Integer.toString(playerWeight) + "\n"
                + "Player's first name is " + playerFirstName + "\n" 
                + "Player's last name is " + playerLastName + "\n"
                + "Player's position is " + playerPosition + "\n"
                + "Player's current team is " + playerCurrentTeam + "\n";
    }
    
    public int getPlayersTuckled(){
        return playersTuckled;
    }
    
    public int getPlayerInterceptions(){
        return playerInterceptions;
    }
    
    public void setPlayersTuckled(int n){
        playersTuckled = n;
    }
    
    public void setPlayerInterceptions(int n){
        playerInterceptions = n;
    }
}
