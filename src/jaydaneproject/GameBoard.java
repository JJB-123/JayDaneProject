/*
 * 
 */
package jaydaneproject;


/**
 * @author Jason
 */
public class GameBoard {
        
    String GLOBALSEED;
    String PLAYERNAME;
    int[] SEEDVALUES;

    
    // Constructor - Needed to build object
    public GameBoard(String seed, String playerName, int[] letterCount){
        this.GLOBALSEED = seed;
        this.PLAYERNAME = playerName;        
        this.SEEDVALUES = letterCount;
    }
   
    
    public static void Run(String[] args) {
        
    }
}
