package module2;

import java.math.BigInteger;

public class Factorial {

    public static void main(String[] args) {

        System.out.println(factorial(15555));
    }


    /**
     * Calculates factorial of given <code>value</code>.
     *
     * @param value positive number
     * @return factorial of <code>value</code>
     */
    public static BigInteger factorial(int value) {

        BigInteger factorialResult = new BigInteger("1");

        for (long i = 2; i <= value; i++) {

            factorialResult = factorialResult.multiply(BigInteger.valueOf(i));
        }
        return factorialResult; // your implementation here
    }
}
