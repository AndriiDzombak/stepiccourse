package module2;
import java.lang.Math;
import java.lang.Integer;

public class isPowerOfTwo {

    public static void main(String[] args) {

       System.out.println(isPowerOfTwo(-2));

       System.out.println(Integer.bitCount(9)); //check again
    }


    /**
     * Checks if given <code>value</code> is a power of two.
     *
     * @param value any number
     * @return <code>true</code> when <code>value</code> is power of two, <code>false</code> otherwise
     */
    public static boolean isPowerOfTwo(int value) {
        return (Math.log(Math.abs(value)) / Math.log(2)) % 1 == 0;
    }
}
