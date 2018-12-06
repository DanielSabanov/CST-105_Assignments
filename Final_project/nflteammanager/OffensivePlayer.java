// Made by Daniel Sabanov
package nflteammanager;

public class OffensivePlayer extends NFLPlayer {

    int playerPassDistance;
    int playerRunDistance;

    public OffensivePlayer() {
        playerHeight = 175;
        playerPassDistance = (int) (Math.random() * 1000 + Math.random() * 100 + Math.random() * 10);
        playerRunDistance = (int) (Math.random() * 1000 + Math.random() * 100 + Math.random() * 10);
        playerSpeed = (int) (Math.random() * 5 + 6);
        playerAge = (int) (Math.random() * 10 + Math.random() * 10 + 20);
        playerWeight = (int) (Math.random() * 100 + Math.random() * 10 + 120);
        playerFirstName = "Dark";
        playerLastName = "Horse";
        playerPosition = "QB";
        playerCurrentTeam = "Minnesota Vikings";
    }

    public OffensivePlayer(int height, int passDistance, int runDistance, int speed,
            int age, int weight, String firstName, String lastName, String position,
            String currentTeam) {
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

    @Override
    public String toString() {
        return "Player's name is " + playerFirstName + " " + playerLastName + "\n"
                +"Player's height is " + Integer.toString(playerHeight) + "\n"
                + "Player's pass distance is " + Integer.toString(playerPassDistance) + "\n"
                + "Player's run distance is " + Integer.toString(playerRunDistance) + "\n"
                + "Player's speed is " + Integer.toString(playerSpeed) + "\n"
                + "Player's age is " + Integer.toString(playerAge) + "\n"
                + "Player's weight is " + Integer.toString(playerWeight) + "\n"
                + "Player's position is " + playerPosition + "\n"
                + "Player's current team is " + playerCurrentTeam + "\n";
    }

    public int getPlayerRunDistance() {
        return playerRunDistance;
    }

    public int getPlayerPassDistance() {
        return playerPassDistance;
    }

    public int getPlayerOverallDistance() {
        return playerPassDistance + playerRunDistance;
    }

    public void setPlayerPassDistance(int n) {
        playerPassDistance = n;
    }

    public void setPlayerRunDistance(int n) {
        playerRunDistance = n;
    }

}
