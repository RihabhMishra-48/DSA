package loops;

import java.util.Scanner;
public class greater_count {
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
        }System.out.println(max);
        int count=0;
        for (int i=0; i<arr.length;i++){
            if (arr[i]<max){
                count=count+1;
            }
        }
        System.out.println(count);
    }
}
//the pivert index is the index wheree thrsum of num strictlry to thr lft of thr index is eqqual to the sum of all the num strictly to te index right,if the index is on the left edgw on thw array then the left sum is 0 because there are no elements to the lef tthis also apllie to the right edge of the array writte the left most pivert index if no such inex exist written-1.


