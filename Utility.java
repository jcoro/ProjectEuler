
/**
 * Utility Methods for Project Euler Problems.
 * 
 * @author John Coronite 
 * @version 1
 */
public class Utility
{
    /**
     * Retrieves the value of a number at a given index in a Fibonacci sequence.
     * 
     * @param  int i - the index of the number in the Fibonacci sequence.
     * @return long - the value of a number at a given index in a Fibonacci sequence. 
     */
    public static long fibonacci (int i) {
        if (i == 0) {return 0;}  
        if (i <= 2) {return 1;}
        long fibTerm = fibonacci(i - 1) + fibonacci(i - 2);
        return fibTerm;
    }
    
    /**
     * Tests if a number is prime.
     * 
     * @param  int n - the number to test for primality.
     * @return boolean - if the given number is prime. 
     */
    public static boolean isPrime (int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Negative Number");
        }  
        if (n == 0 || n == 1) {
            return false;
        } else if (n == 2){
            return true;
        } else {
            for (int i = 2; i < Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
