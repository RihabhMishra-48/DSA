package loops;
import java.util.Scanner;
public class Binary_search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,4,5,6,7,8,9};
        int start=0;
        int end=arr.length-1;
        int key=sc.nextInt();
        boolean found=false;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]>key){
                start=start;
                end=mid-1;
            }else if (arr[mid]<key) {
                start=mid+1;
            }else {
                found=true;
                System.out.println("found");
                break;
            }
        }if(!found){
            System.out.println("not found");
        }

    }

}
