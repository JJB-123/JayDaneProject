/*
 * Class used to count the number of times a letter appears in a string.
 * Used to generate a random Seed value for calculations 
 */
package jaydaneproject;

/**
 * @author Jason Brown
 */
public class LetterCounter {
    
    public static void main(String[] args) {
        
        // String contains every letter at least once
        String TestString  = "I picked my nose and then I flicked it across the bed and it hit Jason";
        
        // For printing
        String Alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ";
        int[] totals;
        
        // Count up the letters
        totals = AlphaCount(TestString);
        
        // Print back totals
        for(int x = 0; x < Alphabet.length(); x++){
        
            System.out.print(Alphabet.charAt(x) + ":" + totals[x] + "\n");
        
        }
        
        
    }
    
    /**
    * This method displays/prints the count totals from AlphaCount()
    * Each value is prefaced by the Alpha character it's referring to.
    * <p>
    * This method returns an Array with values for each letter:
    * a = 0, b = 1, c = 2... z = 25, non-alpha = 26
    * 
    * @param  CountTotals  int[] array to display
    * @return      void
    * @see         n/a
    */
    
    public void PrintArrayValues(int[] CountTotals){
        // For printing
        String Alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ";

        // Print back totals
        for(int x = 0; x < Alphabet.length(); x++){
        
            System.out.print(Alphabet.charAt(x) + ":" + CountTotals[x] + "\n");
        
        }
    
    }
    
    /**
    * This method counts the number of times an Alpha character appears 
    * in a string.
    * <p>
    * This method returns an Array with values for each letter:
    * a = 0, b = 1, c = 2... z = 25, non-alpha = 26
    * The string is converted to UPPERCASE before counting.
    * 
    * @param  StringToCount  String to be counted
    * @return      An Array of int[] values
    * @see         n/a
    */
    
    public static int[] AlphaCount(String StringToCount) {
        // Capture totals
        int[] countTotal = new int[27];
        
        // Loop through string, convert to Uppercase - Count letter totals.
        for(int count = 0; count < StringToCount.length(); count ++){
        
            switch(Character.toUpperCase(StringToCount.charAt(count))){
                case 'A' :
                    countTotal[0] = countTotal[0] + 1; 
                    break;
                case 'B' :
                    countTotal[1] = countTotal[1] + 1;
                    break;
                case 'C' :
                    countTotal[2] = countTotal[2] + 1;
                    break;
                case 'D' :
                    countTotal[3] = countTotal[3] + 1; 
                    break;
                case 'E' :
                    countTotal[4] = countTotal[4] + 1;
                    break;
                case 'F' :
                    countTotal[5] = countTotal[5] + 1;
                    break;
                case 'G' :
                    countTotal[6] = countTotal[6] + 1; 
                    break;
                case 'H' :
                    countTotal[7] = countTotal[7] + 1;
                    break;
                case 'I' :
                    countTotal[8] = countTotal[8] + 1;
                    break;
                case 'J' :
                    countTotal[9] = countTotal[9] + 1; 
                    break;
                case 'K' :
                    countTotal[10] = countTotal[10] + 1;
                    break;
                case 'L' :
                    countTotal[11] = countTotal[11] + 1;
                    break;
                case 'M' :
                    countTotal[12] = countTotal[12] + 1; 
                    break;
                case 'N' :
                    countTotal[13] = countTotal[13] + 1;
                    break;
                case 'O' :
                    countTotal[14] = countTotal[14] + 1;
                    break;
                case 'P' :
                    countTotal[15] = countTotal[15] + 1; 
                    break;
                case 'Q' :
                    countTotal[16] = countTotal[16] + 1;
                    break;
                case 'R' :
                    countTotal[17] = countTotal[17] + 1;
                    break;
                case 'S' :
                    countTotal[18] = countTotal[18] + 1; 
                    break;
                case 'T' :
                    countTotal[19] = countTotal[19] + 1;
                    break;
                case 'U' :
                    countTotal[20] = countTotal[20] + 1;
                    break;
                case 'V' :
                    countTotal[21] = countTotal[21] + 1; 
                    break;
                case 'W' :
                    countTotal[22] = countTotal[22] + 1;
                    break;
                case 'X' :
                    countTotal[23] = countTotal[23] + 1;
                    break;
                case 'Y' :
                    countTotal[24] = countTotal[24] + 1;
                    break;
                case 'Z' :
                    countTotal[25] = countTotal[25] + 1;
                    break;
                default :
                    countTotal[26] = countTotal[26] +1;
                    break;
            }
        }
        
    return countTotal;    
    }
    
}
