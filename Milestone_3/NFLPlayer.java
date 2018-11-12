//Made By Daniel Sabanov


package nflteammanager;


public class NFLPlayer {
    //properties
    int playerHeight;
    int playerPassDistance;
    int playerRunDistance;
    int playerSpeed;
    int playerAge;
    int playerWeight;
    String playerFirstName;
    String playerLastName;
    String playerPosition;
    String playerCurrentTeam;
    //constructor with no arguments
    
    public NFLPlayer(){
        playerHeight = 175;
        playerPassDistance = (int)(Math.random() * 1000 + Math.random() * 100 + Math.random() * 10);
        playerRunDistance = (int)(Math.random() * 1000 + Math.random() * 100 + Math.random() * 10);
        playerSpeed = (int)(Math.random() * 5 + 6);
        playerAge = (int)(Math.random() * 10 + Math.random() * 10 + 20 );
        playerWeight = (int)(Math.random() * 100 + Math.random() * 10 + 120);
        playerFirstName = "Dark";
        playerLastName = "Horse";
        playerPosition = "QB";
        playerCurrentTeam  = "Minnesota Vikings";
    }
    //constructor with arguments
    public NFLPlayer(int height, int passDistance, int runDistance, int speed, 
            int age, int weight, String firstName, String lastName, String position,
            String currentTeam){
        
        playerHeight = height;
        playerPassDistance = passDistance;
        playerRunDistance = runDistance;
        playerSpeed = speed;
        playerAge = age;
        playerWeight = weight;
        playerFirstName = firstName;
        playerLastName = lastName;
        playerPosition = position;
        playerCurrentTeam = currentTeam;
    
    }
    
    // toString method
    @Override
    public String toString(){
        return "Player's height is " + Integer.toString(playerHeight) + "\n"
                + "Player's pass distance is " + Integer.toString(playerPassDistance) + "\n"
                + "Player's run distance is " + Integer.toString(playerRunDistance) + "\n"
                + "Player's speed is " + Integer.toString(playerSpeed) + "\n"
                + "Player's age is " + Integer.toString(playerAge) + "\n"
                + "Player's weight is " + Integer.toString(playerWeight) + "\n"
                + "Player's first name is " + playerFirstName + "\n" 
                + "Player's last name is " + playerLastName + "\n"
                + "Player's position is " + playerPosition + "\n"
                + "Player's current team is " + playerCurrentTeam;
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
    
    public int getPlayerRunDistance(){
        return playerRunDistance;
    }
    
    public int getPlayerPassDistance(){
    return playerPassDistance;
    }
    
    public int getPlayerOverallDistance(){
        return playerPassDistance + playerRunDistance;
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
    
    public void setPlayerPassDistance(int n){
        playerPassDistance = n;
    }
    
    public void setPlayerRunDistance(int n){
        playerRunDistance = n;
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
