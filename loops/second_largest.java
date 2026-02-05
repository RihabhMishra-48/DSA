package loops;
import java.util.Scanner;
public class second_largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int[] arr= new int[6];

        System.out.println("enter the elements: ");
        for (int i=0; i<arr.length;i++){
            arr[i]= sc.nextInt();
        }

        int largest=arr[0];
        int second_largest=arr[0];

        for (int i=1; i<arr.length;i++){
            if(arr[i] >largest){
                second_largest=largest;
                largest=arr[i];
            } else if (arr[i]>second_largest &&arr[i]!= largest) {
                arr[i]=second_largest;

            }

        }
        System.out.println(second_largest);
    }


}

