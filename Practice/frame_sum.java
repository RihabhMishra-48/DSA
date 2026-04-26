package loops;

import java.util.Scanner;

//write programm to find the sum of frame elements of the matrix
public class frame_sum {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
        }


    }
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i==0 || j==0 || i==2 || j==2){
                sum+=arr[i][j];
            }}
        }
        System.out.println(sum);

}}
