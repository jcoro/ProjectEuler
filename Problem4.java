
/**
 * Problem 4
 * A palindromic number reads the same both ways. 
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 * 
 * @author John Coronite 
 * @version 1
 */
public class Problem4 implements RunEuler {
   public static void main(String[] args) {
        System.out.println(new Problem4().run());
    }

    /**
     * Rationale:  
     * Counting down from 999 allows us to find the answer sooner.
     * If we add a condition that b >= a, we can avoid checking the same numbers multiple times.
     * We start b at 999 for each value of a, and only decrement b if it remains 
     * greater than or equal to a.
     */
    public String run() {
    	int a = 999;
    	int maxValue = -1;
    	while (a >= 100){
    		int b = 999;
    		while ( b >= a ){
    			if (a * b <= maxValue) {
    				break;
    			}
    			if (Utility.isPalindrome(a * b)) {
    				maxValue = a * b;
    			}
    			b--;    			
    		}
    		a--;
    	}    	
    	return Integer.toString(maxValue);
    }        
}
