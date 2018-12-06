//Made By Daniel Sabanov


package nflteammanager;


public class NFLPlayer{
    //properties
    int playerHeight;
    int playerSpeed;
    int playerAge;
    int playerWeight;
    String playerFirstName;
    String playerLastName;
    String playerPosition;
    String playerCurrentTeam;
    
    
    // toString method
    @Override
    public String toString(){
        return "Player's height is " + Integer.toString(playerHeight) + "\n"
                + "Player's speed is " + Integer.toString(playerSpeed) + "\n"
                + "Player's age is " + Integer.toString(playerAge) + "\n"
                + "Player's weight is " + Integer.toString(playerWeight) + "\n"
                + "Player's first name is " + playerFirstName + "\n" 
                + "Player's last name is " + playerLastName + "\n"
                + "Player's position is " + playerPosition + "\n"
                + "Player's current team is " + playerCurrentTeam + "\n";
    }
    
    //getters
    public String getPlayerCurrentTeam(){
        return playerCurrentTeam;
    }
    
    public String getPlayerPosition(){
        return playerPosition;
    }
    
    public String getPlayerLastName(){
        return playerLastName;
    }
    
    public String getPlayerFirstName(){
        return playerFirstName;
    }
    
    public String getPlayerFullName(){
        return playerFirstName + " " + playerLastName;
    }
    
    public int getPlayerWeight(){
        return playerWeight;
    }
    
    public int getPlayerAge(){
        return playerAge;
    }
    public int getPlayerSpeed(){
        return playerSpeed;
    }

    public int getPlayerHeight(){
        return playerHeight;
    }

//setters
    public void setPlayerCurrentTeam(String s){
        playerCurrentTeam = s;
    }
    
    public void setPlayerPosition(String s){
        playerPosition = s;
    }
    
    public void setPlayerLastName(String s){
        playerLastName = s;
    }
    
    public void setPlayerFirstName(String s){
        playerFirstName = s;
    }
    
    public void setPlayerHeight(int n){
        playerHeight = n;
    }

    public void setPlayerSpeed(int n){
        playerSpeed = n;
    }
    
    public void setPlayerAge(int n){
        playerAge = n;
    }
    
    public void setPlayerWeight(int n){
        playerWeight = n;
    }
}

