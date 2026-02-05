package loops;

import java.util.Scanner;

public class euals_to {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter K:");
        int k = sc.nextInt();

        System.out.println("Enter array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == k) {
                    found = true;
                    System.out.println("Found at indices: " + i + " and " + j);
                    break;
                }
            }
            if (found) break;
        }

        if (!found) {
            System.out.println("Not found");
        }


    }
}
// given an int array a find the second largest element in the array or report that no such elemet exist