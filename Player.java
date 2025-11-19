//Class with data for each baseball player in the MLB 2025 regular season
public class Player {

  private String name;               //Player name
  private String position;           //Player position (abbreviated)
  private String team;               //Player team (abbreviated)
  private double battingAverage;     //Player batting average
  private int homeRuns;              //Amount of home runs

  /*
   * No-argument constructor for a default player
   */
  public Player() {
    name = "unknown";
    position = "none";
    team = "none";
    battingAverage = 0.0;
    homeRuns = 0;
  }

  /*
   * Parameterized constructor
   */
  public Player(String name, String position, String team, double battingAverage, int homeRuns) {
    this.name = name;
    this.position = position;
    this.team = team;
    this.battingAverage = battingAverage;
    this.homeRuns = homeRuns;
  }

/*
 * Accessor methods
 */

  /*
   * Gets the player name
   */
  public String getName() {
    return name;
  }

  /*
   * Gets the player's position
   */
  public String getPosition() {
    return position;
  }

  /*
   * Gets the player's team
   */
  public String getTeam() {
    return team;
  }

  /*
   * Gets the player's batting average
   */
  public double getBattingAverage() {
    return battingAverage;
  }

  /*
   * Gets the player's amount of home runs
   */
  public int getHomeRuns() {
    return homeRuns;
  }

  /*
   * toString() override that displays the attributes of the player
   */
  public String toString() {
    //Returns the name, position, team, batting average, and amount of home runs, each on a new line
    return "Name: " + name + "\nPosition: " + position + "\nTeam: " + team + "\nBatting Average: " + battingAverage + "\nHome Runs: " + homeRuns;
  }
}