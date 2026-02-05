package loops;
import java.util.Scanner;
public class max_min_array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr =new int[7];

        for(int i=0; i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
        int max=arr[0];
        for(int i=0; i<arr.length;i++){
            if( arr[i] > max){
            max=arr[i];

            }
        }
        int time=0;
        for(int i=0;i< arr.length;i++){
            time+= max-arr[i];
        }
        System.out.println(time);
    }
}

//observation= to minimize time make all elements equal to the max element in the arr
//approach= 1.find max in arr 2. for every element calculate how much it needs to be increased to reach the maximum 3.sum all those differnces

// iven an array of integers a , find and return the product array of same size where the i'th element of the product array will be equals to the product of all elements divided by the i'th element of the array