package loops;
import java.util.Scanner;
public class delete_first {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int[] arr = new int[5];
//
//        for(int i= 0; i<arr.length; i++){
//            arr[i]=sc.nextInt();
//        }
//
//        for (int i = 1; i < arr.length; i++) {
//            arr[i - 1] = arr[i];
//        }
//
//        for (int i = 0; i < arr.length-1; i++) {
//            System.out.print(arr[i] + " ");
//        }
//    }

    //create array of five elements then after store the elemets then search any element from the array by linear search
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]=new int[5];

        for(int i= 0; i<arr.length; i++){
           arr[i]=sc.nextInt();
       }

        System.out.println("\nEnter element to search:");
        int key = sc.nextInt();



        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }

    }
}