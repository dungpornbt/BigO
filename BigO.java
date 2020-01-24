package Bigo;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Random;

public class BigO {

    private static int N = 100_000;
    private static Random r = new Random();

    private static void bubblesort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[i] 
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    int[] A = new int[N];
    int[] B = new int[N];

    public static void bubble(int[] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                if (A[i] == A[j]) {
                    System.out.print(A[i] + " = " + A[j]);
                    break;
                }

            }
        }
    }

    static void Test(int[] B) {
        int n = B.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n; j *= 2) {
                B[i] = r.nextInt(N);
            }
        }
    }

    public static void main(String[] args) {

        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        long begin = System.currentTimeMillis();
        int[] arr = new int[100_000];
        Test(arr);

        System.out.println("Before : " + timestamp);
        System.out.println("Duration : " + (System.currentTimeMillis() - begin) + "milliseconds");
        //Arrays.sort(N2);
        bubblesort(arr);
        System.out.println(" ");

        System.out.println("after sort : " + timestamp);
        System.out.println("Duration : " + (System.currentTimeMillis() - begin) + "milliseconds");
    }
}
