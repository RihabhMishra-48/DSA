package loops;
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int start=0;
        int end=arr.length-1;
        int temp=0;
        for(int i =0;i<arr.length/2;i++){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        for (int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    
}
