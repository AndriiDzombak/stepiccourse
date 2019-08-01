package module2;

import java.util.Arrays;

public class MergeArrays {

    public static void main(String[] args) {

        int[] a1 = {1};
        int[] a2 = {2, 2, 5};



        //System.out.println(Math.max(a1[a1.length - 1], a2[a2.length - 1]));


        mergeArrays(a1, a2);

        //System.out.println(mergeArrays(a1, a2));
    }

    public static void mergeArrays(int[] a1, int[] a2) {

        int last = Math.min(a1.length, a2.length);

        for (int i = 0; i < last;) {
            if (a1[i] < a2[i]) {

            }
        }

        System.out.println(last);

    }

    /**
     * Merges two given sorted arrays into one
     *
     * @param a1 first sorted array
     * @param a2 second sorted array
     * @return new array containing all elements from a1 and a2, sorted
     */
    /*public static int[] mergeArrays(int[] a1, int[] a2) {

        int[] a = new int[a1.length + a2.length];

        for (int i = 0; i < a3.length; i++) {

            if (i < a1.length & i < a2.length) {
                a3[i] = Math.max(a1[i], a2[i]);
            }
            else if (i < a1.length | i < a2.length) {
                a3[i] =
            }
        }
        a1

        a1.
        return ...; // your implementation here
    }*/
}
