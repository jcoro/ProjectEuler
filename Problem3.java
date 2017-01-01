
/**
 * Problem 3
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143?
 * 
 * @author John Coronite 
 * @version 1
 */
public class Problem3 implements RunEuler {
   public static void main(String[] args) {
        System.out.println(new Problem3().run());
    }

    /**
     * Rationale:
     * test dividing n by 2 then by subsequent odd numbers beginning with 3 eg: 3, 5, 7, 9, ...
     * if we find one that divides evenly (n % k == 0), we know it will be prime because it is odd and none of the previous numbers worked.
     * The fundamental theorem of arithmetic states that every integer > 1 has a unique factorization as a product of prime numbers.
     * Therefore, we can change n to n/k and eventually they will equal each other and be the largest prime factor.
     * @return String - the largest prime factor of the number 600851475143.  
     */
    public String run() {
        long n = 600851475143L;
        int k = 2;
        long lpf = 0L;
        while (n > 1) {
            while (n % k == 0){
                lpf = k;
                n = n / k;
            }
            if(k > 2) {
                k = k + 2;
            } else {
                k = 3;  
            }
        }
        return Long.toString(lpf);
    }        
}
