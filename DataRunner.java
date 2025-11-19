import java.util.Scanner;

public class DataRunner {
  public static void main(String[] args) {

    UserStory iLoveBaseball = new UserStory("players.txt", "positions.txt", "teams.txt", "batting_averages.txt", "homeruns.txt");

    //Prints the toString() of the UserStory object
    System.out.println(iLoveBaseball);     //Prints the name, positon, team, batting average, and home runs of each player
    System.out.println();
    
    //Prints the name of the player with the highest batting average
    System.out.println("Player With the Highest Batting Average: " + iLoveBaseball.findHighestBA());
    
    //Prints the name of the player with the most home runs
    System.out.println("\nPlayer With the Most Home Runs: " + iLoveBaseball.findMostHR());
    System.out.println();
    
    //Prints the names of the players on the LA Dodgers
    iLoveBaseball.printDodgerPlayers();
  }
}