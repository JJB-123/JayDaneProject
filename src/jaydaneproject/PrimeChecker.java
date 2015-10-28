/*
 */

package jaydaneproject;

/**
 * @author Jason
 */
public class PrimeChecker {
    
    /**
    * This Class returns True if the @param is Prime.
    * False if @param is not prime
    * <p>
    * @param  checkMe int value to be checked
    * @return boolean
    * @see    n/a
    */
    
    public boolean IsPrime(int checkMe){
        
        int divisor = 2; // Value to divide by - loop, increasing by 1 each time

        while(divisor <= checkMe /2){
        
            if(checkMe % divisor == 0){ // Remainder of 0 - Not prime
                return false;
            }
            divisor++;
        }
        // If reached here - no number equally divides the checkMe int
        // Return true: int is Prime
        return true;
    }
}
