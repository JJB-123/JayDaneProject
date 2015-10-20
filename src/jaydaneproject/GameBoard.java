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
    String[][] PLAYERTOKENPAIRS; // Key, Value ex: ["GENDER"]["FEMALE"]
    
    // Constructor - Needed to build object
    public GameBoard(String seed, String playerName, int[] letterCount){
        this.GLOBALSEED = seed;
        this.PLAYERNAME = playerName;        
        this.SEEDVALUES = letterCount;
    }
    
    public void GeneratePlayerTokenSeed(int[] _SEEDVALUES){
        
        // count of Zeros in _SEEDVALUES
        int zeroCount = 0;
        // Loop through the number array - Pulling out non-zero values
        for (int x = 0; x < _SEEDVALUES.length; x++){          
            
            // Use the 'count of zeros' to determine Gender
            if(_SEEDVALUES[x] == 0){
                zeroCount = zeroCount + 1;
            }  
        }
         
        // Debug line - Print out the # of 0's in the SEEDVALUES array
        System.out.print(zeroCount);    
    }
    
    public static void Run(String[] args) {
        
    }
}
