import java.util.Scanner;

//Class that represents the User Story
public class UserStory {

  private Player[] players;      //1D array with Player objects

  /*
   * Parameterized constructor for the UserStory object
   */
  public UserStory(String namesFile, 
                   String positionsFile, 
                   String teamsFile, 
                   String battingAveragesFile, 
                   String homeRunsFile) {
    //Uses the createPlayerArray method to create the array with the text files
    players = createPlayerArray(namesFile, positionsFile, teamsFile, battingAveragesFile, homeRunsFile);
  }

  /*
   * Creates a 1D array of Player objects by reading the text tiles
   */
  public Player[] createPlayerArray(String namesFile, 
                                    String positionsFile, 
                                    String teamsFile,
                                    String battingAveragesFile, 
                                    String homeRunsFile) {
    String[] namesArray = FileReader.toStringArray(namesFile);
    String[] positionsArray = FileReader.toStringArray(positionsFile);
    String[] teamsArray = FileReader.toStringArray(teamsFile);
    double[] battingAveragesArray = FileReader.toDoubleArray(battingAveragesFile);
    int[] homeRunsArray = FileReader.toIntArray(homeRunsFile);
    Player[] playersArray = new Player[namesArray.length];
    for (int i = 0; i < playersArray.length; i++) {
      playersArray[i] = new Player(namesArray[i], positionsArray[i], teamsArray[i], battingAveragesArray[i], homeRunsArray[i]);
    }
    return playersArray;
  }

  /*
   * Finds the name of the Player object with the highest batting average
   */
  public String findHighestBA() {
    int highest = 0;
    for (int i = 0; i < players.length; i++) {
      if (players[i].getBattingAverage() > players[highest].getBattingAverage()) {
        highest = i;
      }
    }
    return players[highest].getName();
  }

  /*
   * Finds the name of the Player object with the most home runs
   */
  public String findMostHR() {
    int most = 0;
    for (int i = 0; i < players.length; i++) {
      if (players[i].getHomeRuns() > players[most].getHomeRuns()) {
        most = i;
      }
    }
    return players[most].getName();
  }

  /*
   * Prints the names of the players on the LA Dodgers
   */
  public void printDodgerPlayers() {
    //Stores the number of Dodger players in the players 1D array
    int spots = 0;
    for (Player player : players) {
      if (player.getTeam().equals("LAD")) {
        spots++;
      }
    }
    //Creates the 1D array with the correct amount of indexes
    String[] dodgerPlayers = new String[spots];
    //Assigns the names of the Dodger players to the Dodger players 1D array from the players 1D array at the correct index
    int dodgerIndex = 0;
    for (int i = 0; i < players.length; i++) {
      if (players[i].getTeam().equals("LAD")) {
        dodgerPlayers[dodgerIndex] = players[i].getName();
        dodgerIndex++;
      }
    }
    //Prints the names
    System.out.println("Players on the Los Angeles Dodgers:");
    for (String player : dodgerPlayers) {
      System.out.println(player);
    }
  }

  /*
   * toString() override that displays the attributes of all the players
   */
  public String toString() {
    String returnThis = "PLAYERS: ";
    //Traverses throught the players 1D array and saves the toString() of each one
    for (Player player : players) {
      returnThis += "\n\n" + player;
    }
    return returnThis;
  }
}