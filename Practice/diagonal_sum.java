package loops;

import java.util.Scanner;

public class diagonal_sum {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][3];
        System.out.println("Enter elements of 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int sum=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(i==j){
                    sum=arr[i][j];
                }
            }
        }
        System.out.println(sum);


    }
}

//given an in arr a of size n in 1 second you can increase the value of 1 element by 1 , find the min time in seconds to make the all elements of arr equal