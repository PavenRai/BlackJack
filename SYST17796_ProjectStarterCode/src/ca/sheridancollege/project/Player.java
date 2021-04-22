/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 * @author dancye, 2018
 */
public abstract class Player 
{
    //small change 22
    private String playerID; //the unique ID for this player
    private int winCount = 0;//The win count
    private int tieCount = 0;//The tie count
    private int lossCount = 0;//The loss count
    /**
     * A constructor that allows you to set the player's unique ID
     * @param name the unique ID to assign to this player.
     */
    public Player(String name)
    {
        playerID= name;
    }
    
    /**
     * @return the playerID
     */
    public String getPlayerID() 
    {
        return playerID;
    }

    /**
     * Ensure that the playerID is unique
     * @param givenID the playerID to set
     */
    public void setPlayerID(String givenID) 
    {
        playerID = givenID;
    }
    
    /**
     * The method to be instantiated when you subclass the Player class
     * with your specific type of Player and filled in with logic to play your game.
     */
    public abstract void play();
    //Methods to count Winn Tie and Losss for player 
    public void addWin()
    {
        winCount++;
    }

    public void addTie()
    {
        tieCount++;
    }

    public void addLoss()
    {
        lossCount++;
    }

    //The result of the player 
    public void printResult()
    {
        System.out.println ("Player " + (playerID) + ": " + winCount + " win(s), " + tieCount + " tie(s) and " + lossCount + " loss(es)");
    }
    
}
