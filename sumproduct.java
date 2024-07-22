public class Solution {

 

    public static long sumOrProduct(long n, long q) {

 

        long answer = 0;

        long mod = (long)1e9 + 7;

 

        if (q == 1) {

            /*

                Sum of first 'N' numbers is given by

                'N' * 'N + 1' / 2.

            */

            answer = (n * (n + 1)) / 2 ;

        } else {

            answer = 1 ;

            for (int i = 1 ; i <= n ; i++) {

                // Modular Arithmatic.

                i %= mod;

                answer %= mod ;

                answer = (((answer * i) % mod) + mod) % mod ;

            }

        }

return answer;
    }

    @Override
    public String toString() {
        return "Solution []";
    }
}
