/*
 */

package jaydaneproject;

import java.util.Random;

/**
 * @author Jason
 */
public class GeneratePlayerToken {
    
    String[][] PLAYERTOKENPAIRS = new String[5][5]; // Key, Value ex: ["GENDER"]["FEMALE"]
    // [0][0] = GENDER
    // [1][0] = HP
    // [2][0] = MP
    // [3][0] = NAME
    
    // Value that determines the HIGHEST random int for the RandomBufferInt function
    static int RANDOM_BUFFER = 75;
    
    public GeneratePlayerToken(){
        this.PLAYERTOKENPAIRS[0][0] = "GENDER";
        this.PLAYERTOKENPAIRS[1][0] = "HP";
        this.PLAYERTOKENPAIRS[2][0] = "MP";        
        this.PLAYERTOKENPAIRS[3][0] = "NAME";
    }
    
    public void GeneratePlayerTokenGender(int[] _SEEDVALUES){
        
        // count of Zeros in _SEEDVALUES
        int zeroCount = 0;
        // Loop through the number array - Pulling out non-zero values
        for (int x = 0; x < _SEEDVALUES.length; x++){          
            
            // Use the 'count of zeros' to determine Gender
            if(_SEEDVALUES[x] == 0){
                zeroCount = zeroCount + 1;
            }  
        }

        
        // Set to Player Token Pair
        if(zeroCount%2 == 0){ // If zeroCount is Even
            this.PLAYERTOKENPAIRS[0][1] = "MALE";
        }else{ // zeroCount is odd
            
            if(zeroCount == 21){
                this.PLAYERTOKENPAIRS[0][1] = "ANDROID";
            }else{ // odd number besides 21
                this.PLAYERTOKENPAIRS[0][1] = "FEMALE";
            }
        }
        
        // TODO - REMOVE DEBUG LINES:
        // System.out.print("Zero Count: " + zeroCount + "\n"); // Print out the # of 0's in the SEEDVALUES array
        // System.out.print(PLAYERTOKENPAIRS[0][0] + " : " + PLAYERTOKENPAIRS[0][1]); // Print out Gender Token
    }    
    
    public void GeneratePlayerTokenHP(int[] _SEEDVALUES){
    
        // String Builder to get the non-zero values
        StringBuilder HPToken = new StringBuilder();
        
        for (int x = 0; x < _SEEDVALUES.length; x++){          
            
            // Use the 'count of zeros' to determine Gender
            if(_SEEDVALUES[x] != 0){
                HPToken.append(_SEEDVALUES[x]);
            }  
        }
        
        float TempHP = Float.parseFloat(HPToken.toString());
               
        // While TempHP is greater than 1000, halve it until it's lower
        // Remainder is thrown out
        while(TempHP > 1000){
            TempHP = TempHP/2;        
        }
        
        // If HP is to low - Bring it to a default level
        // Use a random value to determine it (will be > 550)
        if(TempHP < 450){
            Random randomMaker = new Random();
            TempHP = randomMaker.nextInt(450) + 550;
        }
        
        // Round the TempHP value to nearest value
        int TempHP_int = Math.round(TempHP); 
        
        // Check if RANDOM_BUFFER value could possibly push the HP value above 1000
        if(TempHP_int + RANDOM_BUFFER > 1000){ // If it could, subtract it instead of add it
            TempHP_int = TempHP_int - RandomBufferInt();
        }else{
            TempHP_int = TempHP_int + RandomBufferInt();
        }
                        
        // Set to Player Token Pair
        this.PLAYERTOKENPAIRS[1][1] = Integer.toString(TempHP_int);
        
        // TODO - REMOVE DEBUG LINES:
        // System.out.print("\n" + TempHP_int);     
        // System.out.print("\n" + PLAYERTOKENPAIRS[1][0] + " : " + PLAYERTOKENPAIRS[1][1]);
        
    }

    public void GeneratePlayerTokenMP(int[] _SEEDVALUES){
        
        // Used to check if a value is Prime
        PrimeChecker CheckPrime = new PrimeChecker();
        // String Builder to get the Prime
        StringBuilder MPToken = new StringBuilder();
        
        for (int x = 0; x < _SEEDVALUES.length; x++){          
            if(CheckPrime.IsPrime(x)){ // If the current index is Prime
                if(CheckPrime.IsPrime(_SEEDVALUES[x])){ // If the value at the Prime index is also Prime
                    if(_SEEDVALUES[x] != 0){
                        MPToken.append(_SEEDVALUES[x]);
                    }
                }
            }
        }        
         
        // Set MP Token Pair
        this.PLAYERTOKENPAIRS[2][1] = MPToken.toString();
        
        // TODO - REMOVE DEBUG LINES:
        // System.out.print("\n" + "MP : " + MPToken + "\n");
    
    }
    
    public void SetPlayerNameToken(String pName){
        this.PLAYERTOKENPAIRS[3][1] = pName;        
    }

    public void PrintPlayerTokenPairs(){
        System.out.print("\n" + PLAYERTOKENPAIRS[3][0] + " : " + PLAYERTOKENPAIRS[3][1]); // Name
        System.out.print("\n" + PLAYERTOKENPAIRS[0][0] + " : " + PLAYERTOKENPAIRS[0][1]); // Gender
        System.out.print("\n" + PLAYERTOKENPAIRS[1][0] + " : " + PLAYERTOKENPAIRS[1][1]); // HP
        System.out.print("\n" + PLAYERTOKENPAIRS[2][0] + " : " + PLAYERTOKENPAIRS[2][1]); // MP
    }
    
    public int RandomBufferInt(){
        
        // int to Return
        int randomInt;
        
        Random randomIntGen = new Random();
        
        // Random integer from 0 - RANDOM_BUFFER
        randomInt = randomIntGen.nextInt(RANDOM_BUFFER);
        
        return randomInt;
    }

}
