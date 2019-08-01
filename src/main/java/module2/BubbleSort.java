package module2;

import java.math.BigDecimal;

public class BubbleSort {


    public static void main(String[] args) {

        int[] a1 = {5, 1, 3, 4, 1, 2};
        int[] a2 = {};
        //int[] a = {5, 1, 3, 4, 1, 2};

        System.out.println(bubbleSort(a1, a2));

    }

    public static int[] bubbleSort(int[] a1, int[] a2) {

        int lengthA1 = a1.length;
        int lengthA2 = a2.length;
        int[] a = new int[lengthA1+lengthA2];
        int lengthA = a.length;
        System.arraycopy(a1, 0, a, 0, lengthA1);
        System.arraycopy(a2, 0, a, lengthA1, lengthA2);

        for (int i = 0; i < lengthA - 1; i++) {
                for (int j = 0; j < lengthA - 1 - i; j++) {
                    if (a[j] > a[j + 1]) {
                        int temp = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = temp;
                    }
                }
            }
        return a;
        }

    }
